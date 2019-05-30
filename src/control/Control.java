package control;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.logging.Level;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import modelos.Pieza;
import vistas.JFEstadisticas;
import vistas.JFPuzzle;
import vistas.JFTableroImagen;
import vistas.JFTableroNumeros;
import vistas.JFTableroPersonalizado;

public abstract class Control {

    private static final int WIDTH = 600;
    private static final int HEIGHT = 600;

    private static Timer t;
    private static BufferedImage imagen = null;
    private static Pieza[][] piezas = null;
    private static JFPuzzle ventanaPuzzle = null;
    private static String rutaImagenPartida = "";
    private static String modalidadPartida = "";
    private static Color colorBgPieza = null;
    private static Color colorBgTexto = null;
    private static boolean juegoEnProgreso = false; //Variables para las estadísticas
    private static int[] tablero;
    private static int[] tiempoDeJuego = {0, 0, 0};
    private static int[] totalTiempoDeJuego = {0, 0, 0};
    private static int[] modalidadFavorita = {0, 0, 0};
    private static int[] dimensionFavorita = {0, 0, 0, 0, 0, 0, 0, 0};
    private static int partidasJugadas = 0;
    private static int partidasGanadas = 0;
    private static int movimientos = 0;
    private static int dimensionPartida = 3;

    private Control() {

    }

    //Método que inicia los componentes
    public static void initComponents() {
        try {
            UIManager.setLookAndFeel("com.bulenkov.darcula.DarculaLaf");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
        }
        ventanaPuzzle = new JFPuzzle();
        ventanaPuzzle.setVisible(true);
    }

    //Método para redimensionar una imagen
    public static BufferedImage redimensionarImagen(BufferedImage imagen, int width, int height) {
        BufferedImage temporal = new BufferedImage(width, height, imagen.getType());
        Graphics2D g = temporal.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g.drawImage(imagen, 0, 0, width, height, 0, 0, imagen.getWidth(), imagen.getHeight(), null);
        g.dispose();
        return temporal;
    }

    //Método que simula el contador de tiempo del juego
    public static void iniciarTiempoDeJuego(JTextField jtfTiempo) {
        if (t != null) {
            t.stop();
        }
        for (int i = 0; i < tiempoDeJuego.length; i++)//Reseteamos el tiempo
        {
            tiempoDeJuego[i] = 0;
        }
        t = new Timer(1000, (ActionEvent evt) -> {
            jtfTiempo.setText(tiempoDeJuego[0] + ":" + tiempoDeJuego[1] + ":" + tiempoDeJuego[2]);
            tiempoDeJuego[2]++;
            if (tiempoDeJuego[2] > 59) {
                tiempoDeJuego[2] = 0;
                tiempoDeJuego[1]++;
                if (tiempoDeJuego[1] > 59) {
                    tiempoDeJuego[1] = 0;
                    tiempoDeJuego[0]++;
                }
            }
        });
        t.start();
    }

    //Método para generar un tablero aleatorio
    private static int[] generarTablero(int dimension) {
        int rango = dimension * dimension;
        int[] tablero = new int[rango];//Vector usado para simular el tablero
        Random r = new Random(System.nanoTime());
        for (int i = 0; i < tablero.length; i++) {//Ciclo para llenar el arreglo
            tablero[i] = r.nextInt(rango);
            for (int j = 0; j < i; j++) { //Ciclo para comprobar si el número aleatorio generado anteriormente está repetido
                if (tablero[i] == tablero[j])//Si el número aleatorio generado anteriormente está repetido no se incrementará el ciclo
                {
                    i--;//No se incrementa el ciclo, por lo tanto seguirá generando números aleatorios hasta que consiga el que no se repite
                }
            }
        }
        return tablero;
    }

    //Método para generar la matriz de Piezas con imagenes
    private static Pieza[][] generarTableroConImagen(int dimension, BufferedImage imagen) {
        Pieza[] piezas = new Pieza[dimension * dimension], piezasParaTablero = new Pieza[dimension * dimension];
        int k = 0, x, id = 0, y = 0;
        for (int i = 0; i < dimension; i++) {//Parte de leer imagen, recortarla y almacenarla en un Array
            x = 0;
            for (int j = 0; j < dimension; j++) {
                piezas[id] = new Pieza(id, x, y, (WIDTH / dimension), (HEIGHT / dimension), imagen);
                x += (HEIGHT / dimension);
                id++;
            }
            y += (WIDTH / dimension);
        }
        for (int i = 0; i < piezas.length; i++) {//Parte de acomodar las imagenes acorde al tablero aleatorio
            for (int j = 0; j < piezas.length; j++) {
                if (piezas[j].getId() == tablero[i]) {
                    piezasParaTablero[k] = piezas[j];
                    k++;
                }
            }
        }
        return toMatriz(piezasParaTablero);
    }

