/*Ejercicio 2.
 Define una clase Libreria que almacene: titulo, autor, editorial, ISBN
 Realiza un programa que genere una serir de objetos Libreria con distintos valores
 Escribir un fichero serializando el objeto Libreria.
 Permite que el programa lea el contenido del fichero serializado y lo carge en un HashMap, teniendo como clave el ISBN.
 Mostrar el contenido del Hashmap*/
package ejerciciodos;

import java.util.HashMap;
import Herramientas.herramientas;
import java.io.IOException;
/**
 *
 * @author Alumnot
 */
public class main {
    public static void main(String args[]) throws IOException{
        libreria libr1 = new libreria();
        libreria libr2 = new libreria();
        libreria libr3 = new libreria();
        
        libr1.newLibreria("Don Quijote de la mancha","Miguel de Cergantes", "Amaya, como la abeja", 69696969);
        libr2.newLibreria("Alek y el wipe", "Alek", "EjemploPor", 1234567);
        libr3.newLibreria("Chanta Justa Clan", "Ahel", "Glut", 9876543);
        
        HashMap <Integer,String> maps = new HashMap <Integer,String>();
        
        herramientas.serializarObject(libr1, "C:\\Users\\alumnot\\Desktop\\fichero.obj");
        
    }
}
