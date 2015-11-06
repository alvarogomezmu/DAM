/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforoascensor;

/**
 *
 * @author AlumnoT
 */
public class Piso {

    public Piso(int nro_piso) {
        this.nro_piso = nro_piso;
    }

    public int getNro_piso() {
        return nro_piso;
    }

    public int getBotonbajar() {
        return botonbajar;
    }

    public void setBotonbajar(int botonbajar) {
        this.botonbajar = botonbajar;
    }

    public int getBotonsubir() {
        return botonsubir;
    }

    public void setBotonsubir(int botonsubir) {
        this.botonsubir = botonsubir;
    }

    public int getIndicadorDestino() {
        return indicadorDestino;
    }

    public void setIndicadorDestino(int indicadorDestino) {
        this.indicadorDestino = indicadorDestino;
    }
}
