 
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

    String identificador, nombre, apellidos;
    Calendar fechaA; //fecha actual

    public Persona() {

    }

    // constructor para inicializar los atributos.
    public Persona(String identificador, String nombre, String apellidos, Calendar fechaA) throws Exception {
        this.identificador = identificador; //para indicar que accedemos al parametro y no al metodo
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaA = fechaA;
        if (nombre.isEmpty()) {
            throw (new Exception("Nombre vacio. Introduzca uno por favor."));
        }
        if (apellidos.isEmpty()) {
            throw (new Exception("Apellidos vacio. Introduzca uno por favor."));
        }
    }

// Metodos set y get para los distintos atributos
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getIdentificador() {
        return identificador;
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
        return identificador + " " + nombre + " " + apellidos + " ";
    }

//main
    public static void main(String args[]) throws Exception {
        
        
        DateFormat fFecha = DateFormat.getDateInstance(); //clase abstracta que sirve para formatear fechas
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMMM-yyyy"); //subclase de DateFormat

        // GregorianCalendar es una subclase de Calendar que utiliza el calendario estandar.        
        Calendar fechaPersona = new GregorianCalendar(1996, 11, 27); // Permite trabajar con una fecha y realizar cambios sobre ella segun nuestro calendario
        Calendar fechaAlumno = new GregorianCalendar(2015, 02, 18);
        Calendar fechaAlumnoModif = new GregorianCalendar(2015, 05, 25);
        Persona personaNueva = new Persona("1", "Dionisio", "Ridruejo", fechaPersona);
        Alumno alum = new Alumno("3", "JuanCarlos", "Garcia", fechaAlumno, 1, "A2");

        // Imprimimos la Persona        
        System.out.print("Persona: " + personaNueva.obtenerPersona());
        System.out.print(sdf.format(fechaPersona.getTime())+"\n");
        
        // Imprimimos el Alumno
        alum.ponGrupo("A1", 1);
        System.out.print("Persona(Alumno): " + alum.obtenerAlumno());
        System.out.print(" " + sdf.format(fechaAlumno.getTime())+"\n");

        // ponGrupo
        alum.ponGrupo("A20", 2);
        System.out.println("\nDatos del Alumno con los atributos (grupo y horario) modificados:");
        System.out.print("Persona: " + alum.obtenerAlumno());
        System.out.print(" " + sdf.format(fechaAlumnoModif.getTime()));

        // ponGrupo(sobrecargado)
        alum.ponGrupo("A205");
        System.out.println("\n\nDatos del Alumno modificando unicamente el atributo grupo:");
        System.out.print("Persona: " + alum.obtenerAlumno());
        System.out.print(" " + sdf.format(fechaAlumno.getTime()) + "\n\n");

    }
}
