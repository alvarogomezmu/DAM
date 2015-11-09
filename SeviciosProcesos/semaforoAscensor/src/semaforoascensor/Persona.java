/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforoascensor;

public class Persona {

    int plantaInicio;
    int plantaFin;
    int peso;
    String nombre;

    Persona(int pinic, int pfin, String nom, int kg) {
        this.plantaInicio = pinic;
        this.plantaFin = pfin;
        this.peso = kg;
        this.nombre = nom;
    }

    public void setPlantaInicio(int pinic) {
        plantaInicio = pinic;
    }

    public void setPlantaFin(int pfin) {
        plantaFin = pfin;
    }

    public void setPeso(int kg) {
        peso = kg;
    }

    public void setNombre(String nom) {
        nombre = nom;
    }

    public int getPlantaInicio() {
        return plantaInicio;
    }

    public int getPlantaFin() {
        return plantaFin;
    }

    public int getPeso() {
        return peso;
    }

    public String getNombre() {
        return nombre;
    }
}
