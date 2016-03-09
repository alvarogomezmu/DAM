package examen2evPSYP;

import java.io.*;
import java.net.*;

/**
 *
 * @author Alvaro Gomez
 */
public class ClienteObjeto {

    public static void main(String[] arg) throws IOException, ClassNotFoundException {
        String Host = "localhost";
        int Puerto = 6000; // Puerto remoto
        System.out.println("Programa Cliente Iniciado");
        Socket cliente = new Socket(Host, Puerto);

        // Flujo de entrada para objetos
        ObjectInputStream perEnt = new ObjectInputStream(cliente.getInputStream());

        // Se recibe un objeto
        Persona dato = (Persona) perEnt.readObject(); //recibir objeto
        System.out.println("Cliente1: Enviando venta: " + dato.getVenta());


        //Flujo de salida para objetos
        ObjectOutputStream perSal = new ObjectOutputStream(cliente.getOutputStream());

        // envio del objeto
        perSal.writeObject(dato);
        System.out.println("Servidor: " + "Recibida venta del " +dato.getNombre() + ": " + dato.getVenta()+"€"+"." + " Ventas acumuladas " + dato.getNombre() +": "+dato.getTotalVentas()+"€");
        
        System.out.println("El "+dato.getNombre() + " ha vendido "+dato.getTotalVentas()+"€");
        // Cerrar Streams y Sockets
        perEnt.close();
        perSal.close();
        cliente.close();
    }
}
