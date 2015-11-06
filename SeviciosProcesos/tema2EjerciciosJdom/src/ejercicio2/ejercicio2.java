package ejercicio2;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;

// Escribir el siguiente fichero y mostrar su contenido por pantalla y también enviar su contenido a otro fichero
public class ejercicio2 {

    public static void main(String[] args) {

        Element root = new Element("documento");
        Element ej = new Element("ejemplo");
        Element cont = new Element("contenido");
        cont.setText("Primera liena del ejemplo 1");
        ej.addContent(cont);

        cont = new Element("contenido");
        cont.setText("Segunda liena del ejemplo 1");
        ej.addContent(cont);

        cont = new Element("contenido");
        cont.setText("Tercera liena del ejemplo 1");
        ej.addContent(cont);

        root.addContent(ej);

        ej = new Element("ejemplo");
        cont = new Element("contenido");

        cont.setText("Primera liena del ejemplo 2");
        ej.addContent(cont);
        cont = new Element("contenido");
        cont.setText("Segunda liena del ejemplo 2");
        ej.addContent(cont);
        cont = new Element("contenido");
        cont.setText("Tercera liena del ejemplo 2");
        ej.addContent(cont);
        root.addContent(ej);

        XMLOutputter salida = new XMLOutputter();
        Document doc = new Document(root);
        try {
            salida.output(doc, System.out);
            salida.output(doc, new FileOutputStream("C://petra//ejercicio2.xml"));

        } catch (Exception e) {
            System.out.println("Error");
        }

    }

}
