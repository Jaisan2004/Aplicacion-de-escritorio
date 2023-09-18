package controlador;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.SQLException;
import conexion.Conexion;
import java.sql.ResultSet;
import modelo.Plataforma;

/**
 *
 * @author USER
 */
public class Ctrl_Plataforma {
    
    private final String TABLA = "tb_plataforma";
    
    public boolean guardar(Plataforma objeto){
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
            System.out.println("Error al guardar la plataforma: "+e);
        }
        return respuesta;
    }
    
    public boolean verificacionExiste(String plataforma){
        boolean respuesta = false;
        String sql="select descripcion from "+TABLA+" where descripcion = '"+plataforma+"';";
        Statement st;
        
        try {
            Connection cn = (Connection) Conexion.conectar();
            st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar la plataforma: " + e);
        }
        return respuesta;
    }
    
    public boolean Actualizar(Plataforma objeto, int idPlataforma){
        boolean respuesta = false;
        Connection cn = (Connection) Conexion.conectar();
        
        try {
            
            PreparedStatement consulta = (PreparedStatement) cn.prepareStatement(
                    "update "+TABLA+" set descripcion=?, estado=? where idPlataforma = '"+idPlataforma+"';");
            consulta.setString(1, objeto.getDescripcion());
            consulta.setInt(2, objeto.getEstado());
            
            
            if(consulta.executeUpdate()> 0){
                respuesta = true;
            }
            cn.close();
            
        } catch (SQLException e) {
            System.out.println("Error al Actualizar la Plataforma: " + e);
        }
        return respuesta;
    }
    
    public boolean Eliminar(int idPlataforma){
        boolean respuesta = false;
        Connection cn = (Connection) Conexion.conectar();
        
        try {
            
            PreparedStatement consulta = (PreparedStatement) cn.prepareStatement(
                    "update "+TABLA+" set estado = 0 where idPlataforma = '"+idPlataforma+"';");
            consulta.executeUpdate();
            
            
            if(consulta.executeUpdate()> 0){
                respuesta = true;
            }
            
        } catch (SQLException e) {
            System.out.println("Error al Eliminar la Plataforma: " + e);
        }
        return respuesta;
    }
}
