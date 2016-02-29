/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socket4hilos;

import java.io.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Alvaro
 */
public class ServidorStream {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        try {

            // Nuevo socket de Servidor
            ServerSocket serverSocket = new ServerSocket();

            // Realizando bind
            InetSocketAddress addr = new InetSocketAddress("localhost", 5555);
            serverSocket.bind(addr);
            System.out.println("El servidor estÃ¡ activo.");

            // Aceptamos las conexiones, en este caso esta limitado a 4.
            int i = 0;
            for (i = 0; i < 4; i++) {

                Socket nuevoSocket = serverSocket.accept();
                Thread t = new socketHilos(nuevoSocket, i);
                t.start();

            }
            System.out.println("El servidor ha finalizado la conexiÃ³n.");

            // cerrando el socket servidor
            serverSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
