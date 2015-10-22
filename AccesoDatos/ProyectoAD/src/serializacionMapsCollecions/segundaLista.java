/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacionMapsCollecions;

import Herramientas.herramientas;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import static java.lang.Math.cos;
import java.util.HashMap;

/**
 *
 * @author Alumnot
 */
public class segundaLista {

    public static void main(String args[]) {
        try {
            contacto c1 = new contacto();
            contacto c2 = new contacto();
            contacto c3 = new contacto();

            c1.nuevoContacto("Fran", 5897);
            c2.nuevoContacto("Pepe", 2134);
            c3.nuevoContacto("Juan", 3245);

            HashMap mapa = new HashMap();

            mapa.put(c1, 1);
            mapa.put(c2, 2);
            mapa.put(c3, 3);

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Alumnot\\Desktop\\hashmap.bin"));

            herramientas.escribirMap(oos, mapa);

            oos.close();

        } catch (IOException e) {
            System.out.println("Error" + e);
        }
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Alumnot\\Desktop\\hashmap.bin"));
            herramientas.leerMap(ois);

        } catch (IOException e) {
            System.out.println("Error");
        }catch (ClassNotFoundException e){
            System.out.println("Error");
        }
    }

}
