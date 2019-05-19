package modelos;

import javax.swing.JProgressBar;

public class BarraProgreso extends Thread{
    
    private final JProgressBar progreso;
    
    /*Contrucctor*/
    public BarraProgreso(JProgressBar progreso){
        super();
        this.progreso = progreso;
    }
    
    /*Método para hacer la acción de un hilo*/
    @Override
    public void run(){
        for (int i = 1; i <= 100; i++) {
            progreso.setValue(i);
            pausa(30);
        }
    }
    
    /*Método para dar una pausa*/
    private void pausa(int mlseg){
        try {
            Thread.sleep(mlseg);
        } catch (Exception e) {
            System.out.println("Se canceló el hilo.");
        }
    }
}
