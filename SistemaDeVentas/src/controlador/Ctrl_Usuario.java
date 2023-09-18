/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import conexion.Conexion;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author USER
 */
public class Ctrl_Usuario {
    
    //metodo iniciar sesion
    public boolean loginUser(Usuario objeto){
        
        boolean respuesta =false;
        
        Connection cn = (Connection) Conexion.conectar();
        String sql = "select usuario, password from tb_usuario where usuario='"+ objeto.getUsuario() +"' and password "
                + "= '"+ objeto.getPassword() +"';";
        Statement st;
        try {
            
            st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                respuesta = true;
            }
            
        } catch (SQLException e) {
            System.out.println("Error: al iniciar Sesion");
            JOptionPane.showMessageDialog(null, "Error: al iniciar Sesion "+e);
        }
        return respuesta;
    }
    
}
