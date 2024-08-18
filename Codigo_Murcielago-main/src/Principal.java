import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Principal extends javax.swing.JFrame {

    
    controller controlador = new controller();

    private String nameFile = "";
    private String textoCopiado = "";
    public String textReem = "OtroTexto";

    public Principal() {
        initComponents();
    }

    private void eventosTecla(KeyEvent evt) {
        if (evt.isControlDown() && evt.getKeyCode() == KeyEvent.VK_A) {
            seleccionarRutaArchivo();
            String dataFile = new ReadFile().lecturaArchivo(nameFile);
            txtData.setText(dataFile);
        }
        if (evt.isControlDown() && evt.getKeyCode() == KeyEvent.VK_G) {
            if (nameFile.isEmpty()) {
                seleccionarRutaArchivo();
            }
            new ReadFile().guardarArchivo(nameFile, txtData.getText());
        }
        if (evt.getKeyCode() == KeyEvent.VK_F12) {
            seleccionarRutaArchivo();
            new ReadFile().guardarArchivo(nameFile, txtData.getText());
        }
        if (evt.isControlDown() && evt.getKeyCode() == KeyEvent.VK_C) {
            textoCopiado = txtData.getSelectedText();
        }
        if (evt.isControlDown() && evt.getKeyCode() == KeyEvent.VK_X) {
            textoCopiado = txtData.getSelectedText();
            String textNuevo = txtData.getText().replace(textoCopiado, "");
            txtData.setText(textNuevo);
        }
        if (evt.isControlDown() && evt.getKeyCode() == KeyEvent.VK_P) {
            txtData.append(textoCopiado);
        }
        if (evt.isControlDown() && evt.getKeyCode() == KeyEvent.VK_B) {
            String buscar = JOptionPane.showInputDialog("Ingrese texto a buscar");
            if (txtData.getText().contains(buscar)) {
                txtData.setSelectionStart(txtData.getText().indexOf(buscar));
                int fin = txtData.getText().indexOf(buscar) + buscar.length();
                txtData.setSelectionEnd(fin);
            }
        }
        if (evt.isControlDown() && evt.getKeyCode() == KeyEvent.VK_R) {
            final JTextField buscar = new JTextField(10);
            final JTextField reemplazar = new JTextField(10);
            JPanel pane = new JPanel();
            pane.add(new JLabel("Ingrese texto a buscar"));
            pane.add(buscar);
            pane.add(new JLabel("Ingrese texto para reemplazar"));
            pane.add(reemplazar);

            int reply = JOptionPane.showConfirmDialog(null, pane, "Buscar y reemplazar",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            if (reply == JOptionPane.OK_OPTION) {
                String textBuscar = buscar.getText();
                String textReem = reemplazar.getText();

                while (txtData.getText().contains(textBuscar)) {
                    txtData.setText(txtData.getText().replaceAll(textBuscar, textReem));
                }
            }
        }
    }

    private void seleccionarRutaArchivo() {
        JFileChooser ubicacion = new JFileChooser();
        ubicacion.setFileSelectionMode(JFileChooser.FILES_ONLY);

        FileNameExtensionFilter filtro = new FileNameExtensionFilter(".txt", "txt");
        ubicacion.setFileFilter(filtro);
        int result = ubicacion.showOpenDialog(this);
        if (result != JFileChooser.CANCEL_OPTION) {
            File nombreArchivo = ubicacion.getSelectedFile();
            if (nombreArchivo != null && !nombreArchivo.getName().equals("")) {
                if (!nombreArchivo.getName().endsWith(".txt")) {
                    nameFile = nombreArchivo.getAbsolutePath() + ".txt";
                } else {
                    nameFile = nombreArchivo.getAbsolutePath();
                }
            }
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtData = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtlongitud = new javax.swing.JLabel();
        txtpalabra = new javax.swing.JLabel();
        txtPrimerLetra = new javax.swing.JLabel();
        txtUltimaLetra = new javax.swing.JLabel();
        txtLetraCentral = new javax.swing.JLabel();
        txtPrimeraPalabra = new javax.swing.JLabel();
        txtPalabraCentral = new javax.swing.JLabel();
        txtUltimaPalabra = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtA = new javax.swing.JLabel();
        txtE = new javax.swing.JLabel();
        txtI = new javax.swing.JLabel();
        txtO = new javax.swing.JLabel();
        txtPar = new javax.swing.JLabel();
        txtU1 = new javax.swing.JLabel();
        txtImpar = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTraduccion = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        fileOption = new javax.swing.JMenu();
        ItemAbrir = new javax.swing.JMenuItem();
        ItemGuardar = new javax.swing.JMenuItem();
        ItemGuardarF = new javax.swing.JMenuItem();
        editOption = new javax.swing.JMenu();
        ItemCopy = new javax.swing.JMenuItem();
        ItemCut = new javax.swing.JMenuItem();
        ItemPegar = new javax.swing.JMenuItem();
        ItemBuscar = new javax.swing.JMenuItem();
        ItemReemplazar = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 0));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("MANEJO DE CADENAS");

        txtData.setColumns(20);
        txtData.setRows(5);
        txtData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDataKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(txtData);

        jButton1.setText("PROCESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel2.setText("Longitud de texto..............:");

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel3.setText("Total de palabras..............:");

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel4.setText("Primer letra del texto.........:");

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel5.setText("Última letra del texto.........:");

        jLabel6.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel6.setText("Letra central del texto.......:");

        jLabel7.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel7.setText("Primera palabra................:");

        jLabel8.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel8.setText("Palabra central..................:");

        jLabel9.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel9.setText("Última palabra...................:");

        txtlongitud.setForeground(new java.awt.Color(255, 255, 204));
        txtlongitud.setText("  ");

        txtpalabra.setText("  ");

        txtPrimerLetra.setText("  ");

        txtUltimaLetra.setText("  ");

        txtLetraCentral.setText("  ");

        txtPrimeraPalabra.setText("  ");

        txtPalabraCentral.setText("  ");

        txtUltimaPalabra.setText("  ");

        jLabel10.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel10.setText("Repeteciones de \"A\", \"a\" o \"á\"                             ->");

        jLabel11.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel11.setText("Repeticiones de \"E\", \"e\" o \"é\"                              ->");

        jLabel12.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel12.setText("Repeticiones de \"I\", \"i\" o \"í\"                                  ->");

        jLabel13.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel13.setText("Repeticiones de \"O\", \"o\" o \"ó\"                             ->");

        jLabel14.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel14.setText("Repeticiones de \"Ú\", \"u\" o \"ú\"                             ->");

        jLabel15.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel15.setText("Palabras con cantidad de caracteres par        ->");

        jLabel16.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel16.setText("Palabras con cantidad de caracteres impar   ->");

        txtA.setText(" ");

        txtE.setText(" ");

        txtI.setText(" ");

        txtO.setText(" ");

        txtPar.setText(" ");

        txtU1.setText(" ");

        txtImpar.setText(" ");

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel17.setText("TRADUCCIÓN A CLAVE MURCIELAGO");

        txtTraduccion.setEditable(false);
        txtTraduccion.setBackground(new java.awt.Color(255, 255, 255));
        txtTraduccion.setColumns(20);
        txtTraduccion.setRows(5);
        jScrollPane2.setViewportView(txtTraduccion);

        jLabel18.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel18.setText("Ingresa un texto o importa un txt y mira como se convierte en codigo murcielago");

        Menu.setBackground(new java.awt.Color(204, 255, 204));
        Menu.setForeground(new java.awt.Color(51, 51, 255));

        fileOption.setText("Archivo");

        ItemAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ItemAbrir.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        ItemAbrir.setText("Abrir");
        ItemAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemAbrirActionPerformed(evt);
            }
        });
        fileOption.add(ItemAbrir);

        ItemGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ItemGuardar.setText("Guardar");
        ItemGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemGuardarActionPerformed(evt);
            }
        });
        fileOption.add(ItemGuardar);

        ItemGuardarF.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, 0));
        ItemGuardarF.setText("Guardar como");
        ItemGuardarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemGuardarFActionPerformed(evt);
            }
        });
        fileOption.add(ItemGuardarF);

        Menu.add(fileOption);

        editOption.setBackground(new java.awt.Color(0, 0, 0));
        editOption.setText("Editar");

        ItemCopy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ItemCopy.setBackground(new java.awt.Color(0, 0, 0));
        ItemCopy.setText("Copiar");
        ItemCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemCopyActionPerformed(evt);
            }
        });
        editOption.add(ItemCopy);

        ItemCut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ItemCut.setBackground(new java.awt.Color(0, 0, 0));
        ItemCut.setText("Cortar");
        ItemCut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemCutActionPerformed(evt);
            }
        });
        editOption.add(ItemCut);

        ItemPegar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ItemPegar.setBackground(new java.awt.Color(0, 0, 0));
        ItemPegar.setText("Pegar");
        ItemPegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemPegarActionPerformed(evt);
            }
        });
        editOption.add(ItemPegar);

        ItemBuscar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ItemBuscar.setBackground(new java.awt.Color(0, 0, 0));
        ItemBuscar.setText("Buscar");
        ItemBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemBuscarActionPerformed(evt);
            }
        });
        editOption.add(ItemBuscar);

        ItemReemplazar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ItemReemplazar.setBackground(new java.awt.Color(0, 0, 0));
        ItemReemplazar.setText("Reemplazar");
        ItemReemplazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemReemplazarActionPerformed(evt);
            }
        });
        editOption.add(ItemReemplazar);

        Menu.add(editOption);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel9)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtlongitud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtUltimaLetra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtLetraCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtPrimeraPalabra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtPalabraCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtUltimaPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPrimerLetra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtpalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtI, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtU1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtE, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel16))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtO, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtImpar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addComponent(jLabel17)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(jButton1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtlongitud)
                    .addComponent(jLabel10)
                    .addComponent(txtA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtpalabra)
                    .addComponent(jLabel11)
                    .addComponent(txtE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPrimerLetra)
                    .addComponent(jLabel12)
                    .addComponent(txtI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtUltimaLetra)
                    .addComponent(jLabel13)
                    .addComponent(txtO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtLetraCentral)
                    .addComponent(jLabel14)
                    .addComponent(txtU1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPrimeraPalabra)
                    .addComponent(jLabel15)
                    .addComponent(txtPar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPalabraCentral)
                    .addComponent(jLabel16)
                    .addComponent(txtImpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtUltimaPalabra))
                .addGap(12, 12, 12)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel17.getAccessibleContext().setAccessibleName("CONVERSION A LENGUAJE MURCIELAGO\n");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        String texto = txtData.getText();
        txtlongitud.setText(String.valueOf(controlador.longitud(texto)));
        txtpalabra.setText(String.valueOf(controlador.cantidadDePalabra(texto)));
        txtPrimerLetra.setText(controlador.primeraLetra(texto));
        txtUltimaLetra.setText(controlador.ultimaLetra(texto));
        txtLetraCentral.setText(controlador.letraCentral(texto));
        txtPrimeraPalabra.setText(controlador.primeraPalabra(texto));
        txtPalabraCentral.setText(controlador.palabraCentral(texto));
        txtUltimaPalabra.setText(controlador.ultimaPalabra(texto));
        int cantidadA = controlador.howmany(texto, "A") + controlador.howmany(texto, "a") + controlador.howmany(texto, "Á") + controlador.howmany(texto, "á");
        int cantidadE = controlador.howmany(texto, "E") + controlador.howmany(texto, "e") + controlador.howmany(texto, "É") + controlador.howmany(texto, "é");
        int cantidadI = controlador.howmany(texto, "I") + controlador.howmany(texto, "i") + controlador.howmany(texto, "Í") + controlador.howmany(texto, "í");
        int cantidadO = controlador.howmany(texto, "O") + controlador.howmany(texto, "o") + controlador.howmany(texto, "Ó") + controlador.howmany(texto, "ó");
        int cantidadU = controlador.howmany(texto, "U") + controlador.howmany(texto, "u") + controlador.howmany(texto, "Ú") + controlador.howmany(texto, "ú");
        txtA.setText(String.valueOf(cantidadA));
        txtE.setText(String.valueOf(cantidadE));
        txtI.setText(String.valueOf(cantidadI));
        txtO.setText(String.valueOf(cantidadO));
        txtU1.setText(String.valueOf(cantidadU));
        txtPar.setText(String.valueOf(controlador.palabrasPares(texto)));
        txtImpar.setText(String.valueOf(controlador.palabrasImpares(texto)));
        txtTraduccion.setText(controlador.codigomurcielago(texto));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ItemAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemAbrirActionPerformed
 
        seleccionarRutaArchivo();
        String dataFile = new ReadFile().lecturaArchivo(nameFile);
        txtData.setText(dataFile);
    }//GEN-LAST:event_ItemAbrirActionPerformed

    private void ItemGuardarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemGuardarFActionPerformed
        
        seleccionarRutaArchivo();
        new ReadFile().guardarArchivo(nameFile, txtData.getText());
    }//GEN-LAST:event_ItemGuardarFActionPerformed

    private void ItemCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemCopyActionPerformed
      
        textoCopiado = txtData.getSelectedText();
    }//GEN-LAST:event_ItemCopyActionPerformed

    private void ItemGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemGuardarActionPerformed
    
        if (nameFile.isEmpty()) {
            seleccionarRutaArchivo();
        }
        new ReadFile().guardarArchivo(nameFile, txtData.getText());
    }//GEN-LAST:event_ItemGuardarActionPerformed

    private void ItemCutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemCutActionPerformed
        
        textoCopiado = txtData.getSelectedText();
        String textNuevo = txtData.getText().replace(textoCopiado, "");
        txtData.setText(textNuevo);
    }//GEN-LAST:event_ItemCutActionPerformed

    private void ItemPegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemPegarActionPerformed

        txtData.append(textoCopiado);
    }//GEN-LAST:event_ItemPegarActionPerformed

    private void ItemBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemBuscarActionPerformed
     
        String buscar = JOptionPane.showInputDialog("Ingrese texto a buscar");
        if (txtData.getText().contains(buscar)) {
            txtData.setSelectionStart(txtData.getText().indexOf(buscar));
            int fin = txtData.getText().indexOf(buscar) + buscar.length();
            txtData.setSelectionEnd(fin);
        }
    }//GEN-LAST:event_ItemBuscarActionPerformed

    private void ItemReemplazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemReemplazarActionPerformed
  
        final JTextField buscar = new JTextField(10);
        final JTextField reemplazar = new JTextField(10);
        JPanel pane = new JPanel();
        pane.add(new JLabel("Ingrese texto a buscar"));
        pane.add(buscar);
        pane.add(new JLabel("Ingrese texto para reemplazar"));
        pane.add(reemplazar);

        int reply = JOptionPane.showConfirmDialog(null, pane, "Buscar y reemplazar",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (reply == JOptionPane.OK_OPTION) {
            String textBuscar = buscar.getText();
            String textReem = reemplazar.getText();
            System.out.println("user name: " + textBuscar);
            System.out.println("passowrd:  " + textReem);

            while (txtData.getText().contains(textBuscar)) {
                txtData.setText(txtData.getText().replaceAll(textBuscar, textReem));
            }
        }
    }//GEN-LAST:event_ItemReemplazarActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
       

    }//GEN-LAST:event_formKeyPressed

    private void txtDataKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDataKeyPressed
       
        eventosTecla(evt);
    }//GEN-LAST:event_txtDataKeyPressed

   
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItemAbrir;
    private javax.swing.JMenuItem ItemBuscar;
    private javax.swing.JMenuItem ItemCopy;
    private javax.swing.JMenuItem ItemCut;
    private javax.swing.JMenuItem ItemGuardar;
    private javax.swing.JMenuItem ItemGuardarF;
    private javax.swing.JMenuItem ItemPegar;
    private javax.swing.JMenuItem ItemReemplazar;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenu editOption;
    private javax.swing.JMenu fileOption;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel txtA;
    private javax.swing.JTextArea txtData;
    private javax.swing.JLabel txtE;
    private javax.swing.JLabel txtI;
    private javax.swing.JLabel txtImpar;
    private javax.swing.JLabel txtLetraCentral;
    private javax.swing.JLabel txtO;
    private javax.swing.JLabel txtPalabraCentral;
    private javax.swing.JLabel txtPar;
    private javax.swing.JLabel txtPrimerLetra;
    private javax.swing.JLabel txtPrimeraPalabra;
    private javax.swing.JTextArea txtTraduccion;
    private javax.swing.JLabel txtU1;
    private javax.swing.JLabel txtUltimaLetra;
    private javax.swing.JLabel txtUltimaPalabra;
    private javax.swing.JLabel txtlongitud;
    private javax.swing.JLabel txtpalabra;
    // End of variables declaration//GEN-END:variables
}
