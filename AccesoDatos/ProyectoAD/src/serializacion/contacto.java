package serializacion;

import Herramientas.herramientas;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class contacto implements java.io.Serializable 
{
    String nom;
    String telefono; 
        
    public void nuevoContacto(String nombre, String telf){
        nom = nombre;
        telefono = telf;
    }
    
    public void setnom(String nombre){
        nombre = nom;
    }
    
    public void settelf(String telf){
        telf = telefono;
    }
    
    public String getnom(String nombre){
        return nom;
    }
    
    public String gettelf(String telf){
        return telefono;
    }
    public String toString(){
        return "nombre " + nom+" telf "+telefono;
    }
}
