package modelos;

public class InvalidDataException extends RuntimeException{
    
    private String mensaje;
    
    /*Constructores*/
    public InvalidDataException(){
        mensaje = "El dato de entrada es inválido";
    }
    
    public InvalidDataException(int opcion){
        switch (opcion) {
            case 1:
                mensaje = "Sólo se admiten dimensiones entre 2 y 10";
                break;
            case 2:
                mensaje = "La imagen debe estar entre las resoluciones de 600x600 y 1000x1000 píxeles";
                break;
        }
    }
    
    /*Métodos Get*/
    public String getMensaje(){
        return mensaje;
    }
}
