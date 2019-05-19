package vistas;

import control.Control;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


public class JFPuzzle extends javax.swing.JFrame {

    private BufferedImage imagen;
    private final JFTableroImagen modalTableroImagen;
    private final JFTableroNumeros modalTableroNumeros;
    private final JFTableroPersonalizado modalTableroPersonalizado;
    private JFEstadisticas modalEstadisticas;

    public JFPuzzle() {
        super("Puzzle 2D");
        initComponents();
        modalTableroImagen = new JFTableroImagen();
        modalTableroNumeros = new JFTableroNumeros();
        modalTableroPersonalizado = new JFTableroPersonalizado();
    }

    /*Métodos Set*/
    public void setImagen(BufferedImage imagen) {
        this.imagen = imagen;
    }

    /*Métodos get*/
    public JPanel getJPjuego() {
        return JPjuego;
    }

    public JLabel getJLthumbnail() {
        return JLthumbnail;
    }

    public JTextField getJTFtiempo() {
        return JTFtiempo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPcontenido = new javax.swing.JPanel();
        JPjuego = new javax.swing.JPanel();
        JLthumbnail = new javax.swing.JLabel();
        JTFtiempo = new javax.swing.JTextField();
        JLtiempo = new javax.swing.JLabel();
        JMBnav = new javax.swing.JMenuBar();
        JMarchivo = new javax.swing.JMenu();
        JMnuevo = new javax.swing.JMenu();
        JMItableroImagenes = new javax.swing.JMenuItem();
        JMItableroNumeros = new javax.swing.JMenuItem();
        JSseparador = new javax.swing.JPopupMenu.Separator();
        JMItableroPersonalizado = new javax.swing.JMenuItem();
        JMIborrarEstadisticas = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        JMIsalir = new javax.swing.JMenuItem();
        JMeditar = new javax.swing.JMenu();
        JMsonido = new javax.swing.JMenu();
        JMIplay = new javax.swing.JMenuItem();
        JMIstop = new javax.swing.JMenuItem();
        JMIestadisticas = new javax.swing.JMenu();
        JMIextadisticas = new javax.swing.JMenuItem();
        JMayuda = new javax.swing.JMenu();
        JMIayuda = new javax.swing.JMenuItem();
        JMIacerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon("src/recursos/imagenes/icon.png").getImage());
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        JPcontenido.setToolTipText("");
        JPcontenido.setPreferredSize(new java.awt.Dimension(900, 800));

