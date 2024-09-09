
package vista;
import modelo.Cliente;
//import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import modelo.Empleado;
import modelo.Puesto;

public class fr_Persona extends javax.swing.JFrame {
Cliente cliente;
Empleado empleado;
Puesto puesto;

   public fr_Persona() {
        initComponents();
        cliente = new Cliente();
        empleado = new Empleado();
        puesto = new Puesto();
        this.tbl_clientes.setModel(cliente.leer());
        this.tbl_empleado.setModel(empleado.leerp());
        this.box_po.setModel(puesto.leer());
   }
       
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tab_principal = new javax.swing.JTabbedPane();
        panel_empleados = new javax.swing.JPanel();
        lbl_codigo = new javax.swing.JLabel();
        txt_codigop = new javax.swing.JTextField();
        lbl_nombresp = new javax.swing.JLabel();
        txt_nombresp = new javax.swing.JTextField();
        lbl_apellidosp = new javax.swing.JLabel();
        txt_apellidosp = new javax.swing.JTextField();
        lbl_direccionp = new javax.swing.JLabel();
        txt_direccionp = new javax.swing.JTextField();
        lbl_telefonop = new javax.swing.JLabel();
        txt_telefonp = new javax.swing.JTextField();
        lbl_nacimientop = new javax.swing.JLabel();
        txt_nacimientop = new javax.swing.JTextField();
        btn_guardarp = new javax.swing.JButton();
        jspanel_tablap = new javax.swing.JScrollPane();
        tbl_empleado = new javax.swing.JTable();
        jLabelp = new javax.swing.JLabel();
        lbl_idp = new javax.swing.JLabel();
        actualizarp = new javax.swing.JButton();
        btn_eliminarp = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        box_po = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        panel_clientes = new javax.swing.JPanel();
        lbl_nit = new javax.swing.JLabel();
        txt_nit = new javax.swing.JTextField();
        lbl_nombres = new javax.swing.JLabel();
        txt_nombres = new javax.swing.JTextField();
        lbl_apellidos = new javax.swing.JLabel();
        txt_apellidos = new javax.swing.JTextField();
        lbl_direccion = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        lbl_telefono = new javax.swing.JLabel();
        txt_telefon = new javax.swing.JTextField();
        lbl_nacimiento = new javax.swing.JLabel();
        txt_nacimiento = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JButton();
        jspanel_tabla = new javax.swing.JScrollPane();
        tbl_clientes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lbl_id = new javax.swing.JLabel();
        actualizar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tab_principal.setBackground(new java.awt.Color(0, 102, 102));
        tab_principal.setForeground(new java.awt.Color(255, 255, 255));
        tab_principal.setAutoscrolls(true);
        tab_principal.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        panel_empleados.setBackground(new java.awt.Color(204, 255, 204));

        lbl_codigo.setText("Codigo:");

        txt_codigop.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_nombresp.setText("Nombres:");

        txt_nombresp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_apellidosp.setText("Apellidos:");

        txt_apellidosp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_direccionp.setText("Direccion:");

        txt_direccionp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_telefonop.setText("telefono:");

        txt_telefonp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_nacimientop.setText("Fecha de nacimiento:");

