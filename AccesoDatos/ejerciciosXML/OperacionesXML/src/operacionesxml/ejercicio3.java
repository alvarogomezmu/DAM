/*
 1. Añadir un atributo a autor de tipo cat1 que sea siglo=XXI
 2. Borrar las direcciones de todos los autores
 3. Añadir una etiqueta nueva para el primer y tercer autor
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
public class ejercicio3 {

    public static void main(String args[]) {
        SAXBuilder sx = new SAXBuilder();
        Document doc = null;

        try {
            doc = sx.build("C://petra//ficha.xml");
        } catch (Exception e) {
            e.printStackTrace();
        }

        Element root = doc.getRootElement();

        List<Element> autor = root.getChildren("autor");

        Iterator it = autor.iterator();

        // 1. Añadir un atributo a autor de tipo cat1 que sea siglo=XXI
        while (it.hasNext()) {
            Element t = (Element) it.next();
            if ("autor tipo" == "cat1") {

            }
            t.addContent(new Element("XXI"));
        }

    }
}
