/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesxml;

import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;
import org.jdom2.contrib.dom.*;
import org.jdom2.*;

public class modificarAtributo {

    public static void main(String[] args) {
        try {
            SAXBuilder sx = new SAXBuilder();
            Document doc = sx.build("C://petra//tienda.xml");
            Element root = doc.getRootElement();
            System.out.println(root);
            root.getChild("nivel").setAttribute("precio", "2300");
            //XMLOutputter se pone al final para cambiar el dato precio.
            new XMLOutputter().output(doc, System.out);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
