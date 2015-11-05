package herramientas;

import operacionesxml.ejercicio1.apartado1;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom2.Document;
import org.jdom2.output.XMLOutputter;

public class Herramientas {

    public static void escribirXML(Document doc) throws IOException {
        XMLOutputter salida = new XMLOutputter();

        salida.output(doc, System.out);
    }
}
