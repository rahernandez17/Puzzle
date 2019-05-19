package vistas;

import control.*;
import java.awt.*;

public class JFTableroNumeros extends javax.swing.JFrame {
    
    public JFTableroNumeros() {
        super("Nuevo Tablero Con Números");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPcontenido = new javax.swing.JPanel();
        JPbackground = new javax.swing.JPanel();
        JSRedBackground = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JSGreenBackground = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        JSBlueBackground = new javax.swing.JSpinner();
        JLbackground = new javax.swing.JLabel();
        JPcolorTexto = new javax.swing.JPanel();
        JSRedText = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JSGreenText = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        JSBlueText = new javax.swing.JSpinner();
        JLcolorTexto = new javax.swing.JLabel();
        JPdimension = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        JSdimension = new javax.swing.JSpinner();
        JLdimension = new javax.swing.JLabel();
        JBcancelar = new javax.swing.JButton();
        JBaceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);

        JPbackground.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(18, 30, 49)));

        JSRedBackground.setModel(new javax.swing.SpinnerNumberModel(255, 0, 255, 1));

        jLabel2.setText("Red:");

        jLabel3.setText("Green:");

        JSGreenBackground.setModel(new javax.swing.SpinnerNumberModel(255, 0, 255, 1));

        jLabel4.setText("Blue:");

        JSBlueBackground.setModel(new javax.swing.SpinnerNumberModel(255, 0, 255, 1));

        javax.swing.GroupLayout JPbackgroundLayout = new javax.swing.GroupLayout(JPbackground);
        JPbackground.setLayout(JPbackgroundLayout);
        JPbackgroundLayout.setHorizontalGroup(
            JPbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPbackgroundLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(JSRedBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addGap(5, 5, 5)
                .addComponent(JSGreenBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addGap(5, 5, 5)
                .addComponent(JSBlueBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        JPbackgroundLayout.setVerticalGroup(
            JPbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPbackgroundLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(JPbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JSRedBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(JSGreenBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(JSBlueBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        JLbackground.setText("Background de las piezas");

        JPcolorTexto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(18, 30, 49)));

        JSRedText.setModel(new javax.swing.SpinnerNumberModel(0, 0, 255, 1));

        jLabel5.setText("Red:");

        jLabel6.setText("Green:");

        JSGreenText.setModel(new javax.swing.SpinnerNumberModel(0, 0, 255, 1));

        jLabel7.setText("Blue:");

        JSBlueText.setModel(new javax.swing.SpinnerNumberModel(0, 0, 255, 1));

        javax.swing.GroupLayout JPcolorTextoLayout = new javax.swing.GroupLayout(JPcolorTexto);
        JPcolorTexto.setLayout(JPcolorTextoLayout);
        JPcolorTextoLayout.setHorizontalGroup(
            JPcolorTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPcolorTextoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel5)
                .addGap(5, 5, 5)
                .addComponent(JSRedText, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel6)
                .addGap(5, 5, 5)
                .addComponent(JSGreenText, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel7)
                .addGap(5, 5, 5)
                .addComponent(JSBlueText, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        JPcolorTextoLayout.setVerticalGroup(
            JPcolorTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPcolorTextoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(JPcolorTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JSRedText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(JSGreenText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(JSBlueText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        JLcolorTexto.setText("Color del texto (Número)");

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

        JLdimension.setText("Dimensión del juego (Filas, Columnas)");

        JBcancelar.setText("Cancelar");
        JBcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBcancelarActionPerformed(evt);
            }
        });

        JBaceptar.setText("Aceptar");
        JBaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBaceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPcontenidoLayout = new javax.swing.GroupLayout(JPcontenido);
        JPcontenido.setLayout(JPcontenidoLayout);
        JPcontenidoLayout.setHorizontalGroup(
            JPcontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPcontenidoLayout.createSequentialGroup()
                .addComponent(JLdimension)
                .addGap(78, 78, 78))
            .addGroup(JPcontenidoLayout.createSequentialGroup()
                .addGroup(JPcontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPcontenidoLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(JLcolorTexto))
                    .addGroup(JPcontenidoLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(JLbackground))
                    .addGroup(JPcontenidoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(JPcontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(JPcontenidoLayout.createSequentialGroup()
                                .addComponent(JBaceptar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JBcancelar))
                            .addGroup(JPcontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(JPcolorTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JPbackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JPdimension, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(30, 30, 30))
        );
        JPcontenidoLayout.setVerticalGroup(
            JPcontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPcontenidoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(JLbackground)
                .addGap(18, 18, 18)
                .addComponent(JPbackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JLcolorTexto)
                .addGap(18, 18, 18)
                .addComponent(JPcolorTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JLdimension)
                .addGap(18, 18, 18)
                .addComponent(JPdimension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
            .addComponent(JPcontenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBaceptarActionPerformed
        Control.iniciarTableroNumeros(this, (int)JSdimension.getValue(),
            new Color((int)JSRedBackground.getValue(),(int)JSGreenBackground.getValue(),(int)JSBlueBackground.getValue()),
            new Color((int)JSRedText.getValue(),(int)JSGreenText.getValue(),(int)JSBlueText.getValue()));
    }//GEN-LAST:event_JBaceptarActionPerformed

    private void JBcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBcancelarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_JBcancelarActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBaceptar;
    private javax.swing.JButton JBcancelar;
    private javax.swing.JLabel JLbackground;
    private javax.swing.JLabel JLcolorTexto;
    private javax.swing.JLabel JLdimension;
    private javax.swing.JPanel JPbackground;
    private javax.swing.JPanel JPcolorTexto;
    private javax.swing.JPanel JPcontenido;
    private javax.swing.JPanel JPdimension;
    private javax.swing.JSpinner JSBlueBackground;
    private javax.swing.JSpinner JSBlueText;
    private javax.swing.JSpinner JSGreenBackground;
    private javax.swing.JSpinner JSGreenText;
    private javax.swing.JSpinner JSRedBackground;
    private javax.swing.JSpinner JSRedText;
    private javax.swing.JSpinner JSdimension;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
