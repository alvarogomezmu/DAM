package Ejercicios;

import java.io.IOException;
import org.jdom2.Document;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import Herramientas.Herramientas;

/**
 *
 * @author Alvaro
 */
public class Ejercicio15 {

    public static void main(String[] args) {
        Document doc = null;

        try {
            doc = new SAXBuilder().build("C:\\petra\\universidad.xml");
        } catch (JDOMException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        // Nombre de las asignaturas que estudia Luisa
        Herramientas.xpath(doc, "//asignatura[@id=//alumno[nombre='Luisa']//asignatura/@codigo]/nombre");
    }
}
