
package prysistema;

import javax.swing.JOptionPane;
import DAO.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import model.Combo;
import model.Trabajador;

public class Act_trabajador extends javax.swing.JInternalFrame {
    int id;
    Trabajador trabaja;
    TrabajadorDao tbj;
    ListGeneral panel;
    ComboDao cb;
    public Act_trabajador(int id, ListGeneral panel) {
        this.id = id;
        this.panel = panel;
        tbj = new TrabajadorDao();
        cb = new ComboDao();
        initComponents();
        txtId.setEditable(false);
        rellenar();
        comboAct();
    }
    private void rellenar(){
        SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd");
        Date nac = new Date();
        Date ing = new Date();
        trabaja = tbj.selectById(id);
        try{
            nac = form.parse(trabaja.getFechNac());
            ing = form.parse(trabaja.getFechIngreso());
        }catch(Exception e){
            e.printStackTrace();
        }
        txtId.setText(""+trabaja.getId());
        txtNombre.setText(trabaja.getNombre());
        txtApellido.setText(trabaja.getApellido());
        txtEdad.setText(""+trabaja.getEdad());
        cbSexo.setSelectedItem(trabaja.getSexo());
        dtFechNac.setDate(nac);
        cbEstCivil.setSelectedItem(trabaja.getEstCivil());
        txtDireccion.setText(trabaja.getDireccion());
        cbDistrito.setSelectedItem(trabaja.getDistrito());
        cbDepart.setSelectedItem(trabaja.getDepartamento());
        txtEmail.setText(trabaja.getEmail());
        cbACargo.setSelectedItem(trabaja.getCargo());
        dtFechIngre.setDate(ing);
        cbEst.setSelectedItem(trabaja.getEstado());
        cbTipCont.setSelectedItem(trabaja.getTipoContrato());
        cbArea.setSelectedItem(trabaja.getArea());
        txtsueldo.setText(""+trabaja.getSueldo());
        cbGradInst.setSelectedItem(trabaja.getTipoContrato());
    }
    private void comboAct(){
        cbSexo.setModel(new DefaultComboBoxModel<>(aVector(cb.lisSexo())));
        cbACargo.setModel(new DefaultComboBoxModel<>(aVector(cb.lisCargo())));
        cbArea.setModel(new DefaultComboBoxModel<>(aVector(cb.lisArea())));
        cbDepart.setModel(new DefaultComboBoxModel<>(aVector(cb.lisDep())));
        cbDistrito.setModel(new DefaultComboBoxModel<>(aVector(cb.lisDistrito())));
        cbEst.setModel(new DefaultComboBoxModel<>(aVector(cb.lisEstado())));
        cbEstCivil.setModel(new DefaultComboBoxModel<>(aVector(cb.lisCivil())));
        cbGradInst.setModel(new DefaultComboBoxModel<>(aVector(cb.lisInst())));
        cbTipCont.setModel(new DefaultComboBoxModel<>(aVector(cb.lisContrato())));
    }
    
