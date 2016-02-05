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
public class ClienteObjeto {

    public static void main(String[] arg) throws IOException, ClassNotFoundException {
        String Host = "192.168.35.185";
        int Puerto = 1027; // Puerto remoto
        System.out.println("Programa Cliente Iniciado");
        Socket cliente = new Socket(Host, Puerto);

        // Flujo de entrada para objetos
        ObjectInputStream perEnt = new ObjectInputStream(cliente.getInputStream());
        
        // Se recibe un objeto
        Persona dato = (Persona) perEnt.readObject(); //recibir objeto
        System.out.println("Recibo: " + dato.getNombre() + "*" + dato.getEdad());
        
        // Modificacion del objeto
        dato.setNombre("juanito maravilla");
        dato.setEdad(7);
        
        //Flujo de salida para objetos
        ObjectOutputStream perSal = new ObjectOutputStream(cliente.getOutputStream());
        
        // envio del objeto
        perSal.writeObject(dato);
        System.out.println("Envio: " + dato.getNombre() + "*" + dato.getEdad());
        
        // Cerrar Streams y Sockets
        perEnt.close();
        perSal.close();
        cliente.close();
    }
}