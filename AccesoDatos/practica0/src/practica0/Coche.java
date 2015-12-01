/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica0;

/**
 *
 * @author AlumnoT
 */
public class Coche {

    String marca;
    String modelo;
    double caballos;

    public void nuevoEquipo(String mr, String md, double c) {
        marca = mr;
        modelo = md;
        caballos = c;
    }



    public String getNombre() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getCaballos() {
        return caballos;
    }
}
