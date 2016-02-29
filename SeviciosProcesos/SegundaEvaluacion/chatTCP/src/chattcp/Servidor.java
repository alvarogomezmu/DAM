/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chattcp;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author AlumnoT
 */
public class Servidor {

    static String ip = "127.0.0.1";
    static int puerto = 1027;
    static int max = 4;

    public static void main(String[] args) {
        try {
            // Crear socket servidor
            ServerSocket server = new ServerSocket();

            // Realizar bind
            InetSocketAddress addr = new InetSocketAddress(ip, puerto);
            server.bind(addr);

            // Aceptar conexiones
            for (int i = 0; i < max; i++) {
                Socket nuevoSocket = server.accept();
                Thread t = new Sockets(nuevoSocket, i);
                t.start();
            }
            server.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
