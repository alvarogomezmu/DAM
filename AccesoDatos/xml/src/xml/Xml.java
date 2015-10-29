/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml;

import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.lang.model.element.Element;
import javax.swing.text.Document;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author AlumnoT
 */
public class Xml {

    SAXBuilder builder = new SAXBuilder();
    Document doc = null;

    
        try {
            doc = builder.build("C://petra//futbol.xml");
    }
    catch (JDOMException ex

    
        ) {
            Logger.getLogger(leerxml.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (IOException ex

    
        ) {
            Logger.getLogger(leerxml.class.getName()).log(Level.SEVERE, null, ex);
    }
    Element root = doc.getRootElement();

    System.out.println (root.getAttributeValue
    
    ("tipo"));

        List equipo = root.getChildren("equipo");

    Iterator i = equipo.iterator();

    while (i.hasNext () 
        ) {
            Element e = (Element) i.next();
        Element club = e.getChild("club");
        Element presi = e.getChild("presidente");

        List plantilla = e.getChildren("plantilla");

        Iterator i2 = plantilla.iterator();

        while (i2.hasNext()) {
            Element p = (Element) i.next();
            Element nombre = p.getChild("nombre");
            System.out.println(nombre);
        }
    }

}
