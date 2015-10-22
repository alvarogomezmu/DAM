/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdomejercicios;

import java.io.FileOutputStream;
import java.io.IOException;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.XMLOutputter;

/**
 *
 * @author Alumnot
 */
public class Hijos {
    public static void main(String args[]) {
        Element root = new Element("persona");
        root.setAttribute("Nombre","Rodrigo");
        /*
        Document doc = new Document(root);
        
        XMLOutputter salida = new XMLOutputter();
        
        try {
        salida.output(doc, System.out);
        salida.output(doc, new FileOutputStream("C:\\Users\\Alumnot\\Documents\\risasMil.xml"));
        } catch (IOException ex) {
        ex.printStackTrace();
        }*/
    }
}