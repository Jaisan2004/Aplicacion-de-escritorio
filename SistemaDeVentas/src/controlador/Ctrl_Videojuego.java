package controlador;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import conexion.Conexion;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Categoria;
import modelo.Videojuego;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author USER
 */
public class Ctrl_Videojuego {

    private final String TABLA = "tb_videojuego";

    //metodo para registrar categoria
    public boolean guardar(Videojuego objeto) {
        boolean respuesta = false;
        Connection cn = (Connection) Conexion.conectar();

        try {

            PreparedStatement consulta = (PreparedStatement) cn.prepareStatement("insert into " + TABLA + " values (?,?,?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getNombre());
            consulta.setInt(3, objeto.getCantidad());
            consulta.setDouble(4, objeto.getPrecio());
            consulta.setString(5, objeto.getDescripcion());
            consulta.setInt(6, objeto.getPorcentajeIva());
            consulta.setInt(7, objeto.getIdCategoria());
            consulta.setInt(8, objeto.getIdPlataforma());
            consulta.setInt(9, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al guarda el Videojuego: " + e);
        }
        return respuesta;
    }

    public boolean verificacionExiste(String videojuego, String descripcion, int idPlataforma) {
        boolean respuesta = false;
        String sql = "select nombre, descripcion from " + TABLA + " where nombre = '" + videojuego + "' and descripcion = '" + descripcion + "'"
                + "and idPlataforma= '"+idPlataforma+"';";
        Statement st;

        try {
            Connection cn = (Connection) Conexion.conectar();
            st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar el Videojuego: " + e);
        }
        return respuesta;
    }

    public boolean Actualizar(Videojuego objeto, int idVideojuego) {
        boolean respuesta = false;
        Connection cn = (Connection) Conexion.conectar();

        try {

            PreparedStatement consulta = (PreparedStatement) cn.prepareStatement(
                    "update " + TABLA + " set nombre=?, cantidad=?, precio=?, descripcion=?, porcentajeIva=?,"
                    + "idCategoria=?, idPlataforma=?, estado=? where idVideojuego = '" + idVideojuego + "';");
            consulta.setString(1, objeto.getNombre());
            consulta.setInt(2, objeto.getCantidad());
            consulta.setDouble(3, objeto.getPrecio());
            consulta.setString(4, objeto.getDescripcion());
            consulta.setInt(5, objeto.getPorcentajeIva());
            consulta.setInt(6, objeto.getIdCategoria());
            consulta.setInt(7, objeto.getIdPlataforma());
            consulta.setInt(8, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al Actualizar la Videojuego: " + e);
        }
        return respuesta;
    }

    public boolean Eliminar(int idVideojuego) {
        boolean respuesta = false;
        Connection cn = (Connection) Conexion.conectar();

        try {

            PreparedStatement consulta = (PreparedStatement) cn.prepareStatement(
                    "update " + TABLA + " set estado = 0 where idVideojuego = '" + idVideojuego + "';");
            consulta.executeUpdate();

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al Eliminar la Videojuego: " + e);
        }
        return respuesta;
    }

    public void cargaMasiva(String archivo) throws IOException {
        int estado= 1;
        int id = 0;
        PreparedStatement ps;
        try {
            Connection cn = (Connection) Conexion.conectar();
            FileInputStream file = new FileInputStream(new File(archivo));

            XSSFWorkbook wb = new XSSFWorkbook(file);
            XSSFSheet sheet = wb.getSheetAt(0);

            int numFilas = sheet.getLastRowNum();

            for (int i = 1; i <= numFilas; i++) {
                Row fila = sheet.getRow(i);

                ps = (PreparedStatement) cn.prepareStatement("insert into " + TABLA + " (nombre, cantidad, precio, descripcion, porcentajeIva, idCategoria, idPlataforma, estado) "
                        + "values (?,?,?,?,?,?,?,?);");
                if (!verificacionExiste(fila.getCell(0).getStringCellValue(), fila.getCell(3).getStringCellValue(), 
                       (int) fila.getCell(6).getNumericCellValue() )) {
                    
                    
                    ps.setString(1, fila.getCell(0).getStringCellValue());
                    System.out.println(fila.getCell(0).getStringCellValue());
                    ps.setInt(2, (int) (fila.getCell(1).getNumericCellValue()));
                    System.out.println(fila.getCell(1).getNumericCellValue());
                    
                    ps.setDouble(3, fila.getCell(2).getNumericCellValue());
                    ps.setString(4, fila.getCell(3).getStringCellValue());
                    ps.setInt(5, (int) fila.getCell(4).getNumericCellValue());
                    ps.setInt(6, (int) fila.getCell(5).getNumericCellValue());
                    ps.setInt(7, (int) fila.getCell(6).getNumericCellValue());
                    ps.setInt(8, estado);
                    
                    //JOptionPane.showMessageDialog(null, "Carga masiva completa");
                }else{
                    int numerofila = numFilas+1;
                    JOptionPane.showMessageDialog(null, "¡El video juego en la fila: "+numerofila+" ya exete!");
                }
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al Cargar masivamente los Videojuego: " + e);
        }
    }

}
