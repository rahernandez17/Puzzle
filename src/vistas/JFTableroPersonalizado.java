package vistas;

import control.*;
import java.io.*;
import javax.swing.*;
import javax.swing.filechooser.*;

public class JFTableroPersonalizado extends javax.swing.JFrame {

    private File rutaImagen;
    
    public JFTableroPersonalizado() {
        super("Nuevo Tablero Personalizado");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPcontenido = new javax.swing.JPanel();
        JLdimension = new javax.swing.JLabel();
        JPdimension = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        JSdimension = new javax.swing.JSpinner();
        JBaceptar = new javax.swing.JButton();
        JBcancelar = new javax.swing.JButton();
        JPseleccionarImagen = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        JTFruta = new javax.swing.JTextField();
        JBcargarImagen = new javax.swing.JButton();
        JLseleccionarImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        JPcontenido.setPreferredSize(new java.awt.Dimension(500, 314));

        JLdimension.setText("Dimensión del juego (Filas, Columnas)");

        JPdimension.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(18, 30, 49)));

        jLabel9.setText("Dimensión:");

        JSdimension.setModel(new javax.swing.SpinnerNumberModel(3, 3, 10, 1));
        JSdimension.setEditor(new javax.swing.JSpinner.NumberEditor(JSdimension, ""));

        javax.swing.GroupLayout JPdimensionLayout = new javax.swing.GroupLayout(JPdimension);
        JPdimension.setLayout(JPdimensionLayout);
        JPdimensionLayout.setHorizontalGroup(
            JPdimensionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPdimensionLayout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JSdimension, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
        );
        JPdimensionLayout.setVerticalGroup(
            JPdimensionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPdimensionLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(JPdimensionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(JSdimension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        JBaceptar.setText("Aceptar");
        JBaceptar.setEnabled(false);
        JBaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBaceptarActionPerformed(evt);
            }
        });

        JBcancelar.setText("Cancelar");
        JBcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBcancelarActionPerformed(evt);
            }
        });

        JPseleccionarImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(18, 30, 49)));

        jLabel2.setText("Ruta:");

        JTFruta.setEditable(false);

        JBcargarImagen.setText("Cargar");
        JBcargarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBcargarImagenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPseleccionarImagenLayout = new javax.swing.GroupLayout(JPseleccionarImagen);
        JPseleccionarImagen.setLayout(JPseleccionarImagenLayout);
        JPseleccionarImagenLayout.setHorizontalGroup(
            JPseleccionarImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPseleccionarImagenLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(JTFruta, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(JBcargarImagen)
                .addGap(10, 10, 10))
        );
        JPseleccionarImagenLayout.setVerticalGroup(
            JPseleccionarImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPseleccionarImagenLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(JPseleccionarImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTFruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBcargarImagen))
                .addGap(26, 26, 26))
        );

        JLseleccionarImagen.setText("Seleccionar una imagen");

        javax.swing.GroupLayout JPcontenidoLayout = new javax.swing.GroupLayout(JPcontenido);
        JPcontenido.setLayout(JPcontenidoLayout);
        JPcontenidoLayout.setHorizontalGroup(
            JPcontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPcontenidoLayout.createSequentialGroup()
                .addGroup(JPcontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPcontenidoLayout.createSequentialGroup()
                        .addGroup(JPcontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPcontenidoLayout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(JLdimension))
                            .addGroup(JPcontenidoLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(JPcontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(JPcontenidoLayout.createSequentialGroup()
                                        .addComponent(JBaceptar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JBcancelar))
                                    .addComponent(JPdimension, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JPseleccionarImagen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(30, 30, 30))
                    .addGroup(JPcontenidoLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(JLseleccionarImagen)
                        .addGap(150, 150, 150)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPcontenidoLayout.setVerticalGroup(
            JPcontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPcontenidoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(JLdimension)
                .addGap(18, 18, 18)
                .addComponent(JPdimension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(JLseleccionarImagen)
                .addGap(20, 20, 20)
                .addComponent(JPseleccionarImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(JPcontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBcancelar)
                    .addComponent(JBaceptar))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPcontenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPcontenido, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void JBcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBcancelarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_JBcancelarActionPerformed

    private void JBaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBaceptarActionPerformed
        Control.iniciarTableroPersonalizado(this, (int) JSdimension.getValue(), new File(JTFruta.getText()));
    }//GEN-LAST:event_JBaceptarActionPerformed

    private void JBcargarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBcargarImagenActionPerformed
        JFileChooser JFC = new JFileChooser();
        JFC.addChoosableFileFilter(new FileNameExtensionFilter("JPEG & PNG file", "jpg", "jpeg", "JPG", "JPEG", "png", "PNG"));
        if (JFC.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            rutaImagen = JFC.getSelectedFile();
            JTFruta.setText(rutaImagen.getAbsolutePath());
            //ControlJuego.setRutaImagen(rutaImagen.getAbsolutePath());
            JBaceptar.setEnabled(true);
        }
    }//GEN-LAST:event_JBcargarImagenActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBaceptar;
    private javax.swing.JButton JBcancelar;
    private javax.swing.JButton JBcargarImagen;
    private javax.swing.JLabel JLdimension;
    private javax.swing.JLabel JLseleccionarImagen;
    private javax.swing.JPanel JPcontenido;
    private javax.swing.JPanel JPdimension;
    private javax.swing.JPanel JPseleccionarImagen;
    private javax.swing.JSpinner JSdimension;
    private javax.swing.JTextField JTFruta;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
