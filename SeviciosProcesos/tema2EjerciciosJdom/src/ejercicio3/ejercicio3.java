/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import ejercicio2.ejercicio2;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author AlumnoT
 */
public class ejercicio3 {

    public static void main(String args[]) {
        // Leemos el XML y lo metemos en un document
        Document doc = null;
        try {
            doc = new SAXBuilder().build("C:\\petra\\ejercicio2.xml");

            //Obtener el elemento raíz del documento
            Element root = doc.getRootElement();

            //Recorrer la lista de empleados
            for (int i = 0; i < ejercicio2.getLength(); i++) {
                //Obtener de la lista un empleado tras otro
                Node empleado = ejercicio2.item(i);
                System.out.println("Empleado " + i);
                System.out.println("==========");

                //Obtener la lista de los datos que contiene ese empleado
                NodeList datosEmpleado = empleado.getChildNodes();
                //Recorrer la lista de los datos que contiene el empleado
                for (int j = 0; j < datosEmpleado.getLength(); j++) {
                    //Obtener de la lista de datos un dato tras otro
                    Node dato = datosEmpleado.item(j);

                    //Comprobar que el dato se trata de un nodo de tipo Element
                    if (dato.getNodeType() == Node.ELEMENT_NODE) {
                        //Mostrar el nombre del tipo de dato
                        System.out.print(dato.getNodeName() + ": ");
                        //El valor está contenido en un hijo del nodo Element
                        Node datoContenido = dato.getFirstChild();
                        //Mostrar el valor contenido en el nodo que debe ser de tipo Text
                        if (datoContenido != null && datoContenido.getNodeType() == Node.TEXT_NODE) {
                            System.out.println(datoContenido.getNodeValue());
                        }
                    }
                }
                //Se deja un salto de línea de separación entre cada empleado
                System.out.println();
            }

        } catch (IOException ex) {
            System.out.println("ERROR: Se ha producido un error el leer el fichero\n" + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
