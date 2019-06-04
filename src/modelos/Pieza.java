package modelos;

import control.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.swing.*;

public class Pieza {
    
    private int x;
    private int y;
    private final int ID;
    private final int WIDTH;
    private final int HEIGHT;
    private Color colorPieza;
    private Color colorTexto;
    private BufferedImage imagen;
    private String direccion;
    
    private JButton piezaBoton;
    
    /*Constructores*/
    public Pieza(int id, int x, int  y, int width, int height, BufferedImage imagen) {
        this.ID = id;
        this.x = x;
        this.y = y;
        this.WIDTH = width;
        this.HEIGHT = height;
        this.imagen = imagen;
        initComponent();
        ponerImagen();
    }
    
    public Pieza(int id, int width, int height, Color colorPieza, Color colorTexto) {
        this.ID = id;
        this.WIDTH = width;
        this.HEIGHT = height;
        this.colorPieza = colorPieza;
        this.colorTexto = colorTexto;
        initComponent();
        ponerNumero();
    }

    /*Métodos Get*/
    public int getId(){
        return ID;
    }
    
    public BufferedImage getImagen() {
        return imagen;
    }
    
    public String getDireccion(){
        return direccion;
    }

    public JButton getPiezaBoton() {
        return piezaBoton;
    }
    
    /*Métodos*/
    private void initComponent(){
        piezaBoton = new JButton();
        piezaBoton.setVisible(true);
        piezaBoton.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        direccion = "";
        piezaBoton.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent evt) {
                imagenMouseDragged(evt);
            }
        });
        piezaBoton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent evt) {
                piezaMouseReleased(evt);
            }
        });
    }
    
    private void ponerImagen(){
        if(ID != 0 )
            piezaBoton.setIcon(new ImageIcon(imagen.getSubimage(x, y, WIDTH, HEIGHT)));
    }
    
    private void ponerNumero(){
        if(ID != 0 ){
            piezaBoton.setText(String.valueOf(ID));
            piezaBoton.setFont(new Font("Arial", 0, 20));
            piezaBoton.setBackground(colorPieza);
            piezaBoton.setForeground(colorTexto);
        }
    }
    
    public void imagenMouseDragged(MouseEvent evt){
        if(ID != 0){
            if (evt.getX() < 0)
                direccion = "IZQUIERDA";
            else if(evt.getX() > piezaBoton.getHeight())
                direccion = "DERECHA";
            else if(evt.getY() < 0)
                direccion = "ARRIBA";
            else if(evt.getY() > piezaBoton.getWidth())
                direccion = "ABAJO";
            else
                direccion = "";
        }
    }
    
    public void piezaMouseReleased(MouseEvent evt){
        Control.moverPieza(ID);
    }
    
}