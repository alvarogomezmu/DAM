/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escrituraxmltarea3;

import org.jdom2.Element;
import java.io.IOException;
import java.util.ArrayList;
import org.jdom2.Document;

public class Ejercicio2 {
    public static void main(String args[]){
        // Creacion del ArrayList para la primera comida
        ArrayList<Element> comida1 = new ArrayList<Element>();
        comida1.add(new Element("nombre").setText("Waffles"));
        comida1.add(new Element("precio").setText("$2.00"));
        comida1.add(new Element("descripcion").setText("Waffles baratos de McDonald's"));
        comida1.add(new Element("Calorias").setText("650"));
        
        // Creacion del ArrayList para la segunda comida
        ArrayList<Element> comida2 = new ArrayList<Element>();
        comida2.add(new Element("nombre").setText("Hamburguesa"));
        comida2.add(new Element("precio").setText("$5.00"));
        comida2.add(new Element("descripcion").setText("La hamburguesa mas comun de McDonald's"));
        comida2.add(new Element("calorias").setText("1500"));
        
        // Creacion de un ArrayList que contendrá los dos ArrayList anteriores.
        ArrayList<ArrayList<Element>> comidaGlobal = new ArrayList<ArrayList<Element>>();
        comidaGlobal.add(comida1);
        comidaGlobal.add(comida2);
        
        // Creacion de la etiqueta root del menu
        Element menu = new Element("Menu Almuerzo");
        
        // Creacion de un ArrayList para los hijos del menu
        ArrayList<Element> comida = new ArrayList<Element>();
        comida.add(new Element("Comida"));
        comida.add(new Element("Comida"));
        
    }
}
