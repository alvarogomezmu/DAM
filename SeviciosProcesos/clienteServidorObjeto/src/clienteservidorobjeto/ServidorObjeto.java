/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienteservidorobjeto;

import java.io.*;
import java.net.*;

/**
 *
 * @author AlumnoT
 */
public class ServidorObjeto {
    public static void main(String args[]) throws IOException, ClassNotFoundException{
        int numeroPuerto=6000; // Puerto
        ServerSocket servidor = new ServerSocket(numeroPuerto);
        System.out.println("Esperando al cliente");
        Socket cliente = servidor.accept(); 
        // prparar el flujo de salida para objetos
        ObjectOutputStream outObjeto = new ObjectOutputStream(cliente.getOutputStream());
        // Preparar un objeto y enviarlo
        Persona per = new Persona("Juan", 20);
        outObjeto.writeObject(per); // enviando objeto
        System.out.println("Envio:" + per.getNombre()+"*"+ per.getEdad());
        // obtener un stream para leer objetos
        ObjectInputStream inObjeto = new ObjectInputStream(cliente.getInputStream());
        Persona dato = (Persona) inObjeto.readObject();
        System.out.println("Recibo: " + dato.getNombre() + "*" +dato.getEdad());
        //cerrar streams y sockets
        outObjeto.close();
        inObjeto.close();
        cliente.close();
        servidor.close();
                
    }
}

