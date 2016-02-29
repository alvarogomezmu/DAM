/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socket4hilos;

import java.io.*;
import java.net.*;

/**
 *
 * @author Alvaro
 */
public class socketHilos extends Thread {

    private Socket newSocket;
    private int cliente;

    public socketHilos(Socket newSocket, int i) {
        this.newSocket = newSocket;
        this.cliente = i;
    }

    public void run() {
        InputStream is;

        try {

            System.out.println("El cliente " + cliente + " se ha conectado.");
            is = newSocket.getInputStream();
            OutputStream os = newSocket.getOutputStream();
            BufferedReader fentrada = new BufferedReader(new InputStreamReader(is));
            String entr = fentrada.readLine();

            while (!entr.equals("*")) {
                System.out.println("CLIENTE " + cliente + ": " + entr);
                entr = fentrada.readLine();

            }
            System.out.println("El cliente " + cliente + " se ha desconectado.");

            // cerramos el socket
            newSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
