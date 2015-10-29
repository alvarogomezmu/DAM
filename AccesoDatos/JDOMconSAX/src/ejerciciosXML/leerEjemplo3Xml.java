/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosXML;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class leerEjemplo3Xml {

    public static void main(String[] args) {

        try {
            SAXBuilder builder = new SAXBuilder();
            Document doc = builder.build(new FileInputStream("C:\\petra\\ejercicio3Xml.xml"));

            //Se lee el elemento root
            Element root = doc.getRootElement();
            //Se imprime el atributo
            System.out.println("Atributo tipo: " + root.getAttributeValue("tipo"));

            //Se crea la lista de equipos
            List equipos = root.getChildren("equipo");

            Iterator i = equipos.iterator();
            while (i.hasNext()) {
                Element e = (Element) i.next();
                Element club = e.getChild("club");
                System.out.println("Club: " + club.getText());
                System.out.println("Valoracion: " + club.getAttributeValue("valoracion"));
                System.out.println("Ciudad: " + club.getAttributeValue("ciudad"));
                Element presi = e.getChild("presidente");
                System.out.println("Presidente: " + presi.getText());
                //Se crea la lista de plantilla
                List plantilla = e.getChildren("plantilla");
                Iterator i1 = plantilla.iterator();
                while (i1.hasNext()) {
                    Element p = (Element) i1.next();
                    //Se crea la lista de nombre
                    List nombre = p.getChildren("nombre");
                    Iterator i2 = nombre.iterator();
                    while (i2.hasNext()) {
                        Element n = (Element) i2.next();
                        System.out.println("Nombre: " + n.getText());
                    }
                }
            }
            System.out.println("Arbitros");
            List arbitros = root.getChildren("arbitros");
            Iterator i4 = arbitros.iterator();
            while (i4.hasNext()) {
                Element a = (Element) i4.next();
                List nombre = a.getChildren("nombre");
                Iterator i5 = nombre.iterator();
                while (i5.hasNext()) {
                    Element n = (Element) i5.next();
                    System.out.println("Nombre: " + n.getText());
                }

            }

        } catch (IOException e) {
            System.out.println("ERROR LECTURA");
        } catch (JDOMException ex) {
            System.out.println("ERROR JDOM");
        }
    }

}
