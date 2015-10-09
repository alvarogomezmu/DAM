/*
* 1. Generar n objetos
* 2.crear hashmap para guardar obj
* 3. serializando metodo escribirMap
* 4. desserializando metodo leerMap
*/
package serializacionMapsCollecions;

import Herramientas.herramientas;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class contacto implements java.io.Serializable 
{
    String nom;
    int telefono; 
        
    public void nuevoContacto(String nombre, int telf){
        nom = nombre;
        telefono = telf;
    }
    
    public void setnom(String nombre){
        nombre = nom;
    }
    
    public void settelf(int telf){
        telf = telefono;
    }
    
    public String getnom(String nombre){
        return nom;
    }
    
    public int gettelf(int telf){
        return telefono;
    }
    public String toString(){
        return "nombre " + nom+" telf "+telefono;
    }
}