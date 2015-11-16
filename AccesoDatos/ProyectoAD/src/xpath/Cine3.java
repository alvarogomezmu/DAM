/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xpath;

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

/**
 *
 * @author AlumnoT
 */
public class Cine3 {

    public static void main(String args[]) {

        Document doc = null;

        try {
            doc = new SAXBuilder().build("C:\\petra\\cine.xml");
        } catch (JDOMException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Mostrar el titulo de la película dirigidas por el director  que ha 	nacido  en 1899	y ha 	fallecido en 1980.
        // Mostramos los anos anteriores al suyo
        XPathExpression<Element> xpath = XPathFactory.instance().compile("//pelicula[actor='Anthony Perkins' and count(actor) >=2]", Filters.element());
        List<Element> elemento = xpath.evaluate(doc);
        Iterator it = elemento.iterator();

        while (it.hasNext()) {
            Element n = (Element) it.next();
            Element titulo = n.getChild("titulo");
            System.out.println(n.getName() + ": " + titulo.getText());
        }

    }
}