        JPjuego.setBackground(new java.awt.Color(20, 34, 55));
        JPjuego.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(173, 171, 168), new java.awt.Color(97, 97, 97)));
        JPjuego.setPreferredSize(new java.awt.Dimension(600, 600));

        org.jdesktop.layout.GroupLayout JPjuegoLayout = new org.jdesktop.layout.GroupLayout(JPjuego);
        JPjuego.setLayout(JPjuegoLayout);
        JPjuegoLayout.setHorizontalGroup(
            JPjuegoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 596, Short.MAX_VALUE)
        );
        JPjuegoLayout.setVerticalGroup(
            JPjuegoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 596, Short.MAX_VALUE)
        );

        JLthumbnail.setBackground(new java.awt.Color(18, 30, 49));
        JLthumbnail.setForeground(new java.awt.Color(18, 30, 49));
        JLthumbnail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(18, 30, 49)));
        JLthumbnail.setPreferredSize(new java.awt.Dimension(150, 150));
        JLthumbnail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JLthumbnailMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JLthumbnailMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JLthumbnailMouseEntered(evt);
            }
        });

        JTFtiempo.setEditable(false);
        JTFtiempo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTFtiempo.setText("0:0:0");
        JTFtiempo.setPreferredSize(new java.awt.Dimension(90, 25));

        JLtiempo.setText("Tiempo:");
        JLtiempo.setPreferredSize(new java.awt.Dimension(56, 25));

        org.jdesktop.layout.GroupLayout JPcontenidoLayout = new org.jdesktop.layout.GroupLayout(JPcontenido);
        JPcontenido.setLayout(JPcontenidoLayout);
        JPcontenidoLayout.setHorizontalGroup(
            JPcontenidoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(JPcontenidoLayout.createSequentialGroup()
                .add(33, 33, 33)
                .add(JPjuego, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(35, 35, 35)
                .add(JPcontenidoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(JPcontenidoLayout.createSequentialGroup()
                        .add(JLtiempo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(6, 6, 6)
                        .add(JTFtiempo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(JLthumbnail, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(35, 35, 35))
        );
        JPcontenidoLayout.setVerticalGroup(
            JPcontenidoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(JPcontenidoLayout.createSequentialGroup()
                .add(33, 33, 33)
                .add(JPcontenidoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(JPcontenidoLayout.createSequentialGroup()
                        .add(JLthumbnail, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(JPcontenidoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(JTFtiempo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(JLtiempo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(JPjuego, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(30, 30, 30))
        );

        JMBnav.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        JMBnav.setForeground(new java.awt.Color(181, 181, 181));

        JMarchivo.setText("Archivo");

        JMnuevo.setText("Nuevo");

        JMItableroImagenes.setText("Tablero Con Imagen Predeterminada");
        JMItableroImagenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMItableroImagenesActionPerformed(evt);
            }
        });
        JMnuevo.add(JMItableroImagenes);

        JMItableroNumeros.setText("Tablero Con Números");
        JMItableroNumeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMItableroNumerosActionPerformed(evt);
            }
        });
        JMnuevo.add(JMItableroNumeros);
        JMnuevo.add(JSseparador);

        JMItableroPersonalizado.setText("Tablero Personalizado");
        JMItableroPersonalizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMItableroPersonalizadoActionPerformed(evt);
            }
        });
        JMnuevo.add(JMItableroPersonalizado);

        JMarchivo.add(JMnuevo);

        JMIborrarEstadisticas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        JMIborrarEstadisticas.setText("Borrar Estadísticas");
        JMIborrarEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIborrarEstadisticasActionPerformed(evt);
            }
        });
        JMarchivo.add(JMIborrarEstadisticas);
        JMarchivo.add(jSeparator1);

        JMIsalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        JMIsalir.setText("Salir");
        JMIsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIsalirActionPerformed(evt);
            }
        });
        JMarchivo.add(JMIsalir);

        JMBnav.add(JMarchivo);

        JMeditar.setText("Editar");

        JMsonido.setText("Sonido");

        JMIplay.setText("Play");
        JMIplay.setEnabled(false);
        JMIplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIplayActionPerformed(evt);
            }
        });
        JMsonido.add(JMIplay);

        JMIstop.setText("Stop");
        JMIstop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIstopActionPerformed(evt);
            }
        });
        JMsonido.add(JMIstop);

        JMeditar.add(JMsonido);

        JMBnav.add(JMeditar);

        JMIestadisticas.setText("Ver");

        JMIextadisticas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        JMIextadisticas.setText("Estadísticas");
        JMIextadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIextadisticasActionPerformed(evt);
            }
        });
        JMIestadisticas.add(JMIextadisticas);

        JMBnav.add(JMIestadisticas);

        JMayuda.setText("Ayuda");

        JMIayuda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        JMIayuda.setText("Ver La Ayuda");
        JMayuda.add(JMIayuda);

        JMIacerca.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        JMIacerca.setText("Acerca De Puzzle 2D");
        JMayuda.add(JMIacerca);

        JMBnav.add(JMayuda);

        setJMenuBar(JMBnav);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(JPcontenido, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 851, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(JPcontenido, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 660, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMItableroImagenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMItableroImagenesActionPerformed
        modalTableroImagen.setVisible(true);
    }//GEN-LAST:event_JMItableroImagenesActionPerformed

    private void JMItableroNumerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMItableroNumerosActionPerformed

        modalTableroNumeros.setVisible(true);
    }//GEN-LAST:event_JMItableroNumerosActionPerformed

    private void JMItableroPersonalizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMItableroPersonalizadoActionPerformed

        modalTableroPersonalizado.setVisible(true);
    }//GEN-LAST:event_JMItableroPersonalizadoActionPerformed

    private void JLthumbnailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLthumbnailMouseEntered
        JLthumbnail.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_JLthumbnailMouseEntered

    private void JLthumbnailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLthumbnailMouseExited
        JLthumbnail.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_JLthumbnailMouseExited

    private void JLthumbnailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLthumbnailMousePressed
        try {
            new JFThumbnail(imagen).setVisible(true);
        } catch (NullPointerException NPe) {
            System.out.println("No se cargó una imagen para el thumbnail");
        }
    }//GEN-LAST:event_JLthumbnailMousePressed

    private void JMIsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIsalirActionPerformed

        Control.salir();
    }//GEN-LAST:event_JMIsalirActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Control.guardarEstadisticas();
        Control.guardarPartida();
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            Control.leerEstadisticas();
            Control.leerPartida();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException | NoSuchElementException | NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_formWindowOpened

    private void JMIextadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIextadisticasActionPerformed

        Control.mostrarEstadisticas(modalEstadisticas);
    }//GEN-LAST:event_JMIextadisticasActionPerformed

    private void JMIborrarEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIborrarEstadisticasActionPerformed

        Control.borrarEstadisticas();
    }//GEN-LAST:event_JMIborrarEstadisticasActionPerformed

    private void JMIplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIplayActionPerformed
        JMIplay.setEnabled(false);
        JMIstop.setEnabled(true);
    }//GEN-LAST:event_JMIplayActionPerformed

    private void JMIstopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIstopActionPerformed

        JMIplay.setEnabled(true);
        JMIstop.setEnabled(false);
    }//GEN-LAST:event_JMIstopActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLthumbnail;
    private javax.swing.JLabel JLtiempo;
    private javax.swing.JMenuBar JMBnav;
    private javax.swing.JMenuItem JMIacerca;
    private javax.swing.JMenuItem JMIayuda;
    private javax.swing.JMenuItem JMIborrarEstadisticas;
    private javax.swing.JMenu JMIestadisticas;
    private javax.swing.JMenuItem JMIextadisticas;
    private javax.swing.JMenuItem JMIplay;
    private javax.swing.JMenuItem JMIsalir;
    private javax.swing.JMenuItem JMIstop;
    private javax.swing.JMenuItem JMItableroImagenes;
    private javax.swing.JMenuItem JMItableroNumeros;
    private javax.swing.JMenuItem JMItableroPersonalizado;
    private javax.swing.JMenu JMarchivo;
    private javax.swing.JMenu JMayuda;
    private javax.swing.JMenu JMeditar;
    private javax.swing.JMenu JMnuevo;
    private javax.swing.JMenu JMsonido;
    private javax.swing.JPanel JPcontenido;
    private javax.swing.JPanel JPjuego;
    private javax.swing.JPopupMenu.Separator JSseparador;
    private javax.swing.JTextField JTFtiempo;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
