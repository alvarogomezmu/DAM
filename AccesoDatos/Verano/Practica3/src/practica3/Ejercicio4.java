package practica3;

import java.util.ArrayList;
import org.jdom2.Element;
import java.io.IOException;
import org.jdom2.Document;

/**
 *
 * @author Alvaro Gomez
 */
public class Ejercicio4 {

    public static void main(String args[]) {

        // creacion del ArrayList para la direccion de primera persona
        ArrayList<Element> persona1Direccion = new ArrayList<Element>();
        persona1Direccion.add(new Element("calle").setText("Caoba, 1"));
        persona1Direccion.add(new Element("poblacion").setText("Madrid"));
        persona1Direccion.add(new Element("provincia").setText("Madrid"));
        persona1Direccion.add(new Element("codigo_Postal").setText("28005"));

        //creacion del ArrayList para primera persona
        ArrayList<Element> persona1 = new ArrayList<Element>();
        persona1.add(new Element("nombre").setText("Juan"));
        persona1.add(new Element("apellidos").setText("Pardo"));
        persona1.add(new Element("nacimiento").setAttribute("Dia", "10").setAttribute("Mes", "Abril").setAttribute("Ano", "1982"));
        persona1.add(new Element("direccion").addContent(persona1Direccion));
        persona1.add(new Element("varon"));

        // creacion del ArrayList para la primera direccion de segunda persona
        ArrayList<Element> persona2Direccion1 = new ArrayList<Element>();
        persona2Direccion1.add(new Element("calle").setText("Roncito,1"));
        persona2Direccion1.add(new Element("poblacion").setText("Ilesas"));
        persona2Direccion1.add(new Element("provincia").setText("Toledo"));
        persona2Direccion1.add(new Element("codigoPostal").setText("45200"));

        // creaciondel ArrayList para la segunda direccion de segunda persona
        ArrayList<Element> persona2Direccion2 = new ArrayList<Element>();
        persona2Direccion2.add(new Element("calle").setText("Paseo de la Esperanza,15-1ro"));
        persona2Direccion2.add(new Element("poblacion").setText("Madrid"));
        persona2Direccion2.add(new Element("provincia").setText("Madrid"));
        persona2Direccion2.add(new Element("codigoPostal").setText("28005"));

        // creacion del ArrayList para segunda persona
        ArrayList<Element> persona2 = new ArrayList<Element>();
        persona2.add(new Element("nombre").setText("Maria"));
        persona2.add(new Element("apellidos").setText("Lopez"));
        persona2.add(new Element("direccion").addContent(persona2Direccion1));
        persona2.add(new Element("direccion").addContent(persona2Direccion2));
        persona2.add(new Element("hembra"));

        // ArrayList para hijos de root
        ArrayList<Element> personas = new ArrayList<Element>();
        personas.add(new Element("persona"));
        personas.add(new Element("persona"));

        // creacion del elemento root
        Element root = new Element("personas");

        // cracion del ArrayList con los datos de todas las personas
        ArrayList<ArrayList<Element>> datos = new ArrayList<ArrayList<Element>>();
        datos.add(persona1);
        datos.add(persona2);

        // creacion del arbol
        Herramientas.crearArbolNivel3(root, personas, datos);

        // creacion del documento
        Document doc = new Document(root);

        // creacion del fichero
        try {
            Herramientas.escribirFichero(doc, "personas");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
