package practica3;

import java.io.IOException;
import java.util.ArrayList;
import org.jdom2.Document;
import org.jdom2.Element;

/**
 *
 * @author Alvaro Gomez
 */
public class Ejercicio3 {

    public static void main(String args[]) {
        // creacion del ArrayList para vehiculos Terrestres
        ArrayList<Element> Terrestres = new ArrayList<Element>();
        Terrestres.add(new Element("Vehiculo").setText("Bicicleta"));
        Terrestres.add(new Element("Vehiculo").setText("Coche"));
        Terrestres.add(new Element("Vehiculo").setText("Tractor"));

        // creacion del ArrayList para vehiculos acuaticos
        ArrayList<Element> Acuaticos = new ArrayList<Element>();
        Acuaticos.add(new Element("Vehiculo").setText("Canoa"));

        // creacion del ArrayList para vehiculos aereos
        ArrayList<Element> Aereos = new ArrayList<Element>();
        Aereos.add(new Element("Vehiculo").setText("Avioneta"));
        Aereos.add(new Element("Vehiculo").setText("Helicoptero"));

        // creacion del ArrayList que contendra los anteriores 
        ArrayList<ArrayList<Element>> vehiculos = new ArrayList<ArrayList<Element>>();
        vehiculos.add(Terrestres);
        vehiculos.add(Acuaticos);
        vehiculos.add(Aereos);

        // creacion de la etiqueta root vehiculos
        Element root = new Element("Vehiculos");

        // creacion del ArrayList para tipos de vehiculo
        ArrayList<Element> tipoVehiculos = new ArrayList<Element>();

        tipoVehiculos.add(new Element("Terrestres"));
        tipoVehiculos.add(new Element("Acuaticos"));
        tipoVehiculos.add(new Element("Aereos"));

        // crear arbol
        Herramientas.crearArbolNivel3(root, tipoVehiculos, vehiculos);

        // crear documento que contenga el arbol
        Document doc = new Document(root);

        // escribir el fichero
        try {
            Herramientas.escribirFichero(doc, "vehiculos");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
