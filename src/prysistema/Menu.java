package prysistema;

import BD.Conexion;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fmostrar = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        btnAyudaPDF = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Archivo = new javax.swing.JMenu();
        RegTrabajador = new javax.swing.JMenuItem();
        Salir = new javax.swing.JMenuItem();
        Utilidad = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        ListGeneral = new javax.swing.JMenuItem();
        ListInfPersonal = new javax.swing.JMenuItem();
        ListDatoTrabajadores = new javax.swing.JMenuItem();
        ListEstudios = new javax.swing.JMenuItem();
        Conexion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        btnAyudaPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/files.png"))); // NOI18N
        btnAyudaPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaPDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnAyudaPDF)
                .addContainerGap(1076, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 17, Short.MAX_VALUE)
                .addComponent(btnAyudaPDF))
        );

        Fmostrar.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout FmostrarLayout = new javax.swing.GroupLayout(Fmostrar);
        Fmostrar.setLayout(FmostrarLayout);
        FmostrarLayout.setHorizontalGroup(
            FmostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        FmostrarLayout.setVerticalGroup(
            FmostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FmostrarLayout.createSequentialGroup()
                .addContainerGap(507, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        Archivo.setText("Archivo");
        Archivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArchivoActionPerformed(evt);
            }
        });

        RegTrabajador.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        RegTrabajador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/newUser.png"))); // NOI18N
        RegTrabajador.setText("Registrar trabajador");
        RegTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegTrabajadorActionPerformed(evt);
            }
        });
        Archivo.add(RegTrabajador);

        Salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.png"))); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        Archivo.add(Salir);

        jMenuBar1.add(Archivo);

        Utilidad.setText("Utilidad");

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/list.png"))); // NOI18N
        jMenu1.setText("Listado");

        ListGeneral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/list.png"))); // NOI18N
        ListGeneral.setText("List. General");
        ListGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListGeneralActionPerformed(evt);
            }
        });
        jMenu1.add(ListGeneral);

        ListInfPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trabajadorInfo.png"))); // NOI18N
        ListInfPersonal.setText("Inf. Personal");
        ListInfPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListInfPersonalActionPerformed(evt);
            }
        });
        jMenu1.add(ListInfPersonal);

        ListDatoTrabajadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trabajador.png"))); // NOI18N
        ListDatoTrabajadores.setText("Dat. Trabajadores");
        ListDatoTrabajadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListDatoTrabajadoresActionPerformed(evt);
            }
        });
        jMenu1.add(ListDatoTrabajadores);

        ListEstudios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/estudios.png"))); // NOI18N
        ListEstudios.setText("Estudios");
        ListEstudios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListEstudiosActionPerformed(evt);
            }
        });
        jMenu1.add(ListEstudios);

        Utilidad.add(jMenu1);

        Conexion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Conexion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/conexion.png"))); // NOI18N
        Conexion.setText("Conexion");
        Conexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConexionActionPerformed(evt);
            }
        });
        Utilidad.add(Conexion);

        jMenuBar1.add(Utilidad);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Fmostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Fmostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArchivoActionPerformed

    }//GEN-LAST:event_ArchivoActionPerformed

    private void RegTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegTrabajadorActionPerformed
        Reg_trabajador NuevoTrabajador = new Reg_trabajador();
        Fmostrar.add(NuevoTrabajador);
        NuevoTrabajador.show();
    }//GEN-LAST:event_RegTrabajadorActionPerformed

    private void ListInfPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListInfPersonalActionPerformed
        ListInfPersonal lis_Tra = new ListInfPersonal();
        Fmostrar.add(lis_Tra);
        lis_Tra.show();
    }//GEN-LAST:event_ListInfPersonalActionPerformed

    private void ConexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConexionActionPerformed
        Conexion con = new Conexion();
    }//GEN-LAST:event_ConexionActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void ListDatoTrabajadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListDatoTrabajadoresActionPerformed
        ListDatTrabajo lis_Dat_Trabajadores = new ListDatTrabajo();
        Fmostrar.add(lis_Dat_Trabajadores);
        lis_Dat_Trabajadores.show();
    }//GEN-LAST:event_ListDatoTrabajadoresActionPerformed

    private void ListEstudiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListEstudiosActionPerformed
        ListEstTrabajador lis_Est_Trabajadores = new ListEstTrabajador();
        Fmostrar.add(lis_Est_Trabajadores);
        lis_Est_Trabajadores.show();
    }//GEN-LAST:event_ListEstudiosActionPerformed

    private void btnAyudaPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaPDFActionPerformed
        String ruta = "/archivos/manualAct.pdf"; // Cambiar el nombre del archivo a "manualAct.pdf"
    try {
        InputStream inputStream = getClass().getResourceAsStream(ruta);
        File tempFile = File.createTempFile("manualAct", ".pdf");
        try (FileOutputStream outputStream = new FileOutputStream(tempFile)) {
            byte[] buffer = new byte[1024];
            int byteRead;
            while ((byteRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, byteRead);
            }
            Desktop.getDesktop().open(tempFile);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_btnAyudaPDFActionPerformed

    private void ListGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListGeneralActionPerformed
        ListGeneral list_Gen = new ListGeneral(Fmostrar);
        Fmostrar.add(list_Gen);
        list_Gen.show();
    }//GEN-LAST:event_ListGeneralActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Archivo;
    private javax.swing.JMenuItem Conexion;
    private javax.swing.JDesktopPane Fmostrar;
    private javax.swing.JMenuItem ListDatoTrabajadores;
    private javax.swing.JMenuItem ListEstudios;
    private javax.swing.JMenuItem ListGeneral;
    private javax.swing.JMenuItem ListInfPersonal;
    private javax.swing.JMenuItem RegTrabajador;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JMenu Utilidad;
    private javax.swing.JButton btnAyudaPDF;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
