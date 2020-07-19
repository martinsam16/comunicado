package vista;

import controlador.ComunicadoC;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import mdlaf.MaterialLookAndFeel;
import mdlaf.themes.JMarsDarkTheme;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import modelo.Comunicado;
import modelo.EstiloComunicado;
import services.JFileChooserService;

public class main extends javax.swing.JFrame {

    private final ComunicadoC comunicadoC;
    private final Comunicado comunicado;
    int numeroHilos = ManagementFactory.getThreadMXBean().getThreadCount();
    ExecutorService executor = Executors.newFixedThreadPool(numeroHilos);

    public main() throws IOException {
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
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        curso = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        modalidad = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        profesor = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        hora = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        estilo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        background = new javax.swing.JTextField();
        pc = new javax.swing.JButton();
        web = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        contenido = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        preview = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        barraProgreso = new javax.swing.JProgressBar();
        btnRecargar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generador de comunicados");
        setIconImage(new ImageIcon(getClass().getResource("/icono/icon.png")).getImage());

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1190, 1190, 1190)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(56, 56, 56))
        );

        curso.setEditable(true);
        curso.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        curso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Educación Física", "Educación Religiosa" }));

        jLabel1.setText("Curso");

        jLabel6.setText("Modalidad");

        modalidad.setEditable(true);
        modalidad.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        modalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Whatsapp", "Zoom", "Google Meet", "Presencial" }));

        jLabel2.setText("Profesor");

        profesor.setEditable(true);
        profesor.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        profesor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pablo César Samán Oré", "Rosa de Guadalupe Arata Rodriguez" }));

        jLabel3.setText("Fecha/Hora");

        hora.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        hora.setText("dd/MM/yyyy - 00:00 a 00:00pm");

        jLabel7.setText("Estilo");

        estilo.setModel(new DefaultComboBoxModel(EstiloComunicado.values()));
        estilo.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        jLabel5.setText("Fondo (url o path)");

        background.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        background.setText("https://image.freepik.com/free-vector/sport-isometric-set_1284-15138.jpg");
        background.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                backgroundFocusGained(evt);
            }
        });
        background.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backgroundMouseClicked(evt);
            }
        });

        pc.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        pc.setText("PC");
        pc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcActionPerformed(evt);
            }
        });

        web.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        web.setText("web");
        web.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                webActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(web, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pc, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1)
                                .addComponent(jLabel6)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel7)
                                .addComponent(hora, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                .addComponent(profesor, 0, 0, Short.MAX_VALUE)
                                .addComponent(modalidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(curso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(estilo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(curso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addGap(7, 7, 7)
                .addComponent(profesor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(3, 3, 3)
                .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(7, 7, 7)
                .addComponent(estilo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pc)
                    .addComponent(web))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        contenido.setColumns(20);
        contenido.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        contenido.setLineWrap(true);
        contenido.setRows(5);
        contenido.setText("Cada vez que ponga un . se cargará la preview, sino presione el botón de la derecha (Recargar).\nEl reporte se copia automáticamente a su portapapeles como imagen.\nPuede importar texto: ten formatos:D");
        contenido.setWrapStyleWord(true);
        contenido.setMargin(new java.awt.Insets(8, 5, 8, 5));
        contenido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                contenidoFocusGained(evt);
            }
        });
        contenido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contenidoMouseClicked(evt);
            }
        });
        contenido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                contenidoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                contenidoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(contenido);

        jLabel4.setText("Contenido");

        jButton1.setText("Importar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Exportar");
        jButton2.setEnabled(false);

        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(btnImprimir))
                    .addComponent(jButton1))
                .addContainerGap())
        );

        jLabel9.setText("Preview");

        barraProgreso.setStringPainted(true);

        btnRecargar.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnRecargar.setText("Recargar");
        btnRecargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addContainerGap(459, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(barraProgreso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(btnRecargar)
                                .addGap(64, 64, 64)))
                        .addGap(139, 139, 139))
                    .addComponent(preview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(41, 41, 41)
                .addComponent(preview, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(barraProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRecargar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private synchronized Runnable generarPreview() {
        return () -> {
            barraProgreso.setValue(0);
            setearDatos();
            barraProgreso.setValue(10);
            comunicadoC.setComunicado(comunicado);
            barraProgreso.setValue(25);

            BufferedImage imagen = comunicadoC.preview();
            barraProgreso.setValue(60);

            Image imagenRedimensionada = imagen
                    .getScaledInstance(preview.getWidth(),
                            preview.getHeight(),
                            Image.SCALE_SMOOTH);
            barraProgreso.setValue(90);
            preview.setIcon(new ImageIcon(imagenRedimensionada));

            barraProgreso.setValue(100);
            repaint();
        };

    }

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        try {
//            setearDatos();
            comunicadoC.setComunicado(comunicado);
            comunicadoC.imprimir();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnImprimirActionPerformed

    private void pcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcActionPerformed
        try {
            background.setText(JFileChooserService.obtenerRutaImagen());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_pcActionPerformed

    private void contenidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contenidoKeyPressed

    }//GEN-LAST:event_contenidoKeyPressed

    private void contenidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contenidoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_PERIOD) {
            try {
                executor.awaitTermination(1, TimeUnit.MILLISECONDS);
                executor.execute(generarPreview());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_contenidoKeyReleased

    private void btnRecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargarActionPerformed
        try {
            executor.execute(generarPreview());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnRecargarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            contenido.setText(JFileChooserService.importarTexto(contenido.getText()));
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void webActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_webActionPerformed
        try {
            Runtime.getRuntime().exec(new String[]{"cmd", "/c", "start chrome https://www.google.com.pe/imghp"});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_webActionPerformed

    private void backgroundMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundMouseClicked
        
    }//GEN-LAST:event_backgroundMouseClicked

    private void contenidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contenidoMouseClicked
        
    }//GEN-LAST:event_contenidoMouseClicked

    private void contenidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contenidoFocusGained
       contenido.selectAll();
    }//GEN-LAST:event_contenidoFocusGained

    private void backgroundFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_backgroundFocusGained
        background.selectAll();
    }//GEN-LAST:event_backgroundFocusGained

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new MaterialLookAndFeel());
            if (UIManager.getLookAndFeel() instanceof MaterialLookAndFeel) {
                MaterialLookAndFeel.changeTheme(new JMarsDarkTheme());
            }
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new main().setVisible(true);
                } catch (Exception e) {
                }

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField background;
    private javax.swing.JProgressBar barraProgreso;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnRecargar;
    private javax.swing.JTextArea contenido;
    private javax.swing.JComboBox<String> curso;
    private javax.swing.JComboBox<String> estilo;
    private javax.swing.JTextField hora;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> modalidad;
    private javax.swing.JButton pc;
    private javax.swing.JLabel preview;
    private javax.swing.JComboBox<String> profesor;
    private javax.swing.JButton web;
    // End of variables declaration//GEN-END:variables
}
