/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesxml;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author AlumnoT
 */
public class mostrarnNPibook {

    public static void main(String args[]) {
        try {
            SAXBuilder sx = new SAXBuilder();
            Document doc = sx.build("C://petra//tienda.xml");
            Element root = doc.getRootElement();
            if (root.getAttributeValue("nombre").equals("ibook")) {
                System.out.println(root.getAttributeValue("precio"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
