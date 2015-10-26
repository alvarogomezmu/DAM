
import java.io.FileInputStream;
import java.io.IOException;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumnot
 */
public class leerRaiz {
    public static void main(String args[]) {
        try {
            SAXBuilder builder = new SAXBuilder();
            Document doc = builder.build(new FileInputStream("ruta archivo.XML"));
            
            //Hacer una lectura
            Element root = doc.getRootElement();
            System.out.println(root.getName());
            System.out.println(root.getAttributeValue("Nombre"));
            
            Element c = root.getChild("computadora");
            System.out.println(c.getName() +
                    " Nombre: " + c.getAttributeValue("Nombre") + 
                    " Precio: " + c.getAttributeValue("Precio"));
            c = root.getChild("Historieta");
            System.out.println(c.getName() +
                    " Nombre: " + c.getAttributeValue("Nombre") + 
                    " Precio: " + c.getAttributeValue("Precio"));
            c = root.getChild("Nivel");
            System.out.println(c.getName() +
                    " Precio: " + c.getAttributeValue("Precio"));
        } catch (JDOMException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
