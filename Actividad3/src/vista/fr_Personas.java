package vista;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.*;

public class fr_Personas extends javax.swing.JFrame {
Docente docente;
Persona persona;

    public fr_Personas() {
        initComponents();
        persona = new Persona();
        this.tbl_personas.setModel(persona.leerp());
        ocultarColumnas();
   }

    public void selec_datos(){
    int fila = tbl_personas.getSelectedRow();
    if (fila >= 0) { 
        txt_codDocente1.setText(tbl_personas.getValueAt(fila, 0).toString());
        txt_nombres1.setText(tbl_personas.getValueAt(fila, 1).toString());
        txt_apellidos1.setText(tbl_personas.getValueAt(fila, 2).toString());
        txt_direccion1.setText(tbl_personas.getValueAt(fila, 3).toString());
        txt_nit1.setText(tbl_personas.getValueAt(fila, 4).toString());
        txt_telefon1.setText(tbl_personas.getValueAt(fila, 5).toString());
        txt_nacimiento1.setText(tbl_personas.getValueAt(fila, 6).toString());
        txt_salario.setText(tbl_personas.getValueAt(fila, 7).toString());
        txt_fi.setText(tbl_personas.getValueAt(fila, 8).toString()); //@author bomiki
        lbl_id_persona.setText(tbl_personas.getValueAt(fila, 9).toString());
        lbl_id_docente.setText(tbl_personas.getValueAt(fila, 10).toString());
            
    }
    }
    private void ocultarColumnas() {
    tbl_personas.getColumnModel().getColumn(9).setMinWidth(0);
    tbl_personas.getColumnModel().getColumn(9).setMaxWidth(0);
    tbl_personas.getColumnModel().getColumn(9).setWidth(0);
    tbl_personas.getColumnModel().getColumn(9).setPreferredWidth(0);

    tbl_personas.getColumnModel().getColumn(10).setMinWidth(0);
    tbl_personas.getColumnModel().getColumn(10).setMaxWidth(0);
    tbl_personas.getColumnModel().getColumn(10).setWidth(0);
    tbl_personas.getColumnModel().getColumn(10).setPreferredWidth(0);
}
            
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tab_principal = new javax.swing.JTabbedPane();
        panel_persona = new javax.swing.JPanel();
        lbl_mensaje1 = new javax.swing.JLabel();
        lbl_nit1 = new javax.swing.JLabel();
        txt_nit1 = new javax.swing.JTextField();
        lbl_nombres1 = new javax.swing.JLabel();
        txt_nombres1 = new javax.swing.JTextField();
        lbl_apellidos1 = new javax.swing.JLabel();
        txt_apellidos1 = new javax.swing.JTextField();
        lbl_direccion1 = new javax.swing.JLabel();
        txt_direccion1 = new javax.swing.JTextField();
        lbl_telefono1 = new javax.swing.JLabel();
        txt_telefon1 = new javax.swing.JTextField();
        lbl_nacimiento1 = new javax.swing.JLabel();
        txt_nacimiento1 = new javax.swing.JTextField();
        btn_guardar1 = new javax.swing.JButton();
        jspanel_tabla1 = new javax.swing.JScrollPane();
        tbl_personas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lbl_salario = new javax.swing.JLabel();
        lbl_salario1 = new javax.swing.JLabel();
        txt_fi = new javax.swing.JTextField();
        txt_codDocente1 = new javax.swing.JTextField();
        txt_salario = new javax.swing.JTextField();
        btn_actualizar = new javax.swing.JButton();
        btn_borrar = new javax.swing.JButton();
        lbl_id_persona = new javax.swing.JLabel();
        lbl_id_docente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_persona.setBackground(new java.awt.Color(204, 204, 204));
        panel_persona.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_mensaje1.setFont(new java.awt.Font("Segoe UI Black", 3, 36)); // NOI18N
        lbl_mensaje1.setText("FORMULARIO DOCENTE");
        lbl_mensaje1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_nit1.setText("Nit:");

        txt_nit1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_nombres1.setText("Nombres:");

        txt_nombres1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_apellidos1.setText("Apellidos:");

