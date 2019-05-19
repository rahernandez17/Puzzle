package vistas;

import control.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class JFTableroImagen extends javax.swing.JFrame {
    
    private File imagenes[];
    private DefaultListModel modelo;
    
    public JFTableroImagen() {
        super("Nuevo Tablero Con Imagen Predeterminada");       
        loadImagenes();
        initComponents();
    }
    
   /*Métodos*/ 
    private void loadImagenes(){
        imagenes = new File("src/imagenes/").listFiles();
        modelo = new DefaultListModel();
        for(int i = 0; i < imagenes.length; i++)
            modelo.addElement(imagenes[i].getName());
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
        JPcargarImagen = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JLlistalImagenes = new javax.swing.JList<>();
        JLthumbnail = new javax.swing.JLabel();
        JLseleccionrarImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

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
                .addGap(110, 110, 110)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JSdimension, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
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

        JPcargarImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(18, 30, 49)));

        JLlistalImagenes.setModel(modelo);
        JLlistalImagenes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        JLlistalImagenes.setSelectedIndex(0);
        JLlistalImagenes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JLlistalImagenesMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(JLlistalImagenes);

        JLthumbnail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(18, 30, 49)));
        JLthumbnail.setPreferredSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout JPcargarImagenLayout = new javax.swing.GroupLayout(JPcargarImagen);
        JPcargarImagen.setLayout(JPcargarImagenLayout);
        JPcargarImagenLayout.setHorizontalGroup(
            JPcargarImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPcargarImagenLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(JLthumbnail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        JPcargarImagenLayout.setVerticalGroup(
            JPcargarImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPcargarImagenLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(JPcargarImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JLthumbnail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(20, 20, 20))
        );

        JLseleccionrarImagen.setText("Seleciona una imagen");

        javax.swing.GroupLayout JPcontenidoLayout = new javax.swing.GroupLayout(JPcontenido);
        JPcontenido.setLayout(JPcontenidoLayout);
        JPcontenidoLayout.setHorizontalGroup(
            JPcontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPcontenidoLayout.createSequentialGroup()
                .addGroup(JPcontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JPcontenidoLayout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(JBaceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBcancelar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPcontenidoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(JPcontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JPcargarImagen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPcontenidoLayout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(JLdimension)
                                .addGap(48, 48, 48))
                            .addComponent(JPdimension, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(30, 30, 30))
            .addGroup(JPcontenidoLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(JLseleccionrarImagen)
                .addContainerGap())
        );
        JPcontenidoLayout.setVerticalGroup(
            JPcontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPcontenidoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(JLdimension)
                .addGap(18, 18, 18)
                .addComponent(JPdimension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(JLseleccionrarImagen)
                .addGap(10, 10, 10)
                .addComponent(JPcargarImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(JPcontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBcancelar)
                    .addComponent(JBaceptar))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPcontenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPcontenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JLlistalImagenesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLlistalImagenesMousePressed
        int elementoSeleccionado = JLlistalImagenes.getSelectedIndex();
        JLthumbnail.removeAll();
        try {
            BufferedImage imagen = ImageIO.read(imagenes[elementoSeleccionado]);
            JLthumbnail.setIcon(new ImageIcon(Control.redimensionarImagen(imagen, 150, 150)));
        } catch (IOException ex) {
            System.out.println("No se pudo abrir la imagen");
        }
    }//GEN-LAST:event_JLlistalImagenesMousePressed

    private void JBaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBaceptarActionPerformed
        Control.iniciarTableroImagen(this, (int)JSdimension.getValue(), imagenes[JLlistalImagenes.getSelectedIndex()]);
    }//GEN-LAST:event_JBaceptarActionPerformed

    private void JBcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBcancelarActionPerformed
       setVisible(false);
    }//GEN-LAST:event_JBcancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBaceptar;
    private javax.swing.JButton JBcancelar;
    private javax.swing.JLabel JLdimension;
    private javax.swing.JList<String> JLlistalImagenes;
    private javax.swing.JLabel JLseleccionrarImagen;
    private javax.swing.JLabel JLthumbnail;
    private javax.swing.JPanel JPcargarImagen;
    private javax.swing.JPanel JPcontenido;
    private javax.swing.JPanel JPdimension;
    private javax.swing.JSpinner JSdimension;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
