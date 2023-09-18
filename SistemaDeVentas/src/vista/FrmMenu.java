
package vista;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JDesktopPane;

/**
 *
 * @author USER
 */
public class FrmMenu extends javax.swing.JFrame {
    
    public static JDesktopPane jDesktopPane_menu;

    public FrmMenu() {
        initComponents();
        this.setSize(new Dimension(1200, 700));
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setTitle("Sistema de ventas de videojuegos");
        
        this.setLayout(null);
        jDesktopPane_menu = new EstiloFondo();
        
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        this.jDesktopPane_menu.setBounds(0,0, ancho, (alto-110));
        this.add(jDesktopPane_menu);
            }
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/aplicacion.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1_nuevo_usuario = new javax.swing.JMenuItem();
        jMenuItem2_gestionar_usuario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3_nuevo_videojuego = new javax.swing.JMenuItem();
        jMenuItem4_gestionar_videojuegos = new javax.swing.JMenuItem();
        jMenuItem5_actualizar_stock = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6_nuevo_cliente = new javax.swing.JMenuItem();
        jMenuItem7_gestionar_clientes = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem8_nueva_categoria = new javax.swing.JMenuItem();
        jMenuItem9_gestionar_categorias = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem10_nueva_plataforma = new javax.swing.JMenuItem();
        jMenuItem11_gestionar_plataformas = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem12_nueva_venta = new javax.swing.JMenuItem();
        jMenuItem13_gestionar_ventas = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem14_reportes_cliente = new javax.swing.JMenuItem();
        jMenuItem15_reportes_categorias = new javax.swing.JMenuItem();
        jMenuItem16_reportes_plataforma = new javax.swing.JMenuItem();
        jMenuItem17_reportes_videojuegos = new javax.swing.JMenuItem();
        jMenuItem18_reportes_ventas = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem19_ver_historial = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem20_cerrar_sesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(133, 50));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.png"))); // NOI18N
        jMenu1.setText("Usuario");
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(155, 50));

        jMenuItem1_nuevo_usuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem1_nuevo_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar-usuario.png"))); // NOI18N
        jMenuItem1_nuevo_usuario.setText("Nuevo Usuario");
        jMenuItem1_nuevo_usuario.setPreferredSize(new java.awt.Dimension(300, 40));
        jMenu1.add(jMenuItem1_nuevo_usuario);

        jMenuItem2_gestionar_usuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem2_gestionar_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuraciones.png"))); // NOI18N
        jMenuItem2_gestionar_usuario.setText("Gestionar Usuarios");
        jMenuItem2_gestionar_usuario.setPreferredSize(new java.awt.Dimension(300, 40));
        jMenuItem2_gestionar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2_gestionar_usuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2_gestionar_usuario);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/videojuego.png"))); // NOI18N
        jMenu2.setText("Videojuegos");
        jMenu2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(160, 50));

        jMenuItem3_nuevo_videojuego.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem3_nuevo_videojuego.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevoJuego.png"))); // NOI18N
        jMenuItem3_nuevo_videojuego.setText("Nuevo Videojuego");
        jMenuItem3_nuevo_videojuego.setPreferredSize(new java.awt.Dimension(300, 40));
        jMenuItem3_nuevo_videojuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3_nuevo_videojuegoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3_nuevo_videojuego);

        jMenuItem4_gestionar_videojuegos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem4_gestionar_videojuegos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gestionar juegos.png"))); // NOI18N
        jMenuItem4_gestionar_videojuegos.setText("Gestionar Videojuego");
        jMenuItem4_gestionar_videojuegos.setPreferredSize(new java.awt.Dimension(300, 40));
        jMenu2.add(jMenuItem4_gestionar_videojuegos);

        jMenuItem5_actualizar_stock.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem5_actualizar_stock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/stock.png"))); // NOI18N
        jMenuItem5_actualizar_stock.setText("Actualizar Stock");
        jMenuItem5_actualizar_stock.setPreferredSize(new java.awt.Dimension(300, 40));
        jMenu2.add(jMenuItem5_actualizar_stock);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        jMenu3.setText("Cliente");
        jMenu3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu3.setPreferredSize(new java.awt.Dimension(155, 50));

        jMenuItem6_nuevo_cliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem6_nuevo_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-cliente.png"))); // NOI18N
        jMenuItem6_nuevo_cliente.setText("Nuevo Cliente");
        jMenuItem6_nuevo_cliente.setPreferredSize(new java.awt.Dimension(258, 40));
        jMenuItem6_nuevo_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6_nuevo_clienteActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6_nuevo_cliente);

        jMenuItem7_gestionar_clientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem7_gestionar_clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gestion-clientes.png"))); // NOI18N
        jMenuItem7_gestionar_clientes.setText("Gestionar Clientes");
        jMenuItem7_gestionar_clientes.setPreferredSize(new java.awt.Dimension(258, 40));
        jMenu3.add(jMenuItem7_gestionar_clientes);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/categoria.png"))); // NOI18N
        jMenu4.setText("Categoria");
        jMenu4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu4.setPreferredSize(new java.awt.Dimension(155, 50));

        jMenuItem8_nueva_categoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem8_nueva_categoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nueva-categoria.png"))); // NOI18N
        jMenuItem8_nueva_categoria.setText("Nueva Categoria");
        jMenuItem8_nueva_categoria.setPreferredSize(new java.awt.Dimension(300, 40));
        jMenuItem8_nueva_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8_nueva_categoriaActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8_nueva_categoria);

        jMenuItem9_gestionar_categorias.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem9_gestionar_categorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/categoria.png"))); // NOI18N
        jMenuItem9_gestionar_categorias.setText("Gestionar Categorias");
        jMenuItem9_gestionar_categorias.setPreferredSize(new java.awt.Dimension(300, 40));
        jMenuItem9_gestionar_categorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9_gestionar_categoriasActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9_gestionar_categorias);

        jMenuBar1.add(jMenu4);

        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/plataforma.png"))); // NOI18N
        jMenu9.setText("Plataforma");
        jMenu9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu9.setPreferredSize(new java.awt.Dimension(155, 50));

        jMenuItem10_nueva_plataforma.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem10_nueva_plataforma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nueva-plataforma.png"))); // NOI18N
        jMenuItem10_nueva_plataforma.setText("Nueva Plataforma");
        jMenuItem10_nueva_plataforma.setPreferredSize(new java.awt.Dimension(300, 40));
        jMenuItem10_nueva_plataforma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10_nueva_plataformaActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem10_nueva_plataforma);

        jMenuItem11_gestionar_plataformas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem11_gestionar_plataformas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gestion-plataforma.png"))); // NOI18N
        jMenuItem11_gestionar_plataformas.setText("Gestionar Plataformas");
        jMenuItem11_gestionar_plataformas.setPreferredSize(new java.awt.Dimension(300, 40));
        jMenuItem11_gestionar_plataformas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11_gestionar_plataformasActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem11_gestionar_plataformas);

        jMenuBar1.add(jMenu9);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/factura.png"))); // NOI18N
        jMenu5.setText("Facturar");
        jMenu5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu5.setPreferredSize(new java.awt.Dimension(155, 50));

        jMenuItem12_nueva_venta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem12_nueva_venta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nueva-factura.png"))); // NOI18N
        jMenuItem12_nueva_venta.setText("Nueva Venta");
        jMenuItem12_nueva_venta.setPreferredSize(new java.awt.Dimension(250, 30));
        jMenu5.add(jMenuItem12_nueva_venta);

        jMenuItem13_gestionar_ventas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem13_gestionar_ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gestion-ventas.png"))); // NOI18N
        jMenuItem13_gestionar_ventas.setText("Gestionar Ventas");
        jMenuItem13_gestionar_ventas.setPreferredSize(new java.awt.Dimension(250, 30));
        jMenu5.add(jMenuItem13_gestionar_ventas);

        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte.png"))); // NOI18N
        jMenu6.setText("Reportes");
        jMenu6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu6.setPreferredSize(new java.awt.Dimension(155, 50));

        jMenuItem14_reportes_cliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem14_reportes_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenuItem14_reportes_cliente.setText("Reportes Cliente");
        jMenuItem14_reportes_cliente.setPreferredSize(new java.awt.Dimension(250, 30));
        jMenu6.add(jMenuItem14_reportes_cliente);

        jMenuItem15_reportes_categorias.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem15_reportes_categorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenuItem15_reportes_categorias.setText("Reportes Categorias");
        jMenuItem15_reportes_categorias.setPreferredSize(new java.awt.Dimension(250, 30));
        jMenu6.add(jMenuItem15_reportes_categorias);

        jMenuItem16_reportes_plataforma.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem16_reportes_plataforma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenuItem16_reportes_plataforma.setText("Reportes Plataforma");
        jMenuItem16_reportes_plataforma.setPreferredSize(new java.awt.Dimension(250, 30));
        jMenu6.add(jMenuItem16_reportes_plataforma);

        jMenuItem17_reportes_videojuegos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem17_reportes_videojuegos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenuItem17_reportes_videojuegos.setText("Reportes Videojuegos");
        jMenuItem17_reportes_videojuegos.setPreferredSize(new java.awt.Dimension(250, 30));
        jMenu6.add(jMenuItem17_reportes_videojuegos);

        jMenuItem18_reportes_ventas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem18_reportes_ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenuItem18_reportes_ventas.setText("Reportes Ventas");
        jMenuItem18_reportes_ventas.setPreferredSize(new java.awt.Dimension(250, 30));
        jMenu6.add(jMenuItem18_reportes_ventas);

        jMenuBar1.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/historial.png"))); // NOI18N
        jMenu7.setText("Historial");
        jMenu7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu7.setPreferredSize(new java.awt.Dimension(140, 50));

        jMenuItem19_ver_historial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem19_ver_historial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/historial1.png"))); // NOI18N
        jMenuItem19_ver_historial.setText("Ver Historial");
        jMenuItem19_ver_historial.setPreferredSize(new java.awt.Dimension(250, 30));
        jMenu7.add(jMenuItem19_ver_historial);

        jMenuBar1.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        jMenu8.setText("Cerrar Sesión");
        jMenu8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu8.setMinimumSize(new java.awt.Dimension(156, 50));
        jMenu8.setPreferredSize(new java.awt.Dimension(162, 50));

        jMenuItem20_cerrar_sesion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem20_cerrar_sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        jMenuItem20_cerrar_sesion.setText("Cerrar Sesión");
        jMenuItem20_cerrar_sesion.setPreferredSize(new java.awt.Dimension(250, 30));
        jMenu8.add(jMenuItem20_cerrar_sesion);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jMenuItem2_gestionar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2_gestionar_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2_gestionar_usuarioActionPerformed

    private void jMenuItem6_nuevo_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6_nuevo_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6_nuevo_clienteActionPerformed

    private void jMenuItem8_nueva_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8_nueva_categoriaActionPerformed
        InterCategoria interCategoria = new InterCategoria();
        jDesktopPane_menu.add(interCategoria);
        interCategoria.setVisible(true);
    }//GEN-LAST:event_jMenuItem8_nueva_categoriaActionPerformed

    private void jMenuItem10_nueva_plataformaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10_nueva_plataformaActionPerformed
        InterPlataforma interPlataforma =new InterPlataforma();
        jDesktopPane_menu.add(interPlataforma);
        interPlataforma.setVisible(true);
    }//GEN-LAST:event_jMenuItem10_nueva_plataformaActionPerformed

    private void jMenuItem9_gestionar_categoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9_gestionar_categoriasActionPerformed
        InterGestionarCategorias categorias = new InterGestionarCategorias();
        jDesktopPane_menu.add(categorias);
        categorias.setVisible(true);
    }//GEN-LAST:event_jMenuItem9_gestionar_categoriasActionPerformed

    private void jMenuItem11_gestionar_plataformasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11_gestionar_plataformasActionPerformed
        InterGestionarPlataforma gestionarPlataforma = new InterGestionarPlataforma();
        jDesktopPane_menu.add(gestionarPlataforma);
        gestionarPlataforma.setVisible(true);
    }//GEN-LAST:event_jMenuItem11_gestionar_plataformasActionPerformed

    private void jMenuItem3_nuevo_videojuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3_nuevo_videojuegoActionPerformed
        InterVideojuego interVideojuego = new InterVideojuego();
        jDesktopPane_menu.add(interVideojuego);
        interVideojuego.setVisible(true);
    }//GEN-LAST:event_jMenuItem3_nuevo_videojuegoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10_nueva_plataforma;
    private javax.swing.JMenuItem jMenuItem11_gestionar_plataformas;
    private javax.swing.JMenuItem jMenuItem12_nueva_venta;
    private javax.swing.JMenuItem jMenuItem13_gestionar_ventas;
    private javax.swing.JMenuItem jMenuItem14_reportes_cliente;
    private javax.swing.JMenuItem jMenuItem15_reportes_categorias;
    private javax.swing.JMenuItem jMenuItem16_reportes_plataforma;
    private javax.swing.JMenuItem jMenuItem17_reportes_videojuegos;
    private javax.swing.JMenuItem jMenuItem18_reportes_ventas;
    private javax.swing.JMenuItem jMenuItem19_ver_historial;
    private javax.swing.JMenuItem jMenuItem1_nuevo_usuario;
    private javax.swing.JMenuItem jMenuItem20_cerrar_sesion;
    private javax.swing.JMenuItem jMenuItem2_gestionar_usuario;
    private javax.swing.JMenuItem jMenuItem3_nuevo_videojuego;
    private javax.swing.JMenuItem jMenuItem4_gestionar_videojuegos;
    private javax.swing.JMenuItem jMenuItem5_actualizar_stock;
    private javax.swing.JMenuItem jMenuItem6_nuevo_cliente;
    private javax.swing.JMenuItem jMenuItem7_gestionar_clientes;
    private javax.swing.JMenuItem jMenuItem8_nueva_categoria;
    private javax.swing.JMenuItem jMenuItem9_gestionar_categorias;
    // End of variables declaration//GEN-END:variables
}
