package Ejercicio1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alvaro Gomez
 */
public class Ejercicio1 {

    public static void main(String args[]) {
        // Asignamos la ruta del fichero
        String ruta = ".\\src\\Ejercicio1\\productos.txt";
        
        // Map que contendra los valores del fichero
        HashMap<String, Integer> mapProductos = new HashMap<String, Integer>();

        // LLamada a la clase Metodos para inicializamos el map
        Metodos.inicializarMap(mapProductos);
        
        try {
            // LLamada a la clase Metodos para escribir el map en el fichero
            Metodos.escribirFichero(ruta, mapProductos);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        // Variable para almacenar la opcion introducida por el usuario
        // Es de tipo String para evitar errores al introducir letras o numeros
        String opcion = "";
        
        while (!opcion.equals("4")) {
            // Mostramos el menu
            Metodos.mostrarMenu();
            try {
                // Pedimos al usuario que escoja una opcion del menu
                opcion = Metodos.pedirOpcion();
                
                // Salto de linea para separar resultados
                System.out.println("");
                
                // LLamada a la clase Metodos para tratar la opcion elegida
                Metodos.tratarOpciones(ruta, opcion, mapProductos);
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Ejercicio1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
