/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnunciadoEmpleados;

/**
 *
 * @author Alvaro
 */
public class Empleado {

    String nombre;
    int edad;
    String profesion;

    public void nuevoEmpleado(String n, int e, String p) {
        nombre = n;
        edad = e;
        profesion = p;
    }

    public String getNombre() {
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public String getProfesion(){
        return profesion;
    }
}
