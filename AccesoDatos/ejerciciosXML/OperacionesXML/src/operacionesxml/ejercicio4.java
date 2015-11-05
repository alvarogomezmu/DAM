/*
    1. añadir a comida una etiqueta llamada extras con atributo postres caros
    2. añadir una nueva etiqueta Nombre1 en todos los tiposplatos
    3. modificar el texto de las nuevas etiquetas nombre1
    horchata ,vino, cava respectivamente
    4. Eliminar del menú las comidas cuyo plato sea postre y su nombre coincida con crema
    con nueces
 */
package operacionesxml;

import java.util.Iterator;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author AlumnoT
 */
public class ejercicio4 {

    public static void main(String args[]) {
        SAXBuilder sx = new SAXBuilder();
        Document doc = null;

        try {
            doc = sx.build("C://petra//menu.xml");
        } catch (Exception e) {
            e.printStackTrace();
        }

        Element root = doc.getRootElement();

        List<Element> comidas = root.getChildren("comida");

        Iterator it = comidas.iterator();

        while (it.hasNext()) {
            Element comida = (Element) it.next();
            List<Element> tiposplatos = c.getChildren("tiposplatod");
            comida.setAttribute("extras");
        }

    }
}
