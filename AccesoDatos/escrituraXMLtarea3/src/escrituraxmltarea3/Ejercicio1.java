/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escrituraxmltarea3;

import org.jdom2.Element;
import java.io.IOException;
import org.jdom2.Document;

import Herramientas.Herramientas;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        // Creamos la etiqueta root fruta
        Element frutas = new Element("Frutas");
        
        // Creamos la etiqueta fruta
        Element fruta = new Element("Fruta");
        
        // Creamos la etiqueta nombre
        Element nombre = new Element("Nombre");
        
        // Añadimos un nombre a la etiqueta nombre
        nombre.setText("Cereza");
        
        
        // Creamos la etiqueta fruta2
        Element fruta2 = new Element("Fruta");
        
        // Creamos la etiqueta nombre2
        Element nombre2 = new Element("Nombre");
        
        // Añadimos un nombre a la etiqueta nombre2
        nombre.setText("naranja");
        
        // Creamos el arbol
        fruta.addContent(nombre);
        fruta2.addContent(nombre2);
        frutas.addContent(fruta).addContent(fruta2);
        
        // Creamos el documento que contendrá el arbol
        Document doc = new Document(frutas);
        
        try{
            // Generamos el fichero XML
            Herramientas.escribirFichero(doc,"frutas");
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
