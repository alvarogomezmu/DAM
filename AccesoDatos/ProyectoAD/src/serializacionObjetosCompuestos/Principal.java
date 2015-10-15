/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacionObjetosCompuestos;

import Herramientas.herramientas;
import java.io.*;

public class Principal {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Agenda agenda1 = new Agenda(new Contacto("Alvaro", "602158963"));
        Agenda agenda2 = new Agenda(new Contacto("Alex", "685489321"));
        Agenda agenda3 = new Agenda(new Contacto("Alberto", "692365478"));

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\AlumnoT\\Desktop\\SerializarObjetoCompuesto.obj"));

        herramientas.escribirObjetos(oos, agenda1);
        herramientas.escribirObjetos(oos, agenda2);
        herramientas.escribirObjetos(oos, agenda3);

        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\AlumnoT\\Desktop\\SerializarObjetoCompuesto.obj"));
        herramientas.leerObjetos(ois);
    }

}
