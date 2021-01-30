/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoPrueba;

import dtoprueba.dtoRegistroAlumno;
import java.sql.*;

/**
 * public boolean guardarFactura(dtoReFactura dtoIn) { try {
 * Class.forName("com.mysql.jdbc.Driver"); cn =
 * DriverManager.getConnection("jdbc:mysql://localhost/bd_prueba", "root", "");
 * PreparedStatement pst = cn.prepareStatement("INSERT INTO
 * tbl_proveedor(id,cedula,nombreProveedor,Correo) VALUES (?,?,?,?)");
 * pst.setString(1, "0"); pst.setString(2, dtoIn.getCedula()); pst.setString(3,
 * dtoIn.getNombre()); pst.setString(4, dtoIn.getCorreo()); pst.executeUpdate();
 * cn.close(); return true;
 *
 * } catch (ClassNotFoundException | SQLException e) {
 * System.err.println("Error; " + e); } return false; }
 *
 * @author james dtoRegistroAlumno dtoIn= new dtoRegistroAlumno();
 */
public class daoRegistroAlumno {

    Connection conexion;

    public boolean guardarAlumno(dtoRegistroAlumno dtoAlumno) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd_prueba", "root", "");
            PreparedStatement savealumno = conexion.prepareStatement("INSERT INTO tbl_proveedor(id,cedula,nombreProveedor,Correo) VALUES (?,?,?,?)");
            savealumno.setString(1, "0");
            savealumno.setString(2, dtoAlumno.getCedula());
            savealumno.setString(3, dtoAlumno.getNombre());
            savealumno.setString(4, dtoAlumno.getCorreo());
            savealumno.executeUpdate();
            conexion.close();
            return true;
        } catch (ClassNotFoundException | SQLException e) {
            return false;
        }

    }
    
    
        public boolean eliminarAlumno(dtoRegistroAlumno dtoAlumno) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd_prueba", "root", "");
            PreparedStatement savealumno = conexion.prepareStatement("INSERT INTO tbl_proveedor(id,cedula,nombreProveedor,Correo) VALUES (?,?,?,?)");
            savealumno.setString(1, "0");
            savealumno.setString(2, dtoAlumno.getCedula());
            savealumno.setString(3, dtoAlumno.getNombre());
            savealumno.setString(4, dtoAlumno.getCorreo());
            savealumno.executeUpdate();
            conexion.close();
            return true;
        } catch (ClassNotFoundException | SQLException e) {
            return false;
        }

    }
        
            public boolean ActualizarAlumno(dtoRegistroAlumno dtoAlumno) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd_prueba", "root", "");
            PreparedStatement savealumno = conexion.prepareStatement("INSERT INTO tbl_proveedor(id,cedula,nombreProveedor,Correo) VALUES (?,?,?,?)");
            savealumno.setString(1, "0");
            savealumno.setString(2, dtoAlumno.getCedula());
            savealumno.setString(3, dtoAlumno.getNombre());
            savealumno.setString(4, dtoAlumno.getCorreo());
            savealumno.executeUpdate();
            conexion.close();
            return true;
        } catch (ClassNotFoundException | SQLException e) {
            return false;
        }

    }

}
