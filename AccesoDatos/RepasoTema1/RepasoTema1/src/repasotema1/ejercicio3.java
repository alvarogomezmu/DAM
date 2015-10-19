/*
 En un fichero de acceso aleatorio se han escrito una serie de registros compuestos por dos campos enteros (int, 4 bytes) y uno real en doble precisión (double, 8 bytes).
 Sobre el fichero se aplica el método seek de la forma siguiente: fichero.seek(48).

 Si el contenido del fichero es:

 1 5 900.2
 2 23 1100.4
 3 2 2000.5
 4 49 1529.8


 donde cada línea representa un registro, ¿qué valores se leerían al hacer fichero.readInt() seguido de fichero.readInt() y fichero.readDouble()?
 */
package repasotema1;

/**
 *
 * @author Alvaro Gomez
 * @version 19-10-2015
 */

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import java.lang.*;

public class ejercicio3 {

    public static void main(String args[]) {

        // Escribimos el fichero
        try {
            RandomAccessFile escribir = new RandomAccessFile("C:\\Users\\Alumnot\\Documents\\rand.txt", "rw");

            escribir.writeInt(1);
            escribir.writeInt(5);
            escribir.writeDouble(900.2);

            escribir.writeInt(2);
            escribir.writeInt(23);
            escribir.writeDouble(1100.4);

            escribir.writeInt(3);
            escribir.writeInt(2);
            escribir.writeDouble(2000.5);

            escribir.writeInt(4);
            escribir.writeInt(49);
            escribir.writeDouble(1529.8);

            escribir.close();
        } catch (FileNotFoundException f) {
            System.out.println("Fichero no encontrado: " + f);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

        // Leemos el fichero
        try {
            RandomAccessFile leer = new RandomAccessFile("C:\\Users\\Alumnot\\Documents\\rand.txt", "rw");

            for (int i = 0; i < 4; i++) {
                leer.seek(i * 16);
                int int1 = leer.readInt();
                int int2 = leer.readInt();
                double double1 = leer.readDouble();
                System.out.println(int1 + " " + int2 + " " + double1);
            }

            leer.close();
        } catch (FileNotFoundException f) {
            System.out.println("Fichero no encontrado: " + f);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
