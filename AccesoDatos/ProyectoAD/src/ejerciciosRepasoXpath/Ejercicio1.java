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

        System.out.println("\nApartado 1. Mostrar el  nombre de las personas que tenga el mismo lugar de nacimiento  que el director:\n");
        herramientas.xPath(doc, "//persona[nacimiento/@fecha=//persona[@id=//puesto[@cargo='director']/@id]/nacimiento/@fecha]/nombre");

        System.out.println("\nApartado 2. Mostrar el nombre de la madre de las personas  que sean más jóvenes  que la recepcionista:\n");
        herramientas.xPath(doc, "//persona/nacimiento[@fecha!=//persona[@id=//puesto[@cargo='recepcionista']/@id]/nacimiento/@fecha]/../madre");

        System.out.println("\nApartado 3. Mostrar el identificador de las personas que no sean camareras y que su lugar de nacimiento  no coincida con el lugar de nacimiento del director");
        herramientas.xPath(doc,"//persona[@id=//puesto[@cargo='camarera']/@id and nacimiento[@lugar!=//persona[@id=//puesto[@cargo='director']/@id]/nacimiento/@lugar]][@id]");
        
        System.out.println("\nApartado 4. Mostrar el cargo que ocupan las personas  que tienen más de 1 dirección de comtacto  y cuyo sueldo sea mayor al  que gana la recepcionista");
        herramientas.xPath(doc,"//persona[count(direccion)>1[@id] and sueldo[.>//personas/persona[@id=//puesto[@cargo='recepcionista']/@id]/sueldo]/..[@id]]");
        
        System.out.println("\nApartado 5. Muestra el nombre de todos las personas cuyo país de nacimiento sea distinto al de Jeanne Dupont\n");
        herramientas.xPath(doc,"//persona[nacimiento/@fecha=//persona[nombre!='Jeanne Dupont']/nacimiento/@fecha]/nombre");
    }
}
