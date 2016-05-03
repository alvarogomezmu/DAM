package practica3;

import java.util.ArrayList;
import org.jdom2.Element;
import java.io.IOException;
import org.jdom2.Document;

/**
 *
 * @author Alvaro Gomez
 */
public class Ejercicio5 {

    public static void main(String args[]) {
        // creacion del ArrayList Destino
        ArrayList<Element> Destino = new ArrayList<Element>();
        Destino.add(new Element("Nombre").setText("Alicia Abad"));
        Destino.add(new Element("Direccion").setText("Plaza de la Duquesa 12"));
        Destino.add(new Element("Ciudad").setText("Albacete"));
        Destino.add(new Element("CodPostal").setText("05020"));

        // creacion del ArrayList Ordenante
        ArrayList<Element> Ordenante = new ArrayList<Element>();
        Ordenante.add(new Element("Nombre").setText("Roberto Movilla"));
        Ordenante.add(new Element("Direccion").setText("General Ricardos 56"));
        Ordenante.add(new Element("Ciudad").setText("Madrid"));
        Ordenante.add(new Element("CodPostal").setText("28055"));

        // creacion del ArrayList para primer producto
        ArrayList<Element> producto1 = new ArrayList<Element>();
        producto1.add(new Element("Nombre").setText("Cortadora de cesped"));
        producto1.add(new Element("Cantidad").setText("1"));
        producto1.add(new Element("Precio").setText("148.95"));
        producto1.add(new Element("Observaciones").setText("Confirmar que es electrica"));

        // creacion del ArrayList para segundo producto
        ArrayList<Element> producto2 = new ArrayList<Element>();
        producto2.add(new Element("Nombre").setText("Podadora"));
        producto2.add(new Element("Cantidad").setText("3"));
        producto2.add(new Element("Precio").setText("7.98"));

        // creacion del ArrayList para Contenido
        ArrayList<Element> Contenido = new ArrayList<Element>();
        Contenido.add(new Element("Producto").setAttribute("Codigo", "872-AA").addContent(producto1));
        Contenido.add(new Element("Producto").setAttribute("Codigo", "926-FH").addContent(producto2));

        // creacion del ArrayList para los datos anteriores
        ArrayList<ArrayList<Element>> Datos = new ArrayList<ArrayList<Element>>();
        Datos.add(Destino);
        Datos.add(Ordenante);
        Datos.add(new ArrayList<Element>());
        Datos.add(Contenido);

        // creacion del ArrayList para hijos de root
        ArrayList<Element> Pedido = new ArrayList<Element>();
        Pedido.add(new Element("Destino"));
        Pedido.add(new Element("Ordenante"));
        Pedido.add(new Element("Observaciones").setText("Es urgente, el cesped esta muy alto"));
        Pedido.add(new Element("Contenido"));

        // creacion del elemento root
        Element root = new Element("Pedido").setAttribute("Fecha", "1999-10-20");

        // creacion del arbol
        Herramientas.crearArbolNivel3(root, Pedido, Datos);

        // creacion del documento
        Document doc = new Document(root);

        // creacion del fichero
        try {
            Herramientas.escribirFichero(doc, "Pedido");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
