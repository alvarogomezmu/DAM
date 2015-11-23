/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosRepasoXpath;

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
import xpath.Abreviado2;

public class Ejercicio1 {

    public static void main(String args[]) {

        Document doc = null;

        try {
            doc = new SAXBuilder().build("C:\\petra\\personas.xml");
        } catch (JDOMException ex) {
            Logger.getLogger(Abreviado2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Abreviado2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.print("\nApartado 1. Mostrar el  nombre de las personas que tenga el mismo lugar de nacimiento  que el director:\n");
        herramientas.xPath(doc, "//persona//nacimiento[@fecha]//persona[@id]//puesto[@cargo='director']");
        
        System.out.print("\nApartado 1. Mostrar el  nombre de las personas que tenga el mismo lugar de nacimiento  que el director:\n");
        herramientas.xPath(doc, "//persona//nacimiento");
        
        // /biblioteca/libro/autor[@fechaNacimiento='28/03/1936']","fechaNacimiento
    }
}
