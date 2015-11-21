package com.example.alumnot.xml_interno_lista;

import android.net.Uri;

import java.io.Serializable;

/**
 * Created by AlumnoT on 03/11/2015.
 */
public class Personaje implements Serializable,Comparable<Personaje> {

    private String nombre;
    private String rol;
    private String imagen;
    private String historia;

    public String getHistoria(){
        return historia;
    }

    public Personaje(String nombre, String rol, String imagen, String historia) {
        this.nombre = nombre;
        this.rol = rol;
        this.imagen = imagen;
        this.historia = historia;
    }

    public String getImagen(){
        return imagen;
    }

    public void setImagen(String imagen){
        this.imagen = imagen;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getRol(){
        return rol;
    }

    public void setRol(String rol){
        this.rol = rol;
    }

    @Override
    public int compareTo(Personaje another){
        if(another.nombre.compareTo(nombre)==-1){
            return -1;
        }
        if(another.nombre.compareTo(nombre)==1){
            return 1;
        }
        return 0;
    }
}