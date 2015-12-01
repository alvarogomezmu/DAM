/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author AlumnoT
 */
import Herramientas.herramientas;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.filter.Filters;
import org.jdom2.input.SAXBuilder;
import org.jdom2.xpath.XPathExpression;
import org.jdom2.xpath.XPathFactory;

public class Practica1 {

    public static void main(String args[]) {

        System.out.println("\nApartado 1. Mostrar el  nombre de las personas que tenga el mismo lugar de nacimiento  que el director:\n");
        Document doc = null;

        try {
            doc = new SAXBuilder().build("C:\\petra\\control1-cine.xml");
        } catch (JDOMException ex) {
            Logger.getLogger(Abreviado2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Abreviado2.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("\nApartado 1. Mostrar el  nombre de las personas que tenga el mismo lugar de nacimiento  que el director:\n");
        herramientas.xPath(doc, "//pelicula/titulo");
    }
}
