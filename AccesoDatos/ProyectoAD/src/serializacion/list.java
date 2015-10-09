package serializacion;

import Herramientas.herramientas;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class list implements java.io.Serializable {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        contacto contacto1 = new contacto();
        contacto1.nuevoContacto("Berto", "45589089");
        contacto contacto2 = new contacto();
        contacto2.nuevoContacto("Pepa", "609088654");
        contacto contacto3 = new contacto();
        contacto3.nuevoContacto("Antonio", "648859301");

        herramientas.serializarObject(contacto1, "C:\\Users\\alumnot\\Desktop\\fichero.obj");
        herramientas.desserializarObject("C:\\Users\\alumnot\\Desktop\\fichero.obj");
    } 

    //Metodo que sirve para leer "n" objetos dentro de un fichero
    public static void leerObjetos(ObjectInputStream leer) throws IOException, ClassNotFoundException {
        try {
            while (true) {
                Object c = (Object) leer.readObject();
            }
        } catch (EOFException ex) {
            // tratamiento de Accion (-pintar pantalla -guardar en una coleccion -guardar en un Map -guardar fichero
            System.out.println("Final de fichero");
        } finally {
            if (leer != null) {
                leer.close();
            }
        }
    }
}
