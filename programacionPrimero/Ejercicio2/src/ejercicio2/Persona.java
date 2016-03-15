package ejercicio2;
/*
 Realizar un programa en Java que permita gestionar alumnos, profesores y otro personal en un centro educativo. 
 Para ello se construiran las siguientes clases:
 Clase Persona:
 Atributos
 identificador
 nombre
 apellidos
 fechaA de alta
 Metodos
 Constructor: para dar un valor inicial a todos los atributos. 
 Gestionara una excepcion para no permitir valores nulos en nombre y apellidos.
 obtenerPersona: que nos permita imprimir por pantalla los datos de una persona
 Persona: 1 Dionisio Ridruejo 27-nov-1996
 */

import java.text.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.*;
import java.io.*;

/**
 *
 * @author Alvaro Gomez
 */
public class Persona {

    String id, nombre, apellidos;
    Calendar fechaA; //te saca la fechaA de hoy
    //Cambia el formato al predet. del pc.

    public Persona() {

    }

    public Persona(String id, String nombre, String apellidos, Calendar fechaA) throws Exception {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaA = fechaA;
        if (nombre.isEmpty()) {
            throw (new Exception("Es necesario poner nombre"));
        }
        if (apellidos.isEmpty()) {
            throw (new Exception("Es necesario poner apellidos"));
        }
    }

// Metodos set y get para los distintos atributos
    public void setID(String id) {
        this.id = id;
    }

    public String getID() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setFechaA(Calendar fechaA) {
        this.fechaA = fechaA;
    }

    public Calendar getFechaA() {
        return fechaA;
    }

    public String obtenerPersona() {
        return id + " " + nombre + " " + apellidos + " ";
    }

//main
    public static void main(String args[]) throws Exception {

        DateFormat fFecha = DateFormat.getDateInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMMM-yyyy");

        Calendar fech = new GregorianCalendar(2012, 12, 3);
        Calendar fech1 = new GregorianCalendar(2015, 03, 14);
        Persona pers = new Persona("1", "Dionisio", "Ridruejo", fech);
        Alumno alum = new Alumno("43", "Pepe", "Perez", fech1, "A2", 1);
        //Persona pers1= new Persona("23", "", "", cal1);

        System.out.print("\nPersona: " + pers.obtenerPersona());
        System.out.print(sdf.format(fech.getTime()));
        System.out.println();
        System.out.print("Alumno: " + alum.obtenerAlumno());
        System.out.print(" " + sdf.format(fech1.getTime()));
        System.out.println();

        alum.ponGrupo("R19", 2);
        System.out.println("\nVamos a imprimir el Alumno modificado");
        System.out.print("Alumno: " + alum.obtenerAlumno());
        System.out.print(" " + sdf.format(fech1.getTime()));

        alum.ponGrupo("3F");
        System.out.println("\n\nVamos a imprimir el Alumno con el grupo modificado");
        System.out.print("Alumno: " + alum.obtenerAlumno());
        System.out.print(" " + sdf.format(fech1.getTime()) + "\n");

        System.out.println("Los numeros de dias que ha estado el alumno son: " + alum.numDias());

    }
}
