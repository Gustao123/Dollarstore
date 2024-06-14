/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.sql.CallableStatement;
import java.awt.HeadlessException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Map;
import java.util.List;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import modelo.conexion.conexion;
/**
 *
 * @author juriel
 */
public class DAOCategoria {
    conexion conectar=conexion.getInstancia();
    
    public List obtenerDatos()throws SQLException{
        String proced="listarcategoria()";
        
        List<Map> registro=new DataBase().listar(proced);
        List<categoria> categorias=new ArrayList();
        
        for(Map registros : registro){
            categoria ct=new categoria((int)registros.get("categoria_id"),
            (String)registros.get("descripcion"));
            categorias.add(ct);
        }
        return categorias;
    }
    public int insertar(categoria ct)throws SQLException{
        try{
            CallableStatement st=conectar.conectar().
                    prepareCall("{CALL sp_categoria(?)}");
            st.setString(1, ct.getDescripcion());
            st.executeUpdate();
        }catch(SQLException e){
            System.out.println(e+"Error");
            conectar.cerrarConexion();
            return -1;
        }
        conectar.cerrarConexion();
        return 0;
    }
    
    
    public int Actualizar(categoria cat)throws SQLException{
        try {
            CallableStatement st=conectar.conectar().
                    prepareCall("{CALL actualizar_categoria(?,?)}");
            st.setInt(1, cat.getCategoria_id());
            st.setString(2, cat.getDescripcion());
            st.executeUpdate();
           
        }catch(SQLException e){
              System.out.println(e+"Error");
              conectar.cerrarConexion();
              return -1;
        }
         conectar.cerrarConexion();
          return 0;
    }
}
