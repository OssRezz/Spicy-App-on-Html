/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoPrueba;

import dtoprueba.dtoInsertProductos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;

/**
 *
 * @author james
 */
public class daoProducto {

    dtoInsertProductos dtoIn = new dtoInsertProductos();
    Connection conexion;

    public boolean guardarProducto(dtoInsertProductos dtoProducto) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd_prueba", "root", "");
            PreparedStatement saveProduct = conexion.prepareStatement("INSERT INTO TBL_PRODUCTO(id,nombreProducto,valorUnidad,Cantidad,uMedida) VALUES (?,?,?,?,?)");
            saveProduct.setString(1, "0");
            saveProduct.setString(2, dtoProducto.getNombreProducto());
            saveProduct.setString(3, dtoProducto.getValorUnidad());
            saveProduct.setString(4, dtoProducto.getCantidad());
            saveProduct.setString(5, dtoProducto.getuMedida());
            saveProduct.executeUpdate();
            conexion.close();
            return true;

        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error; " + e);
        }
        return false;
    }

}
