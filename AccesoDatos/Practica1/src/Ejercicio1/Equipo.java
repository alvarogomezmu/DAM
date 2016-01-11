/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author Alvaro
 */
public class Equipo {
    String nombre;
    Integer cantidad;
    double precio;

    public void nuevoEquipo(String n, Integer c, double p) {
        nombre = n;
        cantidad = c;
        precio = p;
    }
    
    public void descuentoEquipo() {
        precio = precio * 0.8;
    }
    
    public String getNombre()  {
        return nombre;
    }
    
    public Integer getCantidad() {
        return cantidad;
    }
    
    public double getPrecio() {
        return precio;
    }
}
