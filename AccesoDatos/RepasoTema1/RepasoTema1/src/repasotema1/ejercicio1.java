/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasotema1;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Alvaro Gomez
 * @version 19-10-2015
 */
public class ejercicio1 {

    public static void main(String[] args) {
        try {
            RandomAccessFile entrada;
            entrada = new RandomAccessFile("fichero", "r");
            //Linea que falta:
            entrada.seek(10);
            int dato = entrada.readInt();
            int real = entrada.readInt();
        } catch (IOException e) {
            System.out.println("Excepcion io");
        }
    }

}
