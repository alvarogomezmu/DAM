
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alumnot
 */
public class leerHijos {

    public static void main(String args[]) {

        try {
            SAXBuilder builder = new SAXBuilder();
            Document doc = builder.build(new FileInputStream("C:\\Users\\Alumnot\\Documents\\archivetaso.XML"));
            Element root = root = doc.getRootElement();
            List<Element> t = root.getChildren("tipo");

            Iterator i = t.iterator();
            while (i.hasNext()) {
                Element e = (Element) i.next();
                Element c = e.getChild("Computadora");
            }
        } catch (JDOMException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
