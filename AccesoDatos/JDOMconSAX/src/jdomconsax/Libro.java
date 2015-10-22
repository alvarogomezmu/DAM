/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdomconsax;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.XMLOutputter;
import java.io.*;

public class Libro {

    public static void main(String[] args) {

        Element root = new Element("Libro");
        root.setAttribute("isbn", "345E2");

        //Añadimos Hijos
        Element Titulo = new Element("Titulo");
        Titulo.setText("Mujercitas");
        root.addContent(Titulo);
        Element Precio = new Element("Precio");
        Precio.setText("3,50");
        root.addContent(Precio);

        Document doc = new Document(root);

        XMLOutputter salida = new XMLOutputter();

        try {
            salida.output(doc, System.out);
            salida.output(doc, new FileOutputStream("C:\\Users\\Alumnot\\Documents\\NetBeansProjects\\FicherosXML\\src\\Arboles\\Libro.xml"));
        } catch (Exception e) {

            System.out.println("Error");
        }
    }
}
