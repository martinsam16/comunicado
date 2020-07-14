package vista;

import controlador.ComunicadoC;
import javax.swing.DefaultComboBoxModel;
import modelo.Comunicado;
import modelo.EstiloComunicado;
import services.JFileChooserService;

public class main extends javax.swing.JFrame {
    
    private final ComunicadoC comunicadoC;
    private final Comunicado comunicado;
    
    public main() {
        initComponents();
        setLocationRelativeTo(null);
        comunicadoC = new ComunicadoC();
        comunicado = new Comunicado();
    }
    
    private void setearDatos() {
        comunicado.setCurso(curso.getSelectedItem() + "");
        comunicado.setProfesor(profesor.getSelectedItem() + "");
        comunicado.setHora(hora.getText());
        comunicado.setContenido(contenido.getText());
        comunicado.setBackground(background.getText());
        comunicado.setModalidad(modalidad.getSelectedItem() + "");
        comunicado.setEstilo((EstiloComunicado) estilo.getSelectedItem());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnGenerar = new javax.swing.JButton();
        hora = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        contenido = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        background = new javax.swing.JTextField();
        curso = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        modalidad = new javax.swing.JComboBox<>();
        profesor = new javax.swing.JComboBox<>();
        estilo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        pc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generador de comunicados");

        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        hora.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        hora.setText("dd/MM/yyyy - 00:00 a 00:00pm");

        contenido.setColumns(20);
        contenido.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        contenido.setLineWrap(true);
        contenido.setRows(5);
        contenido.setText("El presente escrito tiene como finalidad convocarlos a una reunión escolar urgente, con el objeto de tratar puntos referentes a ______________.\nSin más, agradecemos su asistencia puntual.");
        contenido.setWrapStyleWord(true);
        contenido.setMargin(new java.awt.Insets(8, 5, 8, 5));
        jScrollPane1.setViewportView(contenido);

        jLabel1.setText("Curso");

        jLabel2.setText("Profesor");

        jLabel3.setText("Fecha/Hora");

        jLabel4.setText("Contenido");

        jLabel5.setText("Fondo (url o path)");

        background.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        background.setText("https://image.freepik.com/free-vector/sport-isometric-set_1284-15138.jpg");

        curso.setEditable(true);
        curso.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        curso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Educación Física", "Educación Religiosa" }));

        jLabel6.setText("Modalidad");

        modalidad.setEditable(true);
        modalidad.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        modalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Zoom", "Whatsapp", "Google Meet", "Presencial" }));

        profesor.setEditable(true);
        profesor.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        profesor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pablo César Samán Oré", "Rosa de Guadalupe Arata Rodriguez" }));

        estilo.setModel(new DefaultComboBoxModel(EstiloComunicado.values()));
        estilo.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        jLabel7.setText("Estilo");

        pc.setText("Seleccionar");
        pc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pc)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hora, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                            .addComponent(profesor, 0, 0, Short.MAX_VALUE)
                            .addComponent(curso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(modalidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7)
                            .addComponent(estilo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(428, 428, 428)
                                .addComponent(btnGenerar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(14, 14, 14))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(curso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(7, 7, 7)
                        .addComponent(profesor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(3, 3, 3)
                        .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estilo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pc))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        try {
            setearDatos();
            comunicadoC.setComunicado(comunicado);
            comunicadoC.generarReporte();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnGenerarActionPerformed

    private void pcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcActionPerformed
        background.setText(JFileChooserService.obtenerRutaImagen());
    }//GEN-LAST:event_pcActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField background;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JTextArea contenido;
    private javax.swing.JComboBox<String> curso;
    private javax.swing.JComboBox<String> estilo;
    private javax.swing.JTextField hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> modalidad;
    private javax.swing.JButton pc;
    private javax.swing.JComboBox<String> profesor;
    // End of variables declaration//GEN-END:variables
}
