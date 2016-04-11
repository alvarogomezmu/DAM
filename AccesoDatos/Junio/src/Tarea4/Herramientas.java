/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea4;

import java.io.IOException;
import org.jdom2.Document;
import org.jdom2.output.XMLOutputter;

/**
 *
 * @author Alvaro
 */
public class Herramientas {

    public static void escribirXML(Document doc) throws IOException {
        XMLOutputter salida = new XMLOutputter();

        salida.output(doc, System.out);
    }
}
