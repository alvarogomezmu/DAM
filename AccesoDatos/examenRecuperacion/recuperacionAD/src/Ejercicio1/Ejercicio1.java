/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AlumnoT
 */
public class Ejercicio1 {

    public static void main(String args[]) {
        // Ruta del fichero

        String ruta = "C:\\Users\\AlumnoT\\Desktop\\recuperacionAD\\src\\Ejercicio1";

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

        while (!opcion.equals("3")) {
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