        txt_nacimientop.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_guardarp.setBackground(new java.awt.Color(102, 255, 102));
        btn_guardarp.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btn_guardarp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/ADD 2.png"))); // NOI18N
        btn_guardarp.setText("Agregar");
        btn_guardarp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_guardarp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarpActionPerformed(evt);
            }
        });

        tbl_empleado.setBackground(new java.awt.Color(0, 0, 0));
        tbl_empleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbl_empleado.setForeground(new java.awt.Color(255, 255, 255));
        tbl_empleado.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_empleado.setGridColor(new java.awt.Color(0, 0, 0));
        tbl_empleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_empleadoMouseClicked(evt);
            }
        });
        tbl_empleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbl_empleadoKeyReleased(evt);
            }
        });
        jspanel_tablap.setViewportView(tbl_empleado);

        jLabelp.setText("id");

        lbl_idp.setText("0");

        actualizarp.setBackground(new java.awt.Color(51, 204, 255));
        actualizarp.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        actualizarp.setForeground(new java.awt.Color(255, 255, 255));
        actualizarp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/refresh.png"))); // NOI18N
        actualizarp.setText("Actualizar");
        actualizarp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        actualizarp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarpActionPerformed(evt);
            }
        });

        btn_eliminarp.setBackground(new java.awt.Color(204, 0, 0));
        btn_eliminarp.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btn_eliminarp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/delete.png"))); // NOI18N
        btn_eliminarp.setText("Eliminar");
        btn_eliminarp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_eliminarp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarpActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("PORTAL DEL EMPLEADO");

        box_po.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        box_po.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_poActionPerformed(evt);
            }
        });

        jLabel3.setText("Puesto");

        javax.swing.GroupLayout panel_empleadosLayout = new javax.swing.GroupLayout(panel_empleados);
        panel_empleados.setLayout(panel_empleadosLayout);
        panel_empleadosLayout.setHorizontalGroup(
            panel_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_empleadosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panel_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_empleadosLayout.createSequentialGroup()
                        .addGroup(panel_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_guardarp, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_empleadosLayout.createSequentialGroup()
                                .addComponent(lbl_nacimientop)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_nacimientop, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(actualizarp, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_eliminarp, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel_empleadosLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(panel_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_empleadosLayout.createSequentialGroup()
                                .addGroup(panel_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_direccionp)
                                    .addComponent(lbl_apellidosp, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panel_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_apellidosp, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(txt_direccionp)))
                            .addGroup(panel_empleadosLayout.createSequentialGroup()
                                .addComponent(lbl_telefonop)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_telefonp, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_empleadosLayout.createSequentialGroup()
                                .addGroup(panel_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_empleadosLayout.createSequentialGroup()
                                        .addComponent(jLabelp)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbl_idp))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(panel_empleadosLayout.createSequentialGroup()
                                            .addComponent(lbl_codigo)
                                            .addGap(45, 45, 45)
                                            .addComponent(txt_codigop, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panel_empleadosLayout.createSequentialGroup()
                                            .addComponent(lbl_nombresp)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txt_nombresp, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(5, 5, 5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(28, 28, 28)
                        .addComponent(box_po, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(307, Short.MAX_VALUE))
                    .addGroup(panel_empleadosLayout.createSequentialGroup()
                        .addComponent(jspanel_tablap, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(panel_empleadosLayout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(321, Short.MAX_VALUE))
        );
        panel_empleadosLayout.setVerticalGroup(
            panel_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_empleadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(panel_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelp)
                    .addComponent(lbl_idp))
                .addGap(18, 18, 18)
                .addGroup(panel_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_codigo)
                    .addComponent(txt_codigop, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_po, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(9, 9, 9)
                .addGroup(panel_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nombresp)
                    .addComponent(lbl_nombresp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_apellidosp)
                    .addComponent(txt_apellidosp, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_direccionp)
                    .addComponent(txt_direccionp, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(panel_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_telefonp, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_telefonop))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_empleadosLayout.createSequentialGroup()
                        .addComponent(lbl_nacimientop)
                        .addGap(8, 8, 8))
                    .addGroup(panel_empleadosLayout.createSequentialGroup()
                        .addComponent(txt_nacimientop, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(panel_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_guardarp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminarp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actualizarp, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jspanel_tablap, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );

        tab_principal.addTab("Empleados", panel_empleados);

        panel_clientes.setBackground(new java.awt.Color(255, 255, 51));

        lbl_nit.setText("Nit:");

        txt_nit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_nombres.setText("Nombres:");

        txt_nombres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_apellidos.setText("Apellidos:");

        txt_apellidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_direccion.setText("Direccion:");

        txt_direccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_telefono.setText("telefono:");

        txt_telefon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_nacimiento.setText("Fecha de nacimiento:");

        txt_nacimiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_guardar.setBackground(new java.awt.Color(102, 255, 102));
        btn_guardar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/ADD 2.png"))); // NOI18N
        btn_guardar.setText("Agregar");
        btn_guardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        tbl_clientes.setBackground(new java.awt.Color(0, 0, 0));
        tbl_clientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbl_clientes.setForeground(new java.awt.Color(255, 255, 255));
        tbl_clientes.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_clientes.setGridColor(new java.awt.Color(0, 0, 0));
        tbl_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_clientesMouseClicked(evt);
            }
        });
        tbl_clientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbl_clientesKeyReleased(evt);
            }
        });
        jspanel_tabla.setViewportView(tbl_clientes);

        jLabel1.setText("id");

        lbl_id.setText("0");

        actualizar.setBackground(new java.awt.Color(51, 204, 255));
        actualizar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        actualizar.setForeground(new java.awt.Color(255, 255, 255));
        actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/refresh.png"))); // NOI18N
        actualizar.setText("Actualizar");
        actualizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });

        btn_eliminar.setBackground(new java.awt.Color(204, 0, 0));
        btn_eliminar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/delete.png"))); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("PORTAL DEL CLIENTE");

        javax.swing.GroupLayout panel_clientesLayout = new javax.swing.GroupLayout(panel_clientes);
        panel_clientes.setLayout(panel_clientesLayout);
        panel_clientesLayout.setHorizontalGroup(
            panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_clientesLayout.createSequentialGroup()
                .addGroup(panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_clientesLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_clientesLayout.createSequentialGroup()
                                .addGroup(panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lbl_direccion)
                                        .addComponent(lbl_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lbl_telefono))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_telefon, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_apellidos)
                                        .addComponent(txt_direccion))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_clientesLayout.createSequentialGroup()
                                .addGroup(panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_clientesLayout.createSequentialGroup()
                                        .addComponent(lbl_nombres)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_clientesLayout.createSequentialGroup()
                                        .addGroup(panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_nit)
                                            .addComponent(jLabel1))
                                        .addGroup(panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panel_clientesLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lbl_id))
                                            .addGroup(panel_clientesLayout.createSequentialGroup()
                                                .addGap(45, 45, 45)
                                                .addComponent(txt_nit, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(5, 5, 5))))
                    .addGroup(panel_clientesLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jspanel_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_clientesLayout.createSequentialGroup()
                                .addGroup(panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel_clientesLayout.createSequentialGroup()
                                        .addComponent(lbl_nacimiento)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panel_clientesLayout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        panel_clientesLayout.setVerticalGroup(
            panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_clientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbl_id))
                .addGap(18, 18, 18)
                .addGroup(panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nit)
                    .addComponent(txt_nit, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_nombres)
                    .addComponent(txt_nombres))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_apellidos)
                    .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_direccion)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_telefon, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_telefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_clientesLayout.createSequentialGroup()
                        .addComponent(lbl_nacimiento)
                        .addGap(8, 8, 8))
                    .addGroup(panel_clientesLayout.createSequentialGroup()
                        .addComponent(txt_nacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jspanel_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );

        tab_principal.addTab("Clientes", panel_clientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tab_principal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tab_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // TODO add your handling code here:
        cliente = new Cliente(0,txt_nit.getText(),txt_nombres.getText(),txt_apellidos.getText(),txt_direccion.getText()
            ,txt_telefon.getText(),txt_nacimiento.getText());
        cliente.crear();
        this.tbl_clientes.setModel(cliente.leer());

    }//GEN-LAST:event_btn_guardarActionPerformed

    public void selec_datos_cliente(){
        int fila = tbl_clientes.getSelectedRow();
        lbl_id.setText(tbl_clientes.getValueAt(fila, 0).toString());
        txt_nit.setText(tbl_clientes.getValueAt(fila, 1).toString());
        txt_nombres.setText(tbl_clientes.getValueAt(fila, 2).toString());
        txt_apellidos.setText(tbl_clientes.getValueAt(fila, 3).toString());
        txt_direccion.setText(tbl_clientes.getValueAt(fila, 4).toString());
        txt_telefon.setText(tbl_clientes.getValueAt(fila, 5).toString());
        txt_nacimiento.setText(tbl_clientes.getValueAt(fila, 6).toString());
    }
    
    public void selec_datos_empleado(){
    int fila = tbl_empleado.getSelectedRow();
    if (fila >= 0) { 
        lbl_idp.setText(tbl_empleado.getValueAt(fila, 0).toString());
        txt_codigop.setText(tbl_empleado.getValueAt(fila, 1).toString());
        txt_nombresp.setText(tbl_empleado.getValueAt(fila, 2).toString());
        txt_apellidosp.setText(tbl_empleado.getValueAt(fila, 3).toString());
        txt_direccionp.setText(tbl_empleado.getValueAt(fila, 4).toString());
        txt_telefonp.setText(tbl_empleado.getValueAt(fila, 5).toString());
        txt_nacimientop.setText(tbl_empleado.getValueAt(fila, 6).toString());
        String nombrePuesto = tbl_empleado.getValueAt(fila, 7) != null ? tbl_empleado.getValueAt(fila, 7).toString() : "";
        boolean encontrado = false;
        for (int i = 0; i < box_po.getItemCount(); i++) {
            if (box_po.getItemAt(i).equals(nombrePuesto)) {
                box_po.setSelectedIndex(i);
                encontrado = true;
                break; }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "El puesto '" + nombrePuesto + "' no está disponible en el ComboBox.");
            box_po.setSelectedIndex(-1);
        }
    }
    }
    private void tbl_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_clientesMouseClicked
        // TODO add your handling code here:
        selec_datos_cliente();
    }//GEN-LAST:event_tbl_clientesMouseClicked

    private void tbl_clientesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_clientesKeyReleased
        // TODO add your handling code here:
        selec_datos_cliente();
    }//GEN-LAST:event_tbl_clientesKeyReleased

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        // TODO add your handling code here:
        cliente = new Cliente(Integer.parseInt(lbl_id.getText()),txt_nit.getText(),txt_nombres.getText(),txt_apellidos.getText(),txt_direccion.getText(),txt_telefon.getText(),txt_nacimiento.getText());
        cliente.actualizar();
        this.tbl_clientes.setModel(cliente.leer());
    }//GEN-LAST:event_actualizarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
        cliente = new Cliente();
        cliente.setId(Integer.parseInt(lbl_id.getText()));
        cliente.eliminar();
        this.tbl_clientes.setModel(cliente.leer());
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_guardarpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarpActionPerformed
        // TODO add your handling code here:
         String pseleccionado = box_po.getSelectedItem().toString();
         Integer idseleccionado = puesto.map.get(pseleccionado);
         if (idseleccionado != null) {
         empleado = new Empleado (0,txt_codigop.getText(),txt_nombresp.getText(),txt_apellidosp.getText(),txt_direccionp.getText(),txt_telefonp.getText()
         ,txt_nacimientop.getText(),idseleccionado.toString());
        empleado.crearp();
        this.tbl_empleado.setModel(empleado.leerp());
        } else {
        JOptionPane.showMessageDialog(null, "Error: No se encontró el ID del puesto seleccionado.");
    }
    }//GEN-LAST:event_btn_guardarpActionPerformed

    private void tbl_empleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_empleadoMouseClicked
        // TODO add your handling code here:
        selec_datos_empleado();
    }//GEN-LAST:event_tbl_empleadoMouseClicked

    private void tbl_empleadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_empleadoKeyReleased
        // TODO add your handling code here:
        selec_datos_empleado();
    }//GEN-LAST:event_tbl_empleadoKeyReleased

    private void actualizarpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarpActionPerformed
        // TODO add your handling code here:
         String pseleccionado = box_po.getSelectedItem().toString();
         Integer idseleccionado = puesto.map.get(pseleccionado);
         if (idseleccionado != null) {
         empleado = new Empleado (Integer.parseInt(lbl_idp.getText()),txt_codigop.getText(),txt_nombresp.getText(),txt_apellidosp.getText(),txt_direccionp.getText(),txt_telefonp.getText()
         ,txt_nacimientop.getText(),idseleccionado.toString());
        empleado.actualizarp();
        this.tbl_empleado.setModel(empleado.leerp());
        } else {
        JOptionPane.showMessageDialog(null, "Error: No se encontró el ID seleccionado.");
        }
    }//GEN-LAST:event_actualizarpActionPerformed

    private void btn_eliminarpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarpActionPerformed
        // TODO add your handling code here:
       empleado = new Empleado();
        empleado.setId(Integer.parseInt(lbl_idp.getText()));
        empleado.eliminarp();
        this.tbl_empleado.setModel(empleado.leerp());
        
    }//GEN-LAST:event_btn_eliminarpActionPerformed

    private void box_poActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_poActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_poActionPerformed

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
            java.util.logging.Logger.getLogger(fr_Persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fr_Persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fr_Persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fr_Persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new fr_Persona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar;
    private javax.swing.JButton actualizarp;
    private javax.swing.JComboBox<String> box_po;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_eliminarp;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_guardarp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelp;
    private javax.swing.JScrollPane jspanel_tabla;
    private javax.swing.JScrollPane jspanel_tablap;
    private javax.swing.JLabel lbl_apellidos;
    private javax.swing.JLabel lbl_apellidosp;
    private javax.swing.JLabel lbl_codigo;
    private javax.swing.JLabel lbl_direccion;
    private javax.swing.JLabel lbl_direccionp;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_idp;
    private javax.swing.JLabel lbl_nacimiento;
    private javax.swing.JLabel lbl_nacimientop;
    private javax.swing.JLabel lbl_nit;
    private javax.swing.JLabel lbl_nombres;
    private javax.swing.JLabel lbl_nombresp;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JLabel lbl_telefonop;
    private javax.swing.JPanel panel_clientes;
    private javax.swing.JPanel panel_empleados;
    private javax.swing.JTabbedPane tab_principal;
    private javax.swing.JTable tbl_clientes;
    private javax.swing.JTable tbl_empleado;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_apellidosp;
    private javax.swing.JTextField txt_codigop;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_direccionp;
    private javax.swing.JTextField txt_nacimiento;
    private javax.swing.JTextField txt_nacimientop;
    private javax.swing.JTextField txt_nit;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JTextField txt_nombresp;
    private javax.swing.JTextField txt_telefon;
    private javax.swing.JTextField txt_telefonp;
    // End of variables declaration//GEN-END:variables
}
