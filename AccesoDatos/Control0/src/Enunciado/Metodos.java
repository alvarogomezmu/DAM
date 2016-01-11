/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enunciado;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Alvaro
 */
public class Metodos {

    public static void escribirMenu() {
        System.out.print("1) Volcado de ArrayList\n2) Mostrar el numero de la posicion 3\n3) Salir\nTu opcion: ");
    }

    public static int preguntarOpcion() throws IOException {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        int opcion = Integer.parseInt(teclado.readLine());

        return opcion;
    }

    public static ArrayList<String> arrayPar() {

        ArrayList<String> ar = new ArrayList<String>();
        int parActual = 1;
        String par;
        for (int i = 0; i < 100; i++) {
            while (!(parActual % 2 == 0)) {
                parActual++;
            }
            ar.add(Integer.toString(parActual));
            parActual++;
        }
        return ar;
    }

    public static String preguntarFichero() throws IOException {

        System.out.print("Elije el nombre del fichero: ");

        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        String fichero = teclado.readLine();

        return fichero;
    }

    public static void escribirArrayPares(ArrayList<String> ar, String fichero) throws IOException {
        Iterator it = ar.iterator();

        BufferedWriter escribir = new BufferedWriter(new FileWriter("C:\\dam\\AccesoDatos\\Control0\\src\\Enunciado\\" + fichero + ".txt"));

        // Recorremos la coleccion e imprimimos todos los valores
        while (it.hasNext()) {
            escribir.write((String) it.next());
            escribir.newLine();
        }
        escribir.close();
    }

    public static void mostrarPosicionCeroUnoTres(String fichero) throws IOException, FileNotFoundException {
        BufferedReader file = new BufferedReader(new FileReader("C:\\dam\\AccesoDatos\\Control0\\src\\Enunciado\\" + fichero + ".txt"));
        String linea = null;
        int contador = 0;

        while ((linea = file.readLine()) != null) {
            if (contador == 0 || contador == 1 || contador == 3) {
                System.out.println("El valor de la posicion " + contador + " es " + linea);

            }
            contador++;
        }
    }
}
