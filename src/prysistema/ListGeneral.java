
package prysistema;

import DAO.GeneradorPDF;
import DAO.TrabajadorDao;
import java.awt.event.*;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import model.Trabajador;

public class ListGeneral extends javax.swing.JInternalFrame {
    TrabajadorDao tbj;
    private TrabajadorDao trabajadorDao;
    private JDesktopPane panel;
    public ListGeneral(JDesktopPane panel) {
        this.panel = panel;
        tbj = new TrabajadorDao();
        initComponents();
        jTable1.setDefaultEditor(Object.class, null);
        jTable1.getTableHeader().setReorderingAllowed(false);
        trabajadorDao = new TrabajadorDao();
        Mostrar();
        JPopupMenu popupMenu = new JPopupMenu();
            JMenuItem editarItem = new JMenuItem("Editar");
            JMenuItem eliminarItem = new JMenuItem("Eliminar");

            editarItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int selectedRow = jTable1.getSelectedRow();
                    System.out.println("Editar fila: " + selectedRow);
                    int id = (int)jTable1.getValueAt(selectedRow, 0);
                    Act_trabajador edita = new Act_trabajador(id,ListGeneral.this);
                    panel.add(edita);
                    edita.show();
                    
                }
            });

            eliminarItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int selectedRow = jTable1.getSelectedRow();
                    System.out.println("Eliminar fila: " + selectedRow);
                    int id = (int)jTable1.getValueAt(selectedRow, 0);
                    int option = JOptionPane.showConfirmDialog(null, "Seguro de querer eliminar el trabajador?","Confirmar",JOptionPane.YES_NO_OPTION);
                    if(option == JOptionPane.YES_OPTION){
                        trabajadorDao.delete(id);
                        Mostrar();
                    }
                }
            });

            popupMenu.add(editarItem);
            popupMenu.add(eliminarItem);

            jTable1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (SwingUtilities.isRightMouseButton(e)) {
                        int row = jTable1.rowAtPoint(e.getPoint());
                        jTable1.getSelectionModel().setSelectionInterval(row, row);
                        popupMenu.show(jTable1, e.getX(), e.getY());
                    }
                }
            });
    }
    private void generarPDF() {
        List<Trabajador> trabajadores = tbj.selectAll();
        GeneradorPDF generadorPDF = new GeneradorPDF();
        generadorPDF.generarPDFTrabajadores(trabajadores, "ListaGeneralDeTrabajadores.pdf");
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnPDF = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jTextField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Listado de datos de trabajadores en la BD");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        btnPDF.setText("Generar PDF");
        btnPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDFActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar Trabajador");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(btnBuscar)
                .addGap(26, 26, 26)
                .addComponent(jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPDF)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField)
                        .addGap(1, 1, 1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPDF)
                            .addComponent(btnBuscar))))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Apellido", "Edad", "Sexo", "Fech. Nac", "Est. Civil", "Dirección", "Distrito", "Departamento", "E-mail", "Cargo", "Fech. Ingreso", "Estado", "Contrato", "Área", "Sueldo", "Instrucción"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable1MouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1265, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseEntered
       
    }//GEN-LAST:event_jTable1MouseEntered

    private void btnPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDFActionPerformed
        generarPDF();
    }//GEN-LAST:event_btnPDFActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            Object id = obtenerIdDesdeInterfaz();

            if (id != null) {
                Trabajador trabajador = trabajadorDao.selectById(id);
                if (trabajador != null) {
                    String mensaje = obtenerMensajeTrabajador(trabajador);
                    JOptionPane.showMessageDialog(null, mensaje);
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró ningún trabajador con el ID proporcionado.");
                }
            }
        } catch (Exception e) {
            System.out.println("Error al buscar trabajador: " + e.getMessage());
        }
    }
private String obtenerMensajeTrabajador(Trabajador trabajador) {
    return "Información del Trabajador:\n" +
        "ID: " + trabajador.getId() + "\n" +
        "Nombre: " + trabajador.getNombre() + "\n" +
        "Apellido: " + trabajador.getApellido() + "\n" +
        "Edad: " + trabajador.getEdad() + "\n" +
        "Sexo: " + trabajador.getSexo() + "\n" +
        "Fecha de Nacimiento: " + trabajador.getFechNac() + "\n" +
        "Estado Civil: " + trabajador.getEstCivil() + "\n" +
        "Dirección: " + trabajador.getDireccion() + "\n" +
        "Distrito: " + trabajador.getDistrito() + "\n" +
        "Departamento: " + trabajador.getDepartamento() + "\n" +
        "Email: " + trabajador.getEmail() + "\n" +
        "Cargo: " + trabajador.getCargo() + "\n" +
        "Fecha de Ingreso: " + trabajador.getFechIngreso() + "\n" +
        "Estado: " + trabajador.getEstado() + "\n" +
        "Tipo de Contrato: " + trabajador.getTipoContrato() + "\n" +
        "Área de Trabajo: " + trabajador.getArea() + "\n" +
        "Sueldo: " + trabajador.getSueldo() + "\n" +
        "Nivel de Instrucción: " + trabajador.getGradoInst();
}
private Object obtenerIdDesdeInterfaz() {
    try {
       
        String idTexto = jTextField.getText(); 
        if (!idTexto.isEmpty()) {
            return Integer.parseInt(idTexto); 
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un ID válido.");
            return null; 
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese un ID válido.");
        return null; 
    }
    
            
        
    }//GEN-LAST:event_btnBuscarActionPerformed
    public void Mostrar() {
        List<Trabajador> trabajadores = trabajadorDao.selectAll();
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);

        for (Trabajador trabajador : trabajadores) {
            Object[] fila = {
                    trabajador.getId(),
                    trabajador.getNombre(),
                    trabajador.getApellido(),
                    trabajador.getEdad(),
                    trabajador.getSexo(),
                    trabajador.getFechNac(),
                    trabajador.getEstCivil(),
                    trabajador.getDireccion(),
                    trabajador.getDistrito(),
                    trabajador.getDepartamento(),
                    trabajador.getEmail(),
                    trabajador.getCargo(),
                    trabajador.getFechIngreso(),
                    trabajador.getEstado(),
                    trabajador.getTipoContrato(),
                    trabajador.getArea(),
                    trabajador.getSueldo(),
                    trabajador.getGradoInst()
            };
            modelo.addRow(fila);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnPDF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField;
    // End of variables declaration//GEN-END:variables

    
}
