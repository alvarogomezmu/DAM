/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.io.*;
import static java.lang.Thread.sleep;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AlumnoT
 */
public class Chat {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(); //nuevo socket servidor

            // Realizando bind
            InetSocketAddress addr = new InetSocketAddress("192.168.35.186", 1027);
            serverSocket.bind(addr);

            // Aceptando conexiones
            Socket newSocket = serverSocket.accept();
            
            
            //Creando socket cliente
            Socket clientSocket = new Socket();

            //Estableciendo conexión
            InetSocketAddress addrCliente = new InetSocketAddress("192.168.35.185", 1027);
            
            
            // Recibiendo mensaje
            InputStream is = newSocket.getInputStream();
            OutputStream os = clientSocket.getOutputStream();
            BufferedReader fentrada = new BufferedReader(new InputStreamReader(is));
            PrintWriter fsalida = new PrintWriter(os, true);
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));


            sleep(10000);
            clientSocket.connect(addrCliente);
            
            // Variable donde se almacenará el mensaje
            String mensajeCliente = "";
            String mensajeMio = "";

            while (!mensajeCliente.equals("cerrar") || !mensajeMio.equals("cerrar")) {
                mensajeCliente = fentrada.readLine();
                System.out.println("Gunto dice: " + mensajeCliente);
                
                System.out.print("Introduce argo: ");
                mensajeMio = teclado.readLine();
                fsalida.println(mensajeMio);
            }
            // cerrando el nuevo socket
            newSocket.close();
            // cerrando el buffer
            fentrada.close();
            

            //cerrando el socket servidor
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException ex) {
            Logger.getLogger(Chat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

