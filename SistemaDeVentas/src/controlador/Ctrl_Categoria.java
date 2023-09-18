package controlador;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import com.mysql.jdbc.Statement;
import java.sql.SQLException;
import conexion.Conexion;
import javax.swing.table.DefaultTableModel;
import modelo.Categoria;

/**
 *
 * @author USER
 */
public class Ctrl_Categoria {
    
    private final String TABLA = "tb_categoria";
    //metodo para registrar categoria
    public boolean guardar(Categoria objeto){
        boolean respuesta = false;
        Connection cn = (Connection) Conexion.conectar();
        
        try {
            
            PreparedStatement consulta = (PreparedStatement) cn.prepareStatement("insert into "+TABLA+" values (?,?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getDescripcion());
            consulta.setInt(3, objeto.getEstado());
            
            if(consulta.executeUpdate()> 0){
                respuesta = true;
            }
            
        } catch (SQLException e) {
            System.out.println("Error al guarda la categoria: " + e);
        }
        return respuesta;
    }
    
    public boolean verificacionExiste(String categoria){
        boolean respuesta = false;
        String sql="select descripcion from "+TABLA+" where descripcion = '"+categoria+"';";
        Statement st;
        
        try {
            Connection cn = (Connection) Conexion.conectar();
            st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar la categoria: " + e);
        }
        return respuesta;
    }
    
    public boolean Actualizar(Categoria objeto, int idCategoria){
        boolean respuesta = false;
        Connection cn = (Connection) Conexion.conectar();
        
        try {
            
            PreparedStatement consulta = (PreparedStatement) cn.prepareStatement(
                    "update "+TABLA+" set descripcion=?, estado=? where idCategoria = '"+idCategoria+"';");
            consulta.setString(1, objeto.getDescripcion());
            consulta.setInt(2, objeto.getEstado());
            
            
            if(consulta.executeUpdate()> 0){
                respuesta = true;
            }
            cn.close();
            
        } catch (SQLException e) {
            System.out.println("Error al Actualizar la Categoria: " + e);
        }
        return respuesta;
    }
    
    public boolean Eliminar(int idCategoria){
        boolean respuesta = false;
        Connection cn = (Connection) Conexion.conectar();
        
        try {
            
            PreparedStatement consulta = (PreparedStatement) cn.prepareStatement(
                    "update "+TABLA+" set estado = 0 where idCategoria = '"+idCategoria+"';");
            consulta.executeUpdate();
            
            
            if(consulta.executeUpdate()> 0){
                respuesta = true;
            }
            
        } catch (SQLException e) {
            System.out.println("Error al Eliminar la Categoria: " + e);
        }
        return respuesta;
    }
    
    
    
}
