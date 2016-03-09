/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2evPSYP;

import java.io.*;
import java.net.*;

/**
 *
 * @author Alvaro Gomez
 */
public class ServidorObjeto {

    public static void main(String args[]) throws IOException, ClassNotFoundException {

        int numeroPuerto = 6000; // Puerto
        ServerSocket servidor = new ServerSocket(numeroPuerto);
        System.out.println("Esperando al cliente");
        Socket cliente = servidor.accept();

        // Preparar el flujo de salida para objetos
        ObjectOutputStream outObjeto = new ObjectOutputStream(cliente.getOutputStream());

        // Preparar un objeto y enviarlo
        Persona per = new Persona("Cliente1", 100, 250);
        outObjeto.writeObject(per); // enviando objeto

        // Obtener un stream para leer objetos
        ObjectInputStream inObjeto = new ObjectInputStream(cliente.getInputStream());
        Persona dato = (Persona) inObjeto.readObject();

        // Cerrar streams y sockets
        outObjeto.close();
        inObjeto.close();
        cliente.close();
        servidor.close();

    }
}
