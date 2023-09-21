/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;

/**
 *
 * @author USER
 */
public class Format_Videojuego {
    public static void main(String[] args){
        crearExcel();
    }

    public static void crearExcel() {

        Workbook book = new SXSSFWorkbook();
        Sheet sheet = book.createSheet("Videojuegos");
        String[] cabecero = {"Nombre", "Cantidad", "Precio", "Descripcion", "Iva", "idCategoria", "idPlataforma"};
        Row row = sheet.createRow(0);
        

        
        for (int i = 0; i < 7; i++) {
            System.out.println(cabecero[i]);
            sheet.setColumnWidth(i, 6000);
            row.createCell(i).setCellValue(cabecero[i]);
            
        }
        
        String ubicacionSalida = "C:/Users/USER/Downloads/";
        String nombre = "Formato_Carga_videojuegos.xlsx";

        try {
            FileOutputStream fileout = new FileOutputStream(ubicacionSalida+nombre);
            book.write(fileout);
            JOptionPane.showMessageDialog(null,"El archivo ya se encuentra descargado: revise sus descargas");
            fileout.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Format_Videojuego.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Fallo al crear el documento1");
        } catch (IOException ex) {
            Logger.getLogger(Format_Videojuego.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Fallo al crear el documento1");
        }
    }

}