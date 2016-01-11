/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnunciadoEmpleados;

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
public class MetodosEmp {

    public static void escribirMenu() {
        System.out.print("1) Mostrar los datos de la posicion 0,1 y 3 del fichero\n2) Modificar el valor de la posicion 2 cambiando el tipo de empleo \n3) Mostrar el cambio realizado\n4) Borrar los empleos de la posicion 1 y 3 \n5) Guardar todas las operaciones en el fichero \n6) Salir\n Tu opcion: ");
    }

    public static int preguntarOpcion() throws IOException {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        int opcion = Integer.parseInt(teclado.readLine());

        return opcion;
    }

    public static String preguntarFichero() throws IOException {

        System.out.print("Elije el nombre del fichero: ");

        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        String fichero = teclado.readLine();

        return fichero;
    }

    public static void mostrarPosicionCeroUnoTres(String fichero) throws IOException, FileNotFoundException {
        BufferedReader file = new BufferedReader(new FileReader("C:\\dam\\AccesoDatos\\Control0\\src\\EnunciadoEmpleados\\empleados.txt"));
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
