package vistas;

public class JFEstadisticas extends javax.swing.JFrame {
    
    //private String partidasJugadas, partidasGanadas, tiempoJugado;
    
    public JFEstadisticas(String partidasGanadas, String partidasJugadas, String tiempoJugado, String movimientos, String dimensionFavorita, String modalidadFavorita) {
        initComponents();
        JLpartidasGanadas.setText(partidasGanadas);
        JLpartidasJugadas.setText(partidasJugadas);
        JLtiempoJugado.setText(tiempoJugado);
        JLmovimientos.setText(movimientos);
        JLdimensionFavorita.setText(dimensionFavorita);
        JLmodalidadFavorita.setText(modalidadFavorita);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPcontenido = new javax.swing.JPanel();
        JLtitulo = new javax.swing.JLabel();
        JLpartidasJugadas = new javax.swing.JLabel();
        JLpartidasGanadas = new javax.swing.JLabel();
        JLtiempoJugado = new javax.swing.JLabel();
        JLmovimientos = new javax.swing.JLabel();
        JLdimensionFavorita = new javax.swing.JLabel();
        JLmodalidadFavorita = new javax.swing.JLabel();
        JBcerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        JLtitulo.setText("ESTADÍSTICAS");

        JLpartidasJugadas.setPreferredSize(new java.awt.Dimension(392, 15));

        JLpartidasGanadas.setPreferredSize(new java.awt.Dimension(392, 15));

        JLtiempoJugado.setPreferredSize(new java.awt.Dimension(392, 15));

        JLmovimientos.setPreferredSize(new java.awt.Dimension(392, 15));

        JLdimensionFavorita.setPreferredSize(new java.awt.Dimension(392, 15));

        JLmodalidadFavorita.setPreferredSize(new java.awt.Dimension(392, 15));

        JBcerrar.setText("Cerrar");
        JBcerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBcerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPcontenidoLayout = new javax.swing.GroupLayout(JPcontenido);
        JPcontenido.setLayout(JPcontenidoLayout);
        JPcontenidoLayout.setHorizontalGroup(
            JPcontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPcontenidoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(JPcontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JLpartidasJugadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLpartidasGanadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLtiempoJugado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLmovimientos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLdimensionFavorita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLmodalidadFavorita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPcontenidoLayout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addGroup(JPcontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPcontenidoLayout.createSequentialGroup()
                        .addComponent(JBcerrar)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPcontenidoLayout.createSequentialGroup()
                        .addComponent(JLtitulo)
                        .addGap(169, 169, 169))))
        );
        JPcontenidoLayout.setVerticalGroup(
            JPcontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPcontenidoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(JLtitulo)
                .addGap(30, 30, 30)
                .addComponent(JLpartidasJugadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(JLpartidasGanadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(JLtiempoJugado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(JLmovimientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JLdimensionFavorita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JLmodalidadFavorita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(JBcerrar)
                .addGap(20, 20, 20))
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

    private void JBcerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBcerrarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_JBcerrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBcerrar;
    private javax.swing.JLabel JLdimensionFavorita;
    private javax.swing.JLabel JLmodalidadFavorita;
    private javax.swing.JLabel JLmovimientos;
    private javax.swing.JLabel JLpartidasGanadas;
    private javax.swing.JLabel JLpartidasJugadas;
    private javax.swing.JLabel JLtiempoJugado;
    private javax.swing.JLabel JLtitulo;
    private javax.swing.JPanel JPcontenido;
    // End of variables declaration//GEN-END:variables
}
