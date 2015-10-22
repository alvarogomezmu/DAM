/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdomconsax;

import java.io.FileOutputStream;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.XMLOutputter;

public class ejemplo1 {

    public static void main(String args[]) {
        //Creamos la raiz tienda
        Element root = new Element("Tienda");
        root.setAttribute("nombre", "tienda para geeks");
        root.setAttribute("ubicacion", "Tokio, Japon");

        //creamos el hijo computadora
        Element Computadora = new Element("Computadora");
        Computadora.setAttribute("nombre", "iBook");
        Computadora.setAttribute("Precio", "$1200");
        root.addContent(Computadora);

        //creamos el hijo historieta
        Element Historieta = new Element("historieta");
        Historieta.setAttribute("nombre", "Dragon Ball Volumen 1");
        Historieta.setAttribute("Precio", "$9");
        root.addContent(Historieta);

        Document doc = new Document(root);

        XMLOutputter salida = new XMLOutputter();
        try {
            salida.output(doc, System.out);
            salida.output(doc, new FileOutputStream("C:\\Users\\Alumnot\\Documents\\NetBeansProjects\\FicherosXML\\src\\Arboles\\tienda.xml"));
        } catch (Exception e) {

            System.out.println("Error");
        }
    }
}
