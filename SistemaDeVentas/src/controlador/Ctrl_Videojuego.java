package controlador;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import conexion.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
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
    
    public boolean verificacionExiste(String videojuego){
        boolean respuesta = false;
        String sql="select nombre from "+TABLA+" where nombre = '"+videojuego+"';";
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
}
