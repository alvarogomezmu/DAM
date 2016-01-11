/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.IOException;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.Document;

import Herramientas.Herramientas;

/**
 *
 * @author Alvaro
 */
public class Control1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Document doc = null;
        try {
            doc = new SAXBuilder().build("C:\\petra\\control1\\cine.xml");
        } catch (JDOMException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        System.out.println("1. Títulos de las películas\n");
        Herramientas.xpath(doc, "//peliculas/pelicula/titulo");
        
        System.out.println("\n2. Títulos de las películas en las que Anthony Perkins es actor");
        Herramientas.xpath(doc, "//pelicula[actor='Anthony Perkins']/titulo");
        
        System.out.println("\n3. Nombre de las personas de sexo femenino");
        Herramientas.xpath(doc, "//persona[@sexo='mujer']/nombre");
        
        System.out.println("\n4. Directores de las películas en las que actua Janet Leigh");
        Herramientas.xpath(doc, "//pelicula[actor='Janet Leigh']/director");
        
        System.out.println("\n5. Nombre de las personas vivas");
        Herramientas.xpath(doc, "//persona[not (fechas/@fallecimiento)]/nombre");
        
        System.out.println("\n6. Nombre de las personas que vivieron toda su vida en el siglo XX");
        Herramientas.xpath(doc, "//persona[fechas/@nacimiento>1899 and fechas/@fallecimiento<2000]/nombre");
        
        System.out.println("\n7. Fecha de nacimiento de los actores de la película 'Tres en un sofa'"); 
        //Herramientas.xpath(doc, "//pelicula[titulo='Tres en un sofa']/../personas/persona/[nombre=autor]/fechas/@nacimiento");
            
    }
}
