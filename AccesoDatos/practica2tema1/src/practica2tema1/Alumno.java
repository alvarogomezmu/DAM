/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2tema1;

/**
 *
 * @author AlumnoT
 */
public class alumno {
    private String nombre;
    private double nota;
    alumno(){
        
    }
    public alumno(String nombre, double nota){
        nombre=this.nombre;
        nota=this.nota;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "alumno{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }
    
}
