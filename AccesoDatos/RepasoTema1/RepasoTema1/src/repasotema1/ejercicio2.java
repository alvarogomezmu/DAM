/*
 Crea un fichero de texto con el nombre y contenido que tu quieras. 
 Ahora crea una aplicación que lea este fichero de texto carácter a carácter y muestre su contenido por pantalla sin espacios. 
 Por ejemplo, si un fichero tiene el siguiente texto “Esto es una prueba”, deberá mostrar “Estoesunaprueba”.
 */
package repasotema1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author AlvaroGomez
 */
public class ejercicio2 {

    public static void main(String args[]) {
        try {
            BufferedReader fichero = new BufferedReader(new FileReader("C:\\Users\\Alumnot\\Desktop\\porejemplo.txt"));
            char charac[] = new char[288];
            int count;

            while ((count = fichero.read(charac)) != -1) {
                for (int i = 0; i < count; i++) {
                    if (charac[i] != ' ') {
                        System.out.print(charac[i]);
                    }
                }
            }
        } catch (FileNotFoundException f) {
            System.out.println("Archivo no encontrado: " + f);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
