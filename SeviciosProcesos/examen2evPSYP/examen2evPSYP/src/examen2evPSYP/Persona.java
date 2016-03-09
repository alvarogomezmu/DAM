/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2evPSYP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.io.Serializable;

/**
 *
 * @author Alvaro Gomez
 */
public class Persona implements Serializable {

    String nombre;
    int venta;
    int totalVentas;

    public Persona(String nombre, int venta, int totalVentas) {
        super();
        this.nombre = nombre;
        this.venta = venta;
        this.totalVentas = totalVentas;
    }

    public Persona() {
        super();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVenta() {
        return venta;
    }

    public void setVenta(int venta) {
        this.venta = venta;
    }

    public int getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(int totalVentas) {
        this.totalVentas = totalVentas;
    }

}
