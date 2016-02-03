/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitores;

/**
 *
 * @author AlumnoT
 */
public class Alumno extends Thread {

    String nombre;

    Bienvenida saludo;

    public Alumno(String nombre, Bienvenida mensajealumno) {

        this.nombre = nombre;

        this.saludo = mensajealumno;

    }

    public void run() {

        System.out.println("Alumno" + this.nombre + " llego.");

        try {

            Thread.sleep(1000);

            saludo.saludarProfesor(nombre);

        } catch (InterruptedException ex) {

            System.err.println("Thread alumno interrumpido");

            System.exit(-1);

        }

    }

}
