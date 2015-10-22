/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.io.FileOutputStream;
import java.io.IOException;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.XMLOutputter;

public class ejercicio2 {

    public static void main(String args[]) {
        Element tienda = new Element("Tienda");
        tienda.setAttribute("nombre", "Tienda para geeks");
        tienda.setAttribute("Ubicacion", "Tokio,Japon");

        Element tipo = new Element("Tipo");

        Element computadora = new Element("Computadora");
        computadora.setAttribute("nombre", "iBook");
        computadora.setAttribute("Precio", "$1200");

        Element historieta = new Element("Historieta");
        historieta.setAttribute("nombre", "Dragon Ball Volumen 1");
        historieta.setAttribute("precio", "$9");

        Element nivel = new Element("Nivel");
        nivel.setAttribute("precio", "oscila");

        tipo.addContent(computadora);
        tipo.addContent(historieta);
        tipo.addContent(nivel);

        tienda.addContent(tipo);

        Element tipo1 = new Element("Tipo1");
        Element computadoral = new Element("Computadoral");
        computadoral.setAttribute("nombre", "pc");
        computadoral.setAttribute("precio", "$1400");

        Element historietal = new Element("Historietal");
        historietal.setAttribute("nombre", "naruto");
        historietal.setAttribute("precio", "$15");

        Element nivell = new Element("Nivell");
        nivell.setAttribute("precio", "oscila");

        tienda.addContent(tipo1);

        Document doc = new Document(tienda);
        XMLOutputter salida = new XMLOutputter();
        try {
            salida.output(doc, System.out);
            salida.output(doc, new FileOutputStream("C:\\Users\\Alumnot\\Documents\\tiendal.xml"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
