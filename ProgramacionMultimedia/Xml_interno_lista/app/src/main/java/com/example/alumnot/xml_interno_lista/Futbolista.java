package com.example.alumnot.xml_interno_lista;

import android.net.Uri;

import java.io.Serializable;

/**
 * Created by AlumnoT on 03/11/2015.
 */
public class Futbolista implements Serializable,Comparable<Futbolista> {

    private String nombre;
    private String dorsal;
    private String posicion;
    private String historia;


    public Futbolista(String nombre, String dorsal, String posicion, String historia) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.posicion = posicion;
        this.historia = historia;
    }


    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getHistoria(){
        return historia;
    }

    public void setHistoria(String historia){
        this.historia = historia;
    }

    public String getPosicion(){
        return posicion;
    }

    public void setPosicion(String posicion){
        this.posicion = posicion;
    }

    public String getDorsal(){
        return dorsal;
    }

    public void setDorsal(String dorsal){
        this.dorsal = dorsal;
    }

    @Override
    public int compareTo(Futbolista another){
        if(another.nombre.compareTo(nombre)==-1){
            return -1;
        }
        if(another.nombre.compareTo(nombre)==1){
            return 1;
        }
        return 0;
    }
}