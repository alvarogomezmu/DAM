/*
 Realiza un programa  que muestre un menú como el siguiente

 Volcado de un arraylist  con los 100 primeros números pares a un fichero de texto. El nombre del fichero lo elegirá el usuario ( lo deberá escribir él)
 2. Mostrar por pantalla  el número que se encuentra en la posición 3 del fichero.
 3. Salir del Programa.
 */
package repasotema1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alvaro Gomez
 * @version 19-10-2015
 */
public class ejercicio4 {

    public static void main(String args[]) {

        System.out.print("1) Volcado de ArrayList\n2) Mostrar el numero de la posicion 3\n3) Salir\nTu opcion: ");

        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        int opcion = 0;

        try {
            opcion = Integer.parseInt(teclado.readLine());
        } catch (IOException e) {
            System.out.println("Error; " + e);
        }

        switch (opcion) {
            case 1:
                //TODO
                break;
            case 2:
                break;
        }
    }
}