    //Método para generar la matriz de Piezas con números
    private static Pieza[][] generarTableroConNumeros(int dimension, Color colorPieza, Color colorTexto) {
        Pieza[] piezas = new Pieza[dimension * dimension];
        Pieza[] piezasParaTablero = new Pieza[dimension * dimension];
        int k = 0;
        //Parte de instanciar nuevos Piezas en un Array
        for (int i = 0; i < piezas.length; i++) {
            piezas[i] = new Pieza(i, (WIDTH / dimension), (HEIGHT / dimension), colorPieza, colorTexto);
        }
        for (int i = 0; i < piezas.length; i++) {//Parte de acomodar las fichas acorde al tablero aleatorio
            for (int j = 0; j < piezas.length; j++) {
                if (piezas[j].getId() == tablero[i]) {
                    piezasParaTablero[k] = piezas[j];
                    k++;
                }
            }
        }
        return toMatriz(piezasParaTablero);
    }

    //Método que usado para la acción del menú nuevo->Tablero con imagen predeterminada y nuevo->Tablero personalizado
    private static void pintarTableroConImagen(int[] tablero, int dimension, File archivo) {
        ventanaPuzzle.getJPjuego().setLayout(new GridLayout(dimension, dimension));//Ajustamos el Layout del panel respecto al juego
        juegoEnProgreso = true;//Reseteamos todo
        Control.tablero = tablero;
        try {
            imagen = ImageIO.read(archivo);
            ventanaPuzzle.setImagen(imagen);
            ventanaPuzzle.getJLthumbnail().setIcon(new ImageIcon(redimensionarImagen(imagen, 150, 150)));
            imagen = redimensionarImagen(imagen, ventanaPuzzle.getJPjuego().getWidth(), ventanaPuzzle.getJPjuego().getHeight());
            piezas = generarTableroConImagen(dimension, imagen);
            dimensionPartida = dimension;
            repaint();
            iniciarTiempoDeJuego(ventanaPuzzle.getJTFtiempo());
        } catch (IOException | NullPointerException ex) {
            java.util.logging.Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Método que usado para la acción del menú nuevo->Tablero con números
    private static void pintarTableroDeNumeros(int[] tablero, int dimension, Color colorPieza, Color colorTexto) {
        juegoEnProgreso = true;
        ventanaPuzzle.getJPjuego().setLayout(new GridLayout(dimension, dimension));
        Control.tablero = tablero;
        try {
            imagen = ImageIO.read(new File("src/recursos/imagenes/JLthumbnail.jpg"));
            ventanaPuzzle.setImagen(imagen);
            ventanaPuzzle.getJLthumbnail().setIcon(new ImageIcon(redimensionarImagen(imagen, 150, 150)));
            piezas = generarTableroConNumeros(dimension, colorPieza, colorTexto);
            dimensionPartida = dimension;
            colorBgPieza = colorPieza;
            colorBgTexto = colorTexto;
            repaint();
            iniciarTiempoDeJuego(ventanaPuzzle.getJTFtiempo());
        } catch (IOException | NullPointerException ex) {
            java.util.logging.Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Método para convertir un array a matriz
    public static int[][] toMatriz(int[] array) {
        int[][] matriz = new int[(int) Math.sqrt(array.length)][(int) Math.sqrt(array.length)];
        int k = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = array[k];
                k++;
            }
        }
        return matriz;
    }

    //Método para convertir un array a matriz
    public static Pieza[][] toMatriz(Pieza[] array) {
        Pieza[][] matriz = new Pieza[(int) Math.sqrt(array.length)][(int) Math.sqrt(array.length)];
        int k = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = array[k];
                k++;
            }
        }
        return matriz;
    }

