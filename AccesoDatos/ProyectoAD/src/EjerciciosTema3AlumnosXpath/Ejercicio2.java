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

/**
 *
 * @author AlumnoT
 */
public class Ejercicio2 {

    public static void main(String args[]) {

        Document doc = null;

        try {
            doc = new SAXBuilder().build("C:\\petra\\ciclos2.xml");
        } catch (JDOMException ex) {
            Logger.getLogger(Abreviado2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Abreviado2.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.print("\nApartado 1. Página web del Instituto:\n");
        herramientas.xPath(doc, "//web");
        
        System.out.print("\nApartado 2. Nombre de los Ciclos formativos\n");
        herramientas.xPath(doc, "//ciclo/nombre");

        System.out.print("\nApartado 3. Siglas por las que se conocen los Ciclos Formativos:\n");
        herramientas.xPathValue(doc, "//ciclo","id");
        
        System.out.print("\nApartado 4. Años en los que se publicaron los decretos de título de los Ciclos:\n");
        herramientas.xPathValue(doc, "//decretoTitulo","ano");
        
        System.out.print("\nApartado 5. Ciclos Formativos de Grado Medio:\n");
        herramientas.xPath(doc, "//ciclo[grado='Medio']/nombre");
        
        System.out.print("\nApartado 6. Nombre de los Ciclos Formativos de Grado Superior:\n");
        herramientas.xPath(doc, "//ciclo[grado='Superior']/nombre");
        
        System.out.print("\nApartado 7. Nombre de los Ciclos Formativos anteriores a 2010:\n");
        herramientas.xPathValue(doc, "//decretoTitulo","ano<'2010'");
        
        
        System.out.print("\nApartado 8. Nombre de los Ciclos Formativos de 2008 o 2010:\n");
        herramientas.xPathValue(doc, "//decretoTitulo","ano");
        
        

    }
}
