package vista;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JDesktopPane;

/**
 *
 * @author USER
 */
public class EstiloFondo extends JDesktopPane{
    private BufferedImage img;

    public EstiloFondo() {
        
        try {
            img = ImageIO.read(getClass().getResourceAsStream("/img/fondo.jpg"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    @Override
    protected void paintComponent (Graphics g){
        super.paintComponent(g);
        
        g.drawImage(img, 0, 0, null);
    }
    
    
}
