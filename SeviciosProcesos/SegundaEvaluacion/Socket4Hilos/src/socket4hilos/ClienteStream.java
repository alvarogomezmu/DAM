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
public class ClienteStream {

    public static void main(String[] args) {

        try {
            // Creamos el socket cliente
            Socket ClientSocket = new Socket();

            // Establecemos la conexiÃ³n
            InetSocketAddress addr = new InetSocketAddress("localhost", 5555);
            ClientSocket.connect(addr);

            //
            InputStream is = ClientSocket.getInputStream();
            OutputStream os = ClientSocket.getOutputStream();
            BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

            String mnsj = sc.readLine();

            PrintWriter fsalida = new PrintWriter(os, true);

            while (!mnsj.equals("+")) {

                fsalida.println(mnsj);
                mnsj = sc.readLine();
            }

            // Mensaje enviado, ahora cerramos el socket
            ClientSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