    //Método para convertir una matriz en un array
    public static Pieza[] toArray(Pieza[][] matriz) {
        Pieza[] array = new Pieza[(int) Math.pow(matriz.length, 2)];
        int k = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                array[k] = matriz[i][j];
                k++;
            }
        }
        return array;
    }

    //Método para convertir una matriz en un array
    public static int[] toArray(int[][] matriz) {
        int[] array = new int[(int) Math.pow(matriz.length, 2)];
        int k = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                array[k] = matriz[i][j];
                k++;
            }
        }
        return array;
    }

    //Método que moverá la pieza
    public static void moverPieza(int id) {
        if (id != 0) { //Para mover una pieza, se hace el intercambio (Método burbuja) y se pinta de nuevo todo
            for (int i = 0; i < piezas.length; i++) {
                for (int j = 0; j < piezas[0].length; j++) {
                    if (piezas[i][j].getId() == id) {
                        if (piezas[i][j].getDireccion().equals("ARRIBA") && i != 0 && piezas[i - 1][j].getId() == 0) {
                            Pieza aux = piezas[i][j];
                            piezas[i][j] = piezas[i - 1][j];
                            piezas[i - 1][j] = aux;
                            repaint();
                            movimientos++;
                        } else if (piezas[i][j].getDireccion().equals("ABAJO") && i != piezas.length - 1 && piezas[i + 1][j].getId() == 0) {
                            Pieza aux = piezas[i][j];
                            piezas[i][j] = piezas[i + 1][j];
                            piezas[i + 1][j] = aux;
                            repaint();
                            movimientos++;
                        } else if (piezas[i][j].getDireccion().equals("IZQUIERDA") && j != 0 && piezas[i][j - 1].getId() == 0) {
                            Pieza aux = piezas[i][j];
                            piezas[i][j] = piezas[i][j - 1];
                            piezas[i][j - 1] = aux;
                            repaint();
                            movimientos++;
                        } else if (piezas[i][j].getDireccion().equals("DERECHA") && j != piezas[0].length - 1 && piezas[i][j + 1].getId() == 0) {
                            Pieza aux = piezas[i][j];
                            piezas[i][j] = piezas[i][j + 1];
                            piezas[i][j + 1] = aux;
                            repaint();
                            movimientos++;
                        }
                    }
                }
            }
            verificarSiGanoElJuego();
        }
    }

    //Método para pintar las piezas en el tablero
    private static void repaint() {
        ventanaPuzzle.getJPjuego().removeAll();//Primero, borramos todo del panel
        for (int i = 0; i < piezas.length; i++) {
            for (int j = 0; j < piezas[0].length; j++) {
                ventanaPuzzle.getJPjuego().add(piezas[i][j]);
                if (piezas[i][j].getId() == 0) //Indicamos que la pieza cero no se hará visible
                {
                    piezas[i][j].setVisible(false);
                }
            }
        }
        ventanaPuzzle.getJPjuego().paintAll(ventanaPuzzle.getJPjuego().getGraphics());
    }

    //Método para verificar si se ha ganado el juego
    private static void verificarSiGanoElJuego() {
        boolean ganoJuego = false, continuar = true;
        Pieza[] tablero = toArray(piezas);
        for (int i = 0; i < tablero.length && continuar; i++) {
            for (int j = i + 1; j < tablero.length && continuar; j++) {
                if (tablero[j].getId() > tablero[i].getId()) {
                    ganoJuego = true;//Termina recorriendo todo el ciclo si gana
                } else {
                    ganoJuego = continuar = false; //Si no está bien organizado, se sale de los 2 ciclos
                }
            }
        }
        if (ganoJuego) {
            t.stop(); // Se detiene el tiempo
            partidasGanadas++;
            juegoEnProgreso = false;
            ventanaPuzzle.getJPjuego().removeAll();
            JOptionPane.showMessageDialog(ventanaPuzzle, "Haz resuelto el puzzle!");
        }
    }

    //Método ubicado en la clase JFTableroImagen para hacer la acción del botón "aceptar"
    public static void iniciarTableroImagen(JFTableroImagen ventana, int dimension, File ruta) {
        pintarTableroConImagen(generarTablero(dimension), dimension, ruta);
        setNumberDimensionFavorita(dimension);
        setNumberModalidadFavorita("imagen");
        modalidadPartida = "imagen";
        rutaImagenPartida = ruta.getPath();
        partidasJugadas++;
        ventana.setVisible(false);
    }

    //Método ubicado en la clase JFTableroNumeros para hacer la acción del botón "aceptar"
    public static void iniciarTableroNumeros(JFTableroNumeros ventana, int dimension, Color colorBackgroundPieza, Color colorTexto) {
        pintarTableroDeNumeros(generarTablero(dimension), dimension, colorBackgroundPieza, colorTexto);
        setNumberDimensionFavorita(dimension);
        setNumberModalidadFavorita("numeros");
        modalidadPartida = "numeros";
        partidasJugadas++;
        ventana.setVisible(false);
    }

    //Método ubicado en la clase JFTableroPersonalizado para hacer la acción del botón "aceptar"
    public static void iniciarTableroPersonalizado(JFTableroPersonalizado ventana, int dimension, File ruta) {
        pintarTableroConImagen(generarTablero(dimension), dimension, ruta);
        setNumberDimensionFavorita(dimension);
        setNumberModalidadFavorita("personalizado");
        modalidadPartida = "personalizado";
        rutaImagenPartida = ruta.getAbsolutePath();
        partidasJugadas++;
        ventana.setVisible(false);
    }

    //Método usado para salir de la aplicación
    public static void salir() {
        if (JOptionPane.showConfirmDialog(ventanaPuzzle, "Seguro que desea cerrar la aplicación?", "Confirmación de salida", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
            if (t != null) {
                t.stop();
            }
            guardarEstadisticas();
            guardarPartida();
            System.exit(0);
        }
    }

    //Método para reproducir un sonido
    public static void playSound(Player player, boolean repetir) {
        new Thread() {
            @Override
            public void run() {
                do {
                    try {
                        player.play();
                    } catch (JavaLayerException ex) {
                        JOptionPane.showMessageDialog(null, "Error: " + ex);
                    }
                } while (repetir);
            }
        }.start();
    }

    //Método para detener la reproducción de un sonido
    public static void stopSound(Player player) {
        if (player != null) {
            player.close();
        }
    }

    //Método para calcular el tiempo total que se ha jugado
    private static String calcularTiempoTotal() {
        totalTiempoDeJuego[0] += tiempoDeJuego[0];
        totalTiempoDeJuego[1] += tiempoDeJuego[1];
        totalTiempoDeJuego[2] += tiempoDeJuego[2];
        if (totalTiempoDeJuego[2] > 59) {
            totalTiempoDeJuego[2] -= 60;
            totalTiempoDeJuego[1]++;
            if (totalTiempoDeJuego[1] > 59) {
                totalTiempoDeJuego[1] -= 60;
                totalTiempoDeJuego[0]++;
            }
        }
        return totalTiempoDeJuego[0] + ":" + totalTiempoDeJuego[1] + ":" + totalTiempoDeJuego[2];
    }

    //Método para guardar las estadísticas generando un archivo con extensión .cfg
    public static void guardarEstadisticas() {
        try (PrintWriter archivoEstadisticas = new PrintWriter(new FileWriter("src/data/estadisticas.cfg"))) {
            archivoEstadisticas.println(partidasJugadas);//Partidas Jugadas
            archivoEstadisticas.println(partidasGanadas);//Partidas Ganadas            
            archivoEstadisticas.println(calcularTiempoTotal()); //Tiempo jugado
            archivoEstadisticas.println(movimientos); //Movimientos
            for (int i = 0; i < dimensionFavorita.length; i++) {
                archivoEstadisticas.print(dimensionFavorita[i]);
                if (i != dimensionFavorita.length - 1) {
                    archivoEstadisticas.print("-"); //Dimensión favorita
                }
            }
            archivoEstadisticas.println();
            for (int i = 0; i < modalidadFavorita.length; i++) {
                archivoEstadisticas.print(modalidadFavorita[i]);
                if (i != modalidadFavorita.length - 1) {
                    archivoEstadisticas.print("-"); //Modalidad favorita
                }
            }
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Método para leer las estadísticas el cual lee un archivo con extensión .cfg
    public static void leerEstadisticas() throws FileNotFoundException, IOException, NoSuchElementException, NumberFormatException {
        try (BufferedReader archivoEstadisticas = new BufferedReader(new FileReader("src/data/estadisticas.cfg"))) {
            partidasJugadas = Integer.parseInt(archivoEstadisticas.readLine());//Leer las partidas jugadas
            partidasGanadas = Integer.parseInt(archivoEstadisticas.readLine());//Leer las partidas ganadas
            String[] tiempoDeJuegoTemp = archivoEstadisticas.readLine().split(":");//Creamos un array temporal para eliminar el :
            for (int i = 0; i < tiempoDeJuegoTemp.length; i++) {
                totalTiempoDeJuego[i] = Integer.parseInt(tiempoDeJuegoTemp[i]);//Leer el tiempo total de juego
            }
            movimientos = Integer.parseInt(archivoEstadisticas.readLine());//Leer total movimientos
            String[] dimensionFavoritaTemp = archivoEstadisticas.readLine().split("-");//Creamos un array temporal para eliminar el -
            for (int i = 0; i < dimensionFavoritaTemp.length; i++) {
                dimensionFavorita[i] = Integer.parseInt(dimensionFavoritaTemp[i]);//convertimos los datos que leímos a entero
            }
            String[] modalidadFavoritaTemp = archivoEstadisticas.readLine().split("-");//Creamos un array temporal para eliminar el -
            for (int i = 0; i < modalidadFavoritaTemp.length; i++) {
                modalidadFavorita[i] = Integer.parseInt(modalidadFavoritaTemp[i]);//convertimos los datos que leímos a entero
            }
        }
    }

//Método para guardar la partida si no se ha ganado el juego
    public static void guardarPartida() {
        try (PrintWriter archivoEstadisticas = new PrintWriter(new FileWriter("src/data/partida.cfg"))) {
            archivoEstadisticas.println(juegoEnProgreso);//Si hay un juego en progreso, guardará el tablero
            if (juegoEnProgreso) {
                int k = 0;
                int[] tablero = new int[piezas.length * piezas[0].length];
                for (int i = 0; i < piezas.length; i++) {//Ponemos las id en forma de arreglo
                    for (int j = 0; j < piezas[0].length; j++) {
                        tablero[k] = piezas[i][j].getId();
                        k++;
                    }
                }
                for (int i = 0; i < tablero.length; i++) {
                    archivoEstadisticas.print(tablero[i]);
                    if (i != tablero.length - 1) {
                        archivoEstadisticas.print("-"); //Imprimimos el Tablero
                    }
                }
                archivoEstadisticas.println("\n" + dimensionPartida);
                archivoEstadisticas.println(modalidadPartida);
                switch (modalidadPartida) {
                    case "numeros":
                        archivoEstadisticas.println(colorBgPieza.getRed() + "-" + colorBgPieza.getGreen() + "-" + colorBgPieza.getBlue());//Color pieza
                        archivoEstadisticas.println(colorBgTexto.getRed() + "-" + colorBgTexto.getGreen() + "-" + colorBgTexto.getBlue());//Color texto
                        break;
                    default:
                        archivoEstadisticas.println(rutaImagenPartida);//Ruta imagen
                    }
            }

        } catch (IOException | NullPointerException ex) {
            java.util.logging.Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Método para cargar la partida si existe una en progreso
    public static void leerPartida() throws FileNotFoundException {
        try (BufferedReader archivoPartida = new BufferedReader(new FileReader("src/data/partida.cfg"))) {
            juegoEnProgreso = Boolean.parseBoolean(archivoPartida.readLine());//Leer si hay una partida en progreso
            if (juegoEnProgreso) {
                String[] partidaTemp = archivoPartida.readLine().split("-");
                tablero = new int[partidaTemp.length];
                for (int i = 0; i < partidaTemp.length; i++) {
                    tablero[i] = Integer.parseInt(partidaTemp[i]);//Lee el tablero
                }
                dimensionPartida = Integer.parseInt(archivoPartida.readLine());//Lee la dimensión de la partida
                modalidadPartida = archivoPartida.readLine();//Lee la dimensión de la partida
                switch (modalidadPartida) {
                    case "numeros":
                        String[] colorPiezaTemp = archivoPartida.readLine().split("-");
                        String[] colorTextoTemp = archivoPartida.readLine().split("-");
                        colorBgPieza = new Color(Integer.parseInt(colorPiezaTemp[0]), Integer.parseInt(colorPiezaTemp[1]), Integer.parseInt(colorPiezaTemp[2]));
                        colorBgTexto = new Color(Integer.parseInt(colorTextoTemp[0]), Integer.parseInt(colorTextoTemp[1]), Integer.parseInt(colorTextoTemp[2]));
                        pintarTableroDeNumeros(tablero, dimensionPartida, colorBgPieza, colorBgTexto);
                        break;
                    default:
                        rutaImagenPartida = archivoPartida.readLine();
                        pintarTableroConImagen(tablero, dimensionPartida, new File(rutaImagenPartida));
                }
            }

        } catch (IOException | NoSuchElementException | NumberFormatException ex) {
            juegoEnProgreso = false;
            java.util.logging.Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Método para obtener el índice del mayor elemento de un array
    private static int getIndexOfLargestElementOfArray(int[] array) {
        int mayor = array[0], index = 0;
        for (int i = 0; i < array.length; i++) {
            if (mayor < array[i]) {
                mayor = array[i];
                index = i;
            }
        }
        return index;
    }

    //Método para incrementar el contador de las modalidades favoritas
    private static void setNumberModalidadFavorita(String modalidad) {
        switch (modalidad) {
            case "imagen":
                modalidadFavorita[0]++;
                break;
            case "numeros":
                modalidadFavorita[1]++;
                break;
            default:
                modalidadFavorita[2]++;
                ;
        }
    }

    //Método para incrementar el contador de las dimension favoritas
    private static void setNumberDimensionFavorita(int dimension) {
        switch (dimension) {
            case 3:
                dimensionFavorita[0]++;
                break;
            case 4:
                dimensionFavorita[1]++;
                break;
            case 5:
                dimensionFavorita[2]++;
                break;
            case 6:
                dimensionFavorita[3]++;
                break;
            case 7:
                dimensionFavorita[4]++;
                break;
            case 8:
                dimensionFavorita[5]++;
                break;
            case 9:
                dimensionFavorita[6]++;
                break;
            default:
                dimensionFavorita[7]++;
        }
    }

    //Método que devuelve la modalidad favorita en texto
    public static String getTextModalidadFavorita() {
        switch (getIndexOfLargestElementOfArray(modalidadFavorita)) {
            case 0:
                return "Imagen Predeterminada";
            case 1:
                return "Números";
            default:
                return "Personalizado";
        }
    }

    //Método que devuelve la dimension favorita en texto
    public static String getTextDimensionFavorita() {
        switch (getIndexOfLargestElementOfArray(dimensionFavorita)) {
            case 0:
                return "3";
            case 1:
                return "4";
            case 2:
                return "5";
            case 3:
                return "6";
            case 4:
                return "7";
            case 5:
                return "8";
            case 6:
                return "9";
            default:
                return "10";
        }
    }

    //Método que muestra la ventana de las estadísticas
    public static void mostrarEstadisticas(JFEstadisticas ventana) {
        ventana = new JFEstadisticas(
                "Partidas Jugadas: " + partidasJugadas,
                "Partidas Ganadas: " + partidasGanadas,
                "Tiempo jugado: " + totalTiempoDeJuego[0] + ":" + totalTiempoDeJuego[1] + ":" + totalTiempoDeJuego[2],
                "Movimientos realizados: " + movimientos,
                "Dimensión Favorita: dimensión " + Control.getTextDimensionFavorita(),
                "Modalidad Favorita: " + Control.getTextModalidadFavorita()
        );
        ventana.setVisible(true);
    }

    //Método que borra las estadísticas
    public static void borrarEstadisticas() {
        if (JOptionPane.showConfirmDialog(ventanaPuzzle, "Seguro que borrar las estadísticas?", "Confirmación de eliminación", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
            if (new File("src/data/estadisticas.cfg").delete()) {
                partidasGanadas = 0;
                partidasJugadas = 0;
                for (int i = 0; i < totalTiempoDeJuego.length; i++) {
                    totalTiempoDeJuego[i] = 0;
                }
                movimientos = 0;
                for (int i = 0; i < dimensionFavorita.length; i++) {
                    dimensionFavorita[i] = 0;
                }
                for (int i = 0; i < modalidadFavorita.length; i++) {
                    modalidadFavorita[i] = 0;
                }
                JOptionPane.showMessageDialog(ventanaPuzzle, "Se borraron las estadísticas de forma exitosa!");
            }
        }
    }

}
