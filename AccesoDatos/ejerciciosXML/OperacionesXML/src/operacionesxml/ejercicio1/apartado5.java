/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesxml.ejercicio1;

import herramientas.Herramientas;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author AlumnoT
 */
public class apartado5 {

    public static void main(String args[]) throws IOException {

        // Leemos el XML y lo metemos en un document
        Document doc = null;
        try {
            doc = new SAXBuilder().build("C:\\petra\\tienda.xml");
        } catch (JDOMException ex) {
            Logger.getLogger(apartado1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(apartado1.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Cogemos el element root
        Element root = doc.getRootElement();

        // Anadir nueva etiqueta empleado con atributo cargo, con valor responsable
        root.addContent(new Element("empleado").setAttribute("cargo", "empleado"));

        // Escribimos las modificaciones
        try {
            Herramientas.escribirXML(doc);
        } catch (IOException ex) {
            Logger.getLogger(apartado1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
