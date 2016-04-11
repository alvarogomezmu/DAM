/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea1;

/**
 *
 * @author Alvaro
 */
public class profesor {

    String nombre;
    int edad;
    String titulacion;

    public void nuevoProfesor(String nom, int e, String titul) {
        nombre = nom;
        edad = e;
        titulacion = titul;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getTitulacion() {
        return titulacion;
    }
}
