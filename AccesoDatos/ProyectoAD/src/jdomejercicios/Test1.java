package jdomejercicios;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.XMLOutputter;

/**
 *
 * @author Alumnot
 */
public class Test1 {

    public static void main(String args[]) {
        Element root = new Element("root");
        root.setText("Prueba del averno");

        Document doc = new Document(root);
        
        XMLOutputter salida = new XMLOutputter();

        try {
            salida.output(doc, System.out);
            salida.output(doc, new FileOutputStream("C:\\Users\\Alumnot\\Documents\\risasMil.xml"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
