
import static com.sun.org.apache.xml.internal.serialize.Method.XML;
import java.io.FileInputStream;
import java.io.IOException;
import org.jdom2.Document;
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
public class escritura {

    public static void main(String args[]) {
        try {
            SAXBuilder builder = new SAXBuilder();
            Document doc = builder.build(new FileInputStream("ruta archivo.XML"));
            //Hacer una lectura
            new XMLOutputter().output(doc, System.out);
        } catch (JDOMException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
