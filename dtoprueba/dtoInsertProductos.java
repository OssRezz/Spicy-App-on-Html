/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtoprueba;
import java.sql.*;

/**
 *
 * @author james
 */
public class dtoInsertProductos {
    
       //Datos Productos  
    public String nombreProducto;
    public String valorUnidad;
    public String Cantidad;
    public String uMedida;

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getValorUnidad() {
        return valorUnidad;
    }

    public void setValorUnidad(String valorUnidad) {
        this.valorUnidad = valorUnidad;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getuMedida() {
        return uMedida;
    }

    public void setuMedida(String uMedida) {
        this.uMedida = uMedida;
    }
    

    
}
