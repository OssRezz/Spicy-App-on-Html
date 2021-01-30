/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoPrueba;


import dtoprueba.dtoReFactura;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;

/**
 *
 * @author james
 */
public class daoReFactura {

    dtoReFactura dtoIn = new dtoReFactura();

    Connection cn;

    public boolean guardarFactura(dtoReFactura dtoIn) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_prueba", "root", "");
            PreparedStatement pst = cn.prepareStatement("INSERT INTO tbl_proveedor(id,cedula,nombreProveedor,Correo) VALUES (?,?,?,?)");
            pst.setString(1, "0");
            pst.setString(2, dtoIn.getCedula());
            pst.setString(3, dtoIn.getNombre());
            pst.setString(4, dtoIn.getCorreo());
            pst.executeUpdate();
            cn.close();
            return true;

        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error; " + e);
        }
        return false;
    }
    
    


}