        txt_apellidos1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_direccion1.setText("Direccion:");

        txt_direccion1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_telefono1.setText("Numero de telefono:");

        txt_telefon1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_nacimiento1.setText("Fecha de nacimiento:");

        txt_nacimiento1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_guardar1.setBackground(new java.awt.Color(153, 255, 153));
        btn_guardar1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btn_guardar1.setText("Guardar");
        btn_guardar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_guardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar1ActionPerformed(evt);
            }
        });

        tbl_personas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbl_personas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_personas.setGridColor(new java.awt.Color(196, 213, 198));
        tbl_personas.setShowGrid(false);
        tbl_personas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_personasMouseClicked(evt);
            }
        });
        tbl_personas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_personasKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbl_personasKeyReleased(evt);
            }
        });
        jspanel_tabla1.setViewportView(tbl_personas);

        jLabel2.setText("Codigo");

        lbl_salario.setText("Salario");

        lbl_salario1.setText("Fecha de ingreso");

        txt_fi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt_codDocente1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_codDocente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codDocente1ActionPerformed(evt);
            }
        });

        txt_salario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_actualizar.setBackground(new java.awt.Color(153, 255, 255));
        btn_actualizar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btn_actualizar.setText("Actualizar");
        btn_actualizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        btn_borrar.setBackground(new java.awt.Color(153, 0, 0));
        btn_borrar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btn_borrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_borrar.setText("Borrar");
        btn_borrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });

        lbl_id_persona.setBackground(new java.awt.Color(204, 204, 204));
        lbl_id_persona.setForeground(new java.awt.Color(204, 204, 204));

        lbl_id_docente.setBackground(new java.awt.Color(204, 204, 204));
        lbl_id_docente.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout panel_personaLayout = new javax.swing.GroupLayout(panel_persona);
        panel_persona.setLayout(panel_personaLayout);
        panel_personaLayout.setHorizontalGroup(
            panel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspanel_tabla1)
            .addGroup(panel_personaLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_personaLayout.createSequentialGroup()
                        .addComponent(lbl_id_docente, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_personaLayout.createSequentialGroup()
                                .addGroup(panel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_nacimiento1)
                                    .addComponent(lbl_telefono1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_telefon1)
                                    .addComponent(txt_nacimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_personaLayout.createSequentialGroup()
                                    .addGap(49, 49, 49)
                                    .addGroup(panel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panel_personaLayout.createSequentialGroup()
                                            .addGroup(panel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2)
                                                .addGroup(panel_personaLayout.createSequentialGroup()
                                                    .addGap(6, 6, 6)
                                                    .addComponent(lbl_nit1)))
                                            .addGap(18, 18, 18)
                                            .addGroup(panel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txt_nit1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txt_codDocente1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(panel_personaLayout.createSequentialGroup()
                                            .addComponent(lbl_nombres1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txt_nombres1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(panel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panel_personaLayout.createSequentialGroup()
                                        .addComponent(lbl_direccion1)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_direccion1))
                                    .addGroup(panel_personaLayout.createSequentialGroup()
                                        .addComponent(lbl_apellidos1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_apellidos1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_personaLayout.createSequentialGroup()
                        .addGroup(panel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel_personaLayout.createSequentialGroup()
                                .addComponent(lbl_salario)
                                .addGap(18, 18, 18)
                                .addComponent(txt_salario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_personaLayout.createSequentialGroup()
                                .addComponent(lbl_salario1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_fi, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_id_persona, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_mensaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_personaLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(panel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_guardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(470, Short.MAX_VALUE))
        );
        panel_personaLayout.setVerticalGroup(
            panel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_personaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_personaLayout.createSequentialGroup()
                        .addGroup(panel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_codDocente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_nit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_nit1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_nombres1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_nombres1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_apellidos1)
                            .addComponent(txt_apellidos1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_direccion1)
                            .addComponent(txt_direccion1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_telefono1)
                            .addComponent(txt_telefon1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_nacimiento1)
                            .addComponent(txt_nacimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_personaLayout.createSequentialGroup()
                        .addGroup(panel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_personaLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(lbl_mensaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_personaLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(panel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_id_persona, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_id_docente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_guardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_personaLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btn_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(panel_personaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_salario1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_fi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_salario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jspanel_tabla1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tab_principal.addTab("Persona", panel_persona);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tab_principal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tab_principal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar1ActionPerformed
        double salario = Double.parseDouble(txt_salario.getText());
         java.sql.Timestamp Fecha_registro = new java.sql.Timestamp(System.currentTimeMillis());
        persona = new Persona(
        txt_nit1.getText(),     
        txt_codDocente1.getText(),
        salario,                             
        txt_nombres1.getText(),            
        txt_apellidos1.getText(),         
        txt_direccion1.getText(),         
        txt_telefon1.getText(),           
        txt_nacimiento1.getText(),  
        txt_fi.getText(),  
        Fecha_registro
        );
    try {
        persona.crearp();
        this.tbl_personas.setModel(persona.leerp());
        ocultarColumnas();
    } catch (ParseException ex) {
        Logger.getLogger(fr_Personas.class.getName()).log(Level.SEVERE, null, ex);
    }
    
        
    }//GEN-LAST:event_btn_guardar1ActionPerformed

    private void txt_codDocente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codDocente1ActionPerformed
 
    }//GEN-LAST:event_txt_codDocente1ActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        double salario = Double.parseDouble(txt_salario.getText());
        java.sql.Timestamp Fecha_registro = new java.sql.Timestamp(System.currentTimeMillis());
        persona = new Persona(
        txt_nit1.getText(),     
        txt_codDocente1.getText(),
        salario,                             
        txt_nombres1.getText(),            
        txt_apellidos1.getText(),         
        txt_direccion1.getText(),         
        txt_telefon1.getText(),           
        txt_nacimiento1.getText(),  
        txt_fi.getText(),  
        Fecha_registro,
        Integer.parseInt(lbl_id_persona.getText()), 
        Integer.parseInt(lbl_id_docente.getText())
        );
        persona.actualizarp();
        this.tbl_personas.setModel(persona.leerp());
        ocultarColumnas();
        
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        persona = new Persona();
        persona.setId_persona(Integer.parseInt(lbl_id_persona.getText()));
        persona.setId_docente(Integer.parseInt(lbl_id_docente.getText()));
        persona.eliminarp();
        this.tbl_personas.setModel(persona.leerp());
        ocultarColumnas();
        
    }//GEN-LAST:event_btn_borrarActionPerformed

    private void tbl_personasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_personasKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_personasKeyPressed

    private void tbl_personasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_personasKeyReleased
        // TODO add your handling code here:
        selec_datos();
    }//GEN-LAST:event_tbl_personasKeyReleased

    private void tbl_personasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_personasMouseClicked
        selec_datos();
    }//GEN-LAST:event_tbl_personasMouseClicked

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new fr_Personas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_guardar1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jspanel_tabla1;
    private javax.swing.JLabel lbl_apellidos1;
    private javax.swing.JLabel lbl_direccion1;
    private javax.swing.JLabel lbl_id_docente;
    private javax.swing.JLabel lbl_id_persona;
    private javax.swing.JLabel lbl_mensaje1;
    private javax.swing.JLabel lbl_nacimiento1;
    private javax.swing.JLabel lbl_nit1;
    private javax.swing.JLabel lbl_nombres1;
    private javax.swing.JLabel lbl_salario;
    private javax.swing.JLabel lbl_salario1;
    private javax.swing.JLabel lbl_telefono1;
    private javax.swing.JPanel panel_persona;
    private javax.swing.JTabbedPane tab_principal;
    private javax.swing.JTable tbl_personas;
    private javax.swing.JTextField txt_apellidos1;
    private javax.swing.JTextField txt_codDocente1;
    private javax.swing.JTextField txt_direccion1;
    private javax.swing.JTextField txt_fi;
    private javax.swing.JTextField txt_nacimiento1;
    private javax.swing.JTextField txt_nit1;
    private javax.swing.JTextField txt_nombres1;
    private javax.swing.JTextField txt_salario;
    private javax.swing.JTextField txt_telefon1;
    // End of variables declaration//GEN-END:variables
}
