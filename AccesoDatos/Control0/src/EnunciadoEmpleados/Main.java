/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnunciadoEmpleados;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Alvaro
 */
public class Main {

    public static void main(String args[]) {
/*
        //Creamos empleados
        Empleado emp1 = new Empleado();
        emp1.nuevoEmpleado("Pepe", 25, "Electricista");
        Empleado emp2 = new Empleado();
        emp2.nuevoEmpleado("Picoto", 30, "Transportista");
        Empleado emp3 = new Empleado();
        emp3.nuevoEmpleado("Francisco", 40, "Arquitecto");
        Empleado emp4 = new Empleado();
        emp4.nuevoEmpleado("Manuel", 35, "Fontanero");

        //Declaramos el map
        HashMap<String, Object> map = new HashMap<String, Object>();
*/
        // Mostramos el menu
        EnunciadoEmpleados.MetodosEmp.escribirMenu();

        // Declaramos la variable donde se almacenara la opcion introducida por el usuario
        int opcion = 0;

        // Declaramos la variable donde se guardara el nombre del fichero
        String fichero = "";

        // Preguntamos la opcion
        try {
            opcion = EnunciadoEmpleados.MetodosEmp.preguntarOpcion();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

        while (opcion != 6) {
            switch (opcion) {
                case 1:
                    // Preguntar al usuarioe el nombre del archivo donde se guardara
                    try {
                        fichero = EnunciadoEmpleados.MetodosEmp.preguntarFichero();
                    } catch (IOException e) {
                        System.out.println("Error: " + e);
                    }

                    // Volvemos a mostar el menu
                    EnunciadoEmpleados.MetodosEmp.escribirMenu();
                    // Volvemos a preguntar la opcion
                    try {
                        opcion = EnunciadoEmpleados.MetodosEmp.preguntarOpcion();
                    } catch (IOException e) {
                        System.out.println("Error: " + e);
                    }
                    break;
                case 2:
                    try {
                        // Mostramos el contenido de la posicion linea del fichero
                        EnunciadoEmpleados.MetodosEmp.mostrarPosicionCeroUnoTres(fichero);
                    } catch (IOException e) {
                        System.out.println("Error: " + e);
                    }

                    // Volvemos a mostar el menu
                    EnunciadoEmpleados.MetodosEmp.escribirMenu();
                    // Volvemos a preguntar la opcion
                    try {
                        opcion = EnunciadoEmpleados.MetodosEmp.preguntarOpcion();
                    } catch (IOException e) {
                        System.out.println("Error: " + e);
                    }
                    break;
            }
        }
    }
}
