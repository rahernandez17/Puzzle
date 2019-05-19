package modelos;

import control.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.swing.*;

public class Pieza extends JButton {
    
    private int  x, y, id;
    private final int width, height;
    private Color colorPieza, colorTexto;
    private BufferedImage imagen;
    private String direccion;
    
    /*Constructores*/
    public Pieza(int id, int x, int  y, int width, int height, BufferedImage imagen) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.imagen = imagen;
        initComponent();
        ponerImagen();
    }
    
    public Pieza(int id, int width, int height, Color colorPieza, Color colorTexto) {
        this.id = id;
        this.width = width;
        this.height = height;
        this.colorPieza = colorPieza;
        this.colorTexto = colorTexto;
        initComponent();
        ponerNumero();
    }

    /*Métodos Get*/
    public int getId(){
        return id;
    }
    
    public BufferedImage getImagen() {
        return imagen;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    /*Métodos*/
    private void initComponent(){
        setVisible(true);
        setPreferredSize(new Dimension(width, height));
        direccion = "";
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent evt) {
                imagenMouseDragged(evt);
            }
        });
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent evt) {
                piezaMouseReleased(evt);
            }
        });
    }
    
    private void ponerImagen(){
        if(id != 0 )
            setIcon(new ImageIcon(imagen.getSubimage(x, y, width, height)));
    }
    private void ponerNumero(){
        if(id != 0 ){
            setText(String.valueOf(id));
            setFont(new Font("Arial", 0, 20));
            setBackground(colorPieza);
            setForeground(colorTexto);
        }
    }
    
    public void imagenMouseDragged(MouseEvent evt){
        if(id != 0){
            if (evt.getX() < 0)
                direccion = "IZQUIERDA";
            else if(evt.getX() > getHeight())
                direccion = "DERECHA";
            else if(evt.getY() < 0)
                direccion = "ARRIBA";
            else if(evt.getY() > getWidth())
                direccion = "ABAJO";
            else
                direccion = "";
        }
    }
    
    public void piezaMouseReleased(MouseEvent evt){
        Control.moverPieza(id);
    }
    
}