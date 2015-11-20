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

public class Ejercicio3 {

    public static void main(String args[]) {
        Document doc = null;

        try {
            doc = new SAXBuilder().build("C:\\petra\\ciclos2.xml");
        } catch (JDOMException ex) {
            Logger.getLogger(Abreviado2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Abreviado2.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.print("\nApartado 1. Nombre de los módulos del ciclo ASIR:\n");
        herramientas.xPath(doc, "//child::modulo");

        System.out.print("\nApartado 2. Nombre de los módulos que se imparten en el segundo curso de cualquier ciclo:\n");
        herramientas.xPath(doc, "//child::web");

        System.out.print("\nApartado 3. Nombre de los módulos de menos de 5 horas semanales:\n");
        herramientas.xPath(doc, "//child::web");

        System.out.print("\nApartado 4. Nombre de los módulos que se imparten en el primer curso de ASIR:\n");
        herramientas.xPath(doc, "//child::web");

        System.out.print("\nApartado 5. Horas semanales de los módulos de más de 3 horas semanales (4, 5, 5):\n");
        herramientas.xPath(doc, "//child::web");
    }
}
