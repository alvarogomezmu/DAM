/*
 1. Añadir dos nuevas etiquetas :
 <mueble>muebles baratos</mueble>
 <persianas>De colores </persianas>
 2. Modificar el texto de la segunda etiqueta mueble para que no sea igual a la primera
 <mueble>muebles caros</mueble> 
 3. Borrar la primera persiana que habéis añadido
 4. Añadir un atributo a mueble donde el texto es muebles caros
 <mueble tamaño=”extra”>
 */
package operacionesxml;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;

/**
 *
 * @author AlumnoT
 */
public class ejercicio2 {

    public static void main(String args[]) {

        SAXBuilder sx = new SAXBuilder();
        Document doc = null;

        try {
            doc = sx.build("C://petra//tienda2.xml");
        } catch (Exception e) {
            e.printStackTrace();
        }

        Element root = doc.getRootElement();

        List<Element> chancleta = root.getChildren("tipo");

        Iterator it = chancleta.iterator();

        while (it.hasNext()) {
            Element t = (Element) it.next();
            t.addContent(new Element("mueble").setText("HolaYoda"));
            t.addContent(new Element("persiana").setText("deColores"));
        }

        try {
            new XMLOutputter().output(doc, System.out);
        } catch (IOException ex) {
            Logger.getLogger(ejercicio2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
