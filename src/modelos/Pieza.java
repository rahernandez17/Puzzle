package modelos;

import control.Control;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Pieza {
    
    private int x;
    private int y;
    private final int id;
    private final int width;
    private final int height;
    private Color colorPieza;
    private Color colorTexto;
    private BufferedImage imagen;
    private String direccion;
    
    private JButton piezaBoton;
    
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

    public JButton getPiezaBoton() {
        return piezaBoton;
    }
    
    /*Métodos*/
    private void initComponent(){
        piezaBoton = new JButton();
        piezaBoton.setVisible(true);
        piezaBoton.setPreferredSize(new Dimension(width, height));
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
                piezaMouseReleased();
            }
        });
    }
    
    private void ponerImagen(){
        if(id != 0 )
            piezaBoton.setIcon(new ImageIcon(imagen.getSubimage(x, y, width, height)));
    }
    
    private void ponerNumero(){
        if(id != 0 ){
            piezaBoton.setText(String.valueOf(id));
            piezaBoton.setFont(new Font("Arial", 0, 20));
            piezaBoton.setBackground(colorPieza);
            piezaBoton.setForeground(colorTexto);
        }
    }
    
    public void imagenMouseDragged(MouseEvent evt){
        if(id != 0){
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
    
    public void piezaMouseReleased(){
        Control.moverPieza(id);
    }
    
}