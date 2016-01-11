/*
    * Imaginemos que necesitamos una aplicación para una tienda medienta la que queremos almacenar los distintos productos que venderemos y el precio que tendrán, todo ello en un fichero java ( el tipo lo deberemos elegir nosotros)
    * Se quiere que tenga las funciones básicas, introducir un elemento,, modificar su precio y mostrar el producto que tenga un precio mayor.
    * Para ello crearemos una estructura para almacenar los objetos producto y hacer todas las funciones básicas antes mencionadas.
    * Inicialmente esa estructura la tendremos creada, e inicializar guardándola en el fichero
    * Para poder realizar las operaciones antes mencionadas vamos a hacer un pequeño menú con las siguientes opciones:
           1. Introduce un producto
           2. Modifica precio
           3. Mostrar el producto
           4. Salir
    * Los datos los pediremos pro teclado usando métodos para cada caso. En cada caso y siempre desde el fichero mostraremos lo que hemos cambiado.
 */
package Ejercicio1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Alvaro
 */
public class Ejercicio1 {
    public static void main(String args[]) {
        // Ruta del fichero
        String ruta = ".\\src\\Ejercicio1\\productos.txt";

        // Map que contendra los valores del fichero
        HashMap<String, Integer> mapProductos = new HashMap<String, Integer>();

        // Inicializamos el map
        Metodos.inicializarMap(mapProductos);

        try {
            // Escribimos el map en el fichero
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
                // Tratamos la opcion
                Metodos.tratarOpciones(ruta, opcion, mapProductos);
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Ejercicio1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

