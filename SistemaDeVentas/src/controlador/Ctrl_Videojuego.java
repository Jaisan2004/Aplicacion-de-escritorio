package controlador;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import conexion.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Categoria;
import modelo.Videojuego;

/**
 *
 * @author USER
 */
public class Ctrl_Videojuego {
    
     private final String TABLA = "tb_videojuego";
    //metodo para registrar categoria
    public boolean guardar(Videojuego objeto){
        boolean respuesta = false;
        Connection cn = (Connection) Conexion.conectar();
        
        try {
            
            PreparedStatement consulta = (PreparedStatement) cn.prepareStatement("insert into "+TABLA+" values (?,?,?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getNombre());
            consulta.setInt(3, objeto.getCantidad());
            consulta.setDouble(4, objeto.getPrecio());
            consulta.setString(5, objeto.getDescripcion());
            consulta.setInt(6, objeto.getPorcentajeIva());
            consulta.setInt(7, objeto.getIdCategoria());
            consulta.setInt(8, objeto.getIdPlataforma());
            consulta.setInt(9, objeto.getEstado());
            
            if(consulta.executeUpdate()> 0){
                respuesta = true;
            }
            
        } catch (SQLException e) {
            System.out.println("Error al guarda el Videojuego: " + e);
        }
        return respuesta;
    }
    
    public boolean verificacionExiste(String videojuego, String descripcion){
        boolean respuesta = false;
        String sql="select nombre, descripcion from "+TABLA+" where nombre = '"+videojuego+"' and descripcion = '"+descripcion+"';";
        Statement st;
        
        try {
            Connection cn = (Connection) Conexion.conectar();
            st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar el Videojuego: " + e);
        }
        return respuesta;
    }
    
    public boolean Actualizar(Videojuego objeto, int idVideojuego){
        boolean respuesta = false;
        Connection cn = (Connection) Conexion.conectar();
        
        try {
            
            PreparedStatement consulta = (PreparedStatement) cn.prepareStatement(
                    "update "+TABLA+" set nombre=?, cantidad=?, precio=?, descripcion=?, porcentajeIva=?,"
                            + "idCategoria=?, idPlataforma=?, estado=? where idVideojuego = '"+idVideojuego+"';");
            consulta.setString(1, objeto.getNombre());
            consulta.setInt(2, objeto.getCantidad());
            consulta.setDouble(3, objeto.getPrecio());
            consulta.setString(4, objeto.getDescripcion());
            consulta.setInt(5, objeto.getPorcentajeIva());
            consulta.setInt(6, objeto.getIdCategoria());
            consulta.setInt(7, objeto.getIdPlataforma());
            consulta.setInt(8, objeto.getEstado());
                        
            
            if(consulta.executeUpdate()> 0){
                respuesta = true;
            }
            cn.close();
            
        } catch (SQLException e) {
            System.out.println("Error al Actualizar la Videojuego: " + e);
        }
        return respuesta;
    }
    
    public boolean Eliminar(int idVideojuego){
        boolean respuesta = false;
        Connection cn = (Connection) Conexion.conectar();
        
        try {
            
            PreparedStatement consulta = (PreparedStatement) cn.prepareStatement(
                    "update "+TABLA+" set estado = 0 where idVideojuego = '"+idVideojuego+"';");
            consulta.executeUpdate();
            
            
            if(consulta.executeUpdate()> 0){
                respuesta = true;
            }
            
        } catch (SQLException e) {
            System.out.println("Error al Eliminar la Videojuego: " + e);
        }
        return respuesta;
    }
    

}
