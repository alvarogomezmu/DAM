/*
    Tenemos un objeto profesor (nombre, edad, titulación) que guardamos en dos estructuras map<DNI, profesor>, queremos comparar los profesores guardados en 
    el primer Map con el segundo Map. 
    Intenta crear un método que nos compare las dos estructuras. 
    Nos debe informar de los valores repetidos en la estructura. 
    Quiero ver los profesores iguales.
*/
package entregaEjercicios2;

import java.util.*;

public class ejercicio2 
{
    public static void main(String args[]) 
    {

        // Crear varios profesores
        profesor p1 = new profesor();
        p1.nuevoProfesor("Sergio", 31, "Tecnico en sistemas");
        profesor p2 = new profesor();
        p2.nuevoProfesor("Bartolo", 45, "Lenguaje de marcas");
        profesor p3 = new profesor();
        p3.nuevoProfesor("Manuela", 37, "FOL");
        profesor p4 = new profesor();
        p4.nuevoProfesor("Sergio", 31, "Tecnico en sistemas");

        // Declaración de los dos HashMap
        HashMap<String, Object> map1 = new HashMap<String, Object>();
        HashMap<String, Object> map2 = new HashMap<String, Object>();

        // Añadir profesores a los map, poniendo 2 distintos en cada uno
        map1.put("12306799C", p1);
        map1.put("09883412M", p2);
        map2.put("02305377Q", p3);
        map2.put("10044532W", p4);

        // Iteramos los dos HashMap a la vez
        for (Map.Entry obj1 : map1.entrySet()) 
        {
            for (Map.Entry obj2 : map2.entrySet()) 
            {
                // Almacenar nombres de cada HashMap en una variable distinta
                String nombre1 = ((profesor) obj1.getValue()).getNombre();
                String nombre2 = ((profesor) obj2.getValue()).getNombre();

                // Buscar coincidencias en los nombres, si hay, mostrar mensaje
                if (nombre1 == nombre2) 
                {
                    System.out.println("El nombre de " + nombre1 + " está repetido.");
                }

                // Almacenar las edades de cada HashMap en una variable distinta
                int edad1 = ((profesor) obj1.getValue()).getEdad();
                int edad2 = ((profesor) obj2.getValue()).getEdad();

                // Buscar coincidencias en las edades, si hay, mostrar mensaje
                if (edad1 == edad2) 
                {
                    System.out.println("La edad de " + edad1 + " años está repetida.");
                }

                // almacenamos las titulaciones de cada HashMap en una variable distinta
                String titulacion1 = ((profesor) obj1.getValue()).getTitulacion();
                String titulacion2 = ((profesor) obj2.getValue()).getTitulacion();

                // Buscar coincidencias en titulación, si hay, mostrar mensaje
                if (titulacion1 == titulacion2) 
                {
                    System.out.println("La titulacion " + titulacion1 + " está repetida.");
                }

                // Buscar profesores repetidos, si hay, mostrar mensaje
                if ((nombre1 == nombre2) && (edad1 == edad2) && (titulacion1 == titulacion2)) 
                {
                    System.out.println("El profesor " + nombre1 + ", de " + edad1 + " años, que es " + titulacion1 + ", está repetido.");
                }
            }
        }
    }
}
