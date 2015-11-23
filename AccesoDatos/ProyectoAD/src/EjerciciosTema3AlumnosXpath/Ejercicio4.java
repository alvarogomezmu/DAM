/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosTema3AlumnosXpath;

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

public class Ejercicio4 {

    public static void main(String args[]) {
        Document doc = null;

        try {
            doc = new SAXBuilder().build("C:\\petra\\ciclos2.xml");
        } catch (JDOMException ex) {
            Logger.getLogger(Abreviado2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Abreviado2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.print("\nApartado 1:\n");
        herramientas.xPath(doc, "//ciclo[@id=//modulo[nombre='[MSGE']/ciclo]/nombre");
        
        System.out.print("\nApartado 2:\n");
        herramientas.xPath(doc, "//child::modulo[/child::ciclo=//child::ciclo[/child::grado='Superior']/Attribute::id]/child::nombre");
        
        System.out.print("\nApartado 3:\n");
        herramientas.xPath(doc, "//modulos/modulo[ciclo=//ciclo/decretoTitulo[@ano='2002']/../@id]/nombre");
        
        System.out.print("\nApartado 4:\n");
        herramientas.xPath(doc, "//child::ciclos/child::ciclo[attribute::id=//child::modulo/child::curso[/self::curso='1']/child::ciclo]/child::grado");
    }
}
