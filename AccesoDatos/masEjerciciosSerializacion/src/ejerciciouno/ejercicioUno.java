/*Define una clase Persona que almacene: nombre, apellidos, DNI, y edad.
Realiza un programa que pueda leer los datos relativos a personas desde la entrada estándar System.in
Cada persona que se lea, se debe almacenar en un HashMap, donde la llave será el DNI
Permite que el programa serialice en un fichero ese HashMap y termine
Cuando el programa vuelva a arrancar debe poder recuperar los datos introducidos previamente (recuperando el objeto previamente serializado)*/

package ejerciciouno;

import java.util.HashMap;
import Herramientas.herramientas;
import ejerciciodos.libreria;
import java.io.IOException;
import ejerciciouno.Metodos;
/**
 *
 * @author Alumnot
 */
public class ejercicioUno {
    public static void main(String args[])throws IOException{
        Persona pers1 = new Persona();
        Persona pers2 = new Persona();
        Persona pers3 = new Persona();
        
        //Metodos.setPersonaDatos(pers1);
        
        pers1.newLibreria("Pedro","Piqueras", "02387657p", 30);
        pers2.newLibreria("Daniel","Gonzalez", "02882357p", 25);
        pers3.newLibreria("Jorge","Palomo", "08747117p", 19);
        
        HashMap <Integer,String> maps = new HashMap <Integer,String>();
    }    
}
