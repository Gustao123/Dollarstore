/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.io.StringWriter;
import modelo.conexion.conexion;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 *
 * @author juriel
 */
public class DAOProveedor {
    
    conexion conectar=conexion.getInstancia();
    
    public List ObtenerDatos() throws SQLException{
        String proced="listarproveedor()";
        
        List<Map> registro=new DataBase().listar(proced);
        List<proveedor> proveedores =new ArrayList();
        
        for (Map registros : registro ){
            proveedor pr=new proveedor((int)registros.get("proveedor_id"),
                    (String) registros.get("company"),
                    (String) registros.get("telefono"),
                    (String) registros.get("correo_electro"));
            proveedores.add(pr);
            
        }
        return proveedores;
    }
     public int insertar(proveedor pr) throws SQLException{
        try{
            CallableStatement st=conectar.conectar().
                    prepareCall("{CALL sp_proveedor(?,?,?)}");
            st.setString(1, pr.getCompany());
            st.setString(2, pr.getTelefono());
            st.setString(3, pr.getCorreo_electro());
            st.executeUpdate();
       }catch(SQLException e){
            System.out.println(e+"Error");
            conectar.cerrarConexion();
            return -1;
       }
        conectar.cerrarConexion();
        return 0;
    } 
        public int Actualizar(proveedor pr)throws SQLException{
          try{
              CallableStatement st=conectar.conectar().
                      prepareCall("{CALL actualizar_proveedor(?,?,?,?)}");
              st.setInt(1, pr.getproveedor_id());
              st.setString(2, pr.getCompany());
              st.setString(3, pr.getTelefono());
              st.setString(4, pr.getCorreo_electro());
              st.executeUpdate();
              
              
          }catch(SQLException e){
              System.out.println(e+"Error");
              conectar.cerrarConexion();
              return -1;
          }
          conectar.cerrarConexion();
          return 0;
      }
        
 public int delete(int id)throws SQLException{
          try{
              CallableStatement st=conectar.conectar().
                      prepareCall("{CALL Eliminar_proveedor(?)}");
              st.setInt(1, id);
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