    private String[] aVector(List<Combo> lista){
        String[] var = new String[lista.size()];
        int i = 0;
        for(Combo x:lista){
            var[i] = x.getTipo();
            i++;
        }
        return var;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        cbSexo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dtFechNac = new com.toedter.calendar.JDateChooser();
        cbEstCivil = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbDistrito = new javax.swing.JComboBox<>();
        cbDepart = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cbACargo = new javax.swing.JComboBox<>();
        dtFechIngre = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        cbEst = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        cbTipCont = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        cbArea = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        txtsueldo = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        cbGradInst = new javax.swing.JComboBox<>();
        btnAyuda = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setTitle("Registrar nuevo trabajador");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Nombres");

        jLabel2.setText("Apellidos");

        jLabel3.setText("Edad");

        jLabel4.setText("Datos personales");

        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        jLabel7.setText("Sexo");

        jLabel9.setText("Fecha de nacimiento");

        cbEstCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero(a)", "Casado(a)", "Viudo(a)" }));

        jLabel5.setText("Estado civil");

        jLabel6.setText("Dirección");

        cbDistrito.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chorrillos", "La Victoria", "Miraflores", "Jesus Maria", "Breña", "San Juan de Lurigancho", "Barranco", "San Juan de Miraflores" }));

        cbDepart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lima", "Tacna", "Piura", "Ica", "Tumbes", "Arequipa" }));

        jLabel8.setText("Distrito");

        jLabel10.setText("Departamento");

        jLabel11.setText("E-mail");

        jLabel12.setText("Datos del trabajo");

        jLabel13.setText("Cargo personal");

        cbACargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Administrador de sistemas", "Profesor", "Auxiliar", "Consejo directivo", "Secretaria", "Contador", "Mantenimiento" }));

        jLabel14.setText("Fecha de ingreso");

        cbEst.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Retirado" }));

        jLabel15.setText("Estado");

        cbTipCont.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Locación de servicios", "CAS", "CPD", " " }));

        jLabel16.setText("Tipo de contrato");

        cbArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Oficina de Adm", "Oficina de educación", "Aula", "Coordinación", "Psicomotriz", "Taller", " " }));

        jLabel17.setText("Área de trabajo");

        jLabel18.setText("Remuneración");

        jLabel19.setText("Datos profesionales");

        jLabel20.setText("Niv. Instrucción");

        cbGradInst.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Secundaria completa", "Tec. Incompleta", "Tec. Completa", "Universidad Incompleta", "Universidad Completa", "Superior post grado", "Magister", "Doctor" }));

        btnAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ayuda.png"))); // NOI18N
        btnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaActionPerformed(evt);
            }
        });

        txtId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setText("ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1))
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEmail)
                                    .addComponent(cbDepart, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbDistrito, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtDireccion)
                                    .addComponent(cbEstCivil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNombre)
                                    .addComponent(txtApellido)
                                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dtFechNac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel7))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(191, 191, 191)
                                .addComponent(jLabel19))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel20))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(dtFechIngre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbACargo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbEst, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbTipCont, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbArea, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtsueldo))
                                    .addComponent(cbGradInst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 371, Short.MAX_VALUE)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(86, 86, 86)
                                        .addComponent(jLabel4)
                                        .addGap(298, 298, 298)
                                        .addComponent(jLabel12))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(121, 121, 121)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(428, 428, 428)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(71, 71, 71)))
                .addComponent(btnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel13)
                            .addComponent(cbACargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel14)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dtFechIngre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel21)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cbEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cbTipCont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(dtFechNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbEstCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtsueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel19))
                .addGap(2, 2, 2)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(cbGradInst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbDepart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        btnRegistrar.setText("ACTUALIZAR TRABAJADOR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistrar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegistrar)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        JOptionPane.showMessageDialog(null, "Recuerda llenar los datos correctamente.\nSolo texto: Nombre, Apellido, Direccion, E-mail.\nSolo numeros: Edad y Remuneracion.\nSelección de opciones: Sexo, Estado civil, Distrito, Departamento, Cargo personal, Estado, Tipo de contrato, Área de trabajo y Nivel de instrucción.\nSolo fechas: Fecha de nacimiento y Fecha de ingreso (Hacer click en el boton del calendario).\nSoporte: luisatencio0419@gmail.com");
    }//GEN-LAST:event_btnAyudaActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        Date fechIngre = dtFechIngre.getDate();
        Date fechNac = dtFechNac.getDate();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        int id = Integer.parseInt(txtId.getText());
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        int edad = Integer.parseInt(txtEdad.getText());
        int sexo = cbSexo.getSelectedIndex()+1;
        String fech_nac = formato.format(fechNac);
        int est_civ = cbEstCivil.getSelectedIndex()+1;
        String direccion = txtDireccion.getText();
        int distrito = cbDistrito.getSelectedIndex()+1;
        int departamento = cbDepart.getSelectedIndex()+1;
        String email = txtEmail.getText();
        int cargo = cbACargo.getSelectedIndex()+1;
        String fech_ing = formato.format(fechIngre);
        int estado = cbEst.getSelectedIndex()+1;
        int contrato = cbTipCont.getSelectedIndex()+1;
        int area = cbArea.getSelectedIndex()+1;
        double sueldo = Double.parseDouble(txtsueldo.getText());
        int grado = cbGradInst.getSelectedIndex()+1;
        
       Trabajador nuevo = new Trabajador(id,nombre,apellido,edad,sexo,fech_nac,est_civ,direccion,distrito,departamento,email,cargo,fech_ing,estado,contrato,area,sueldo,grado);
       boolean valor = tbj.update(nuevo);
       
       if(valor){
           panel.Mostrar();
           JOptionPane.showMessageDialog(null, "Trabajador actualizado correctamente");
           dispose();
       }else{
           JOptionPane.showMessageDialog(null, "Ocurrio un error al actualizar tabla");
       }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbACargo;
    private javax.swing.JComboBox<String> cbArea;
    private javax.swing.JComboBox<String> cbDepart;
    private javax.swing.JComboBox<String> cbDistrito;
    private javax.swing.JComboBox<String> cbEst;
    private javax.swing.JComboBox<String> cbEstCivil;
    private javax.swing.JComboBox<String> cbGradInst;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JComboBox<String> cbTipCont;
    private com.toedter.calendar.JDateChooser dtFechIngre;
    private com.toedter.calendar.JDateChooser dtFechNac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtsueldo;
    // End of variables declaration//GEN-END:variables
}
