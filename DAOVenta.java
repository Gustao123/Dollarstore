/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import modelo.conexion.conexion;

/**
 *
 * @author juriel
 */
public class DAOVenta {
    conexion conectar=conexion.getInstancia();
    
    public int insertarventa(venta vent)throws SQLException{
        try{
            CallableStatement st =conectar.conectar()
                    .prepareCall("{CALL sp_venta(?,?,?)}");
            st.setInt(1, vent.getCliente_id());
            st.setDate(2, (Date) vent.getFecha());
            st.setFloat(3, vent.getPago());
            st.executeUpdate();
        }catch(SQLException e){
             System.out.println(e+"Error");
          conectar.cerrarConexion();
          return -1;
        }
         conectar.cerrarConexion();
      return 0;
    }
    
    public int insertardetalleventa(venta vent)throws SQLException{
        try{
            CallableStatement st =conectar.conectar().
                    prepareCall("{CALL sp_detalle_venta(?,?,?,?)}");
            st.setInt(1, vent.getCantidad());
            st.setFloat(2, vent.getPrecioUnitario());
            st.setInt(3, vent.getVenta_id());
            st.setInt(4, vent.getProducto_id());
            st.executeUpdate();
        }catch(SQLException e){
            System.out.println(e+"Error");
            conectar.cerrarConexion();
            return -1;
        }
       conectar.cerrarConexion();
       return 0;
    }
    
      
    public int actualizarExistenciaProducto(producto pro)throws  SQLException{
        try{
            CallableStatement st=conectar.conectar().
                    prepareCall("{CALL actualizarExistenciapro}");
            st.setInt(1, pro.getExistencia());
            st.setInt(2, pro.getProducto_id());
            st.executeUpdate();
            
            return 0;
        }catch(SQLException e){
            System.out.println("No se a realizado la consulta:"+e.getMessage());
            return -1;
        }
    }
          public int obtenerUltimoventaid()throws SQLException{
        int ventaid=0;
        ResultSet rs = null;
        try{
            CallableStatement st=conectar.conectar().
                    prepareCall("{CALL obtenerUltimoventaid()}");
            rs = st.executeQuery();
            if(rs.next()){
                ventaid = rs.getInt(1);
            }
            return ventaid;
        }catch(SQLException e){
            System.out.println("No se a realizado la consulta:"+ e.getMessage());
            return 0;
        }
    
    }
    
}


