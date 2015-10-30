/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesxml;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;

public class anadirEtiqueta {

    public static void main(String[] args) {
        try {
            SAXBuilder sx = new SAXBuilder();
            Document doc = sx.build("Operaciones.xml");
            Element root = doc.getRootElement();
            Element et = new Element("nueva");
            et.setText("Hola que ase");
            root.addContent(et);
            new XMLOutputter().output(doc, System.out);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
