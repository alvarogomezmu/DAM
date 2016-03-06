package Ejercicio3;

import java.io.IOException;
import org.jdom2.Document;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author Alvaro Gomez
 */
public class Consulta1 {

    public static void main(String args[]) {
        // Abrimos el fichero
        Document doc = null;
        try {
            doc = new SAXBuilder().build(".\\src\\Ejercicio3\\arbol.xml");
        } catch (JDOMException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Nombre de los directores que han dirigido peliculas con algun actor de UK
        Metodos.xpath(doc, "//pelicula/reparto/actor[@nacionalidad='uk']/pelicula/director");
        //Metodos.xpath(doc, "//child::cine[self::id[count>2]]../../child::titulo");
    }
}
