package vistas;

import control.*;
import java.io.*;
import javax.swing.*;
import javax.swing.filechooser.*;

public class JFTableroPersonalizado extends javax.swing.JFrame {

    private File rutaImagen;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbAceptar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbCargarImagen;
    private javax.swing.JLabel jlDimension;
    private javax.swing.JLabel jlSeleccionarImagen;
    private javax.swing.JPanel jpContenido;
    private javax.swing.JPanel jpDimension;
    private javax.swing.JPanel jpSeleccionarImagen;
    private javax.swing.JSpinner jsDimension;
    private javax.swing.JTextField jtfRuta;
    // End of variables declaration//GEN-END:variables
    
    public JFTableroPersonalizado() {
        super("Nuevo Tablero Personalizado");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpContenido = new javax.swing.JPanel();
        jlDimension = new javax.swing.JLabel();
        jpDimension = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jsDimension = new javax.swing.JSpinner();
        jbAceptar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jpSeleccionarImagen = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtfRuta = new javax.swing.JTextField();
        jbCargarImagen = new javax.swing.JButton();
        jlSeleccionarImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jpContenido.setPreferredSize(new java.awt.Dimension(500, 314));

        jlDimension.setText("Dimensión del juego (Filas, Columnas)");

        jpDimension.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(18, 30, 49)));

        jLabel9.setText("Dimensión:");

        jsDimension.setModel(new javax.swing.SpinnerNumberModel(3, 3, 10, 1));
        jsDimension.setEditor(new javax.swing.JSpinner.NumberEditor(jsDimension, ""));

        javax.swing.GroupLayout jpDimensionLayout = new javax.swing.GroupLayout(jpDimension);
        jpDimension.setLayout(jpDimensionLayout);
        jpDimensionLayout.setHorizontalGroup(
            jpDimensionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDimensionLayout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsDimension, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
        );
        jpDimensionLayout.setVerticalGroup(
            jpDimensionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDimensionLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jpDimensionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jsDimension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jbAceptar.setText("Aceptar");
        jbAceptar.setEnabled(false);
        jbAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAceptarActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jpSeleccionarImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(18, 30, 49)));

        jLabel2.setText("Ruta:");

        jtfRuta.setEditable(false);

        jbCargarImagen.setText("Cargar");
        jbCargarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCargarImagenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpSeleccionarImagenLayout = new javax.swing.GroupLayout(jpSeleccionarImagen);
        jpSeleccionarImagen.setLayout(jpSeleccionarImagenLayout);
        jpSeleccionarImagenLayout.setHorizontalGroup(
            jpSeleccionarImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSeleccionarImagenLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(jtfRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jbCargarImagen)
                .addGap(10, 10, 10))
        );
        jpSeleccionarImagenLayout.setVerticalGroup(
            jpSeleccionarImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSeleccionarImagenLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jpSeleccionarImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCargarImagen))
                .addGap(26, 26, 26))
        );

        jlSeleccionarImagen.setText("Seleccionar una imagen");

        javax.swing.GroupLayout jpContenidoLayout = new javax.swing.GroupLayout(jpContenido);
        jpContenido.setLayout(jpContenidoLayout);
        jpContenidoLayout.setHorizontalGroup(
            jpContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContenidoLayout.createSequentialGroup()
                .addGroup(jpContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpContenidoLayout.createSequentialGroup()
                        .addGroup(jpContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpContenidoLayout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(jlDimension))
                            .addGroup(jpContenidoLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jpContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jpContenidoLayout.createSequentialGroup()
                                        .addComponent(jbAceptar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbCancelar))
                                    .addComponent(jpDimension, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jpSeleccionarImagen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(30, 30, 30))
                    .addGroup(jpContenidoLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jlSeleccionarImagen)
                        .addGap(150, 150, 150)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpContenidoLayout.setVerticalGroup(
            jpContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContenidoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jlDimension)
                .addGap(18, 18, 18)
                .addComponent(jpDimension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jlSeleccionarImagen)
                .addGap(20, 20, 20)
                .addComponent(jpSeleccionarImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jpContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelar)
                    .addComponent(jbAceptar))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpContenido, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAceptarActionPerformed
        Control.iniciarTableroPersonalizado(this, (int) jsDimension.getValue(), new File(jtfRuta.getText()));
    }//GEN-LAST:event_jbAceptarActionPerformed

    private void jbCargarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCargarImagenActionPerformed
        JFileChooser JFC = new JFileChooser();
        JFC.addChoosableFileFilter(new FileNameExtensionFilter("JPEG & PNG file", "jpg", "jpeg", "JPG", "JPEG", "png", "PNG"));
        if (JFC.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            rutaImagen = JFC.getSelectedFile();
            jtfRuta.setText(rutaImagen.getAbsolutePath());
            //ControlJuego.setRutaImagen(rutaImagen.getAbsolutePath());
            jbAceptar.setEnabled(true);
        }
    }//GEN-LAST:event_jbCargarImagenActionPerformed
}
