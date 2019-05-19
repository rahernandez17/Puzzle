package vistas;

import control.*;
import javax.swing.*;
import modelos.*;

public class JFSplash extends javax.swing.JFrame {
    
    private BarraProgreso carga;

    public JFSplash() {
        initComponents();
        carga = new BarraProgreso(JProgreso);
        carga.start();        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPcontenido = new javax.swing.JPanel();
        JProgreso = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon("src/recursos/imagenes/icon.png").getImage());
        setResizable(false);

        JPcontenido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JProgreso.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                JProgresoStateChanged(evt);
            }
        });
        JPcontenido.add(JProgreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 650, 20));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cargando...");
        JPcontenido.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagenes/presentacion.JPG"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(650, 542));
        JPcontenido.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void JProgresoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_JProgresoStateChanged
        if (JProgreso.getValue() == 100) {
            dispose();
            Control.initComponents();
        }
    }//GEN-LAST:event_JProgresoStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPcontenido;
    private javax.swing.JProgressBar JProgreso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
