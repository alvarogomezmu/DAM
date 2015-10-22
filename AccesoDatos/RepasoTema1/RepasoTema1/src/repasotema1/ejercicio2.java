/*
 Crea un fichero de texto con el nombre y contenido que tu quieras. 
 Ahora crea una aplicación que lea este fichero de texto carácter a carácter y muestre su contenido por pantalla sin espacios. 
 Por ejemplo, si un fichero tiene el siguiente texto “Esto es una prueba”, deberá mostrar “Estoesunaprueba”.
 */
package repasotema1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author AlvaroGomez
 * @version 19-10-2015
 */
public class ejercicio2 {

    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("hola.txt"));
            BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader br = new BufferedReader(new FileReader("hola.txt"));

            System.out.print("Introduce la frase: ");
            String cadena = sc.readLine();

            bw.write(cadena);
            bw.close();

            String linea;
            while ((linea = br.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(linea, " ");
                while (tokenizer.hasMoreTokens()) {
                    String cad = tokenizer.nextToken();
                    System.out.print(cad);
                }
            }
        } catch (IOException e) {
            System.out.println("Excepcion io");
        }
    }
}
