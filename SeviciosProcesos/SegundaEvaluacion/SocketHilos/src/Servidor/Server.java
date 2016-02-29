package Servidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread {

    public Socket socket;

    Server(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try {
            String cad;

            PrintWriter fsalida = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader fentrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            while ((cad = fentrada.readLine()) != null) {
                fsalida.println(cad);
                System.out.println("Recibiendo: " + cad);

                if (cad.equals("*")) {

                    break;
                }
            }

            System.out.println("Cerrando conexión…");
            fentrada.close();
            fsalida.close();
            socket.close();
        } catch (Exception ex) {
            System.err.println("Error " + ex.getMessage());
        }
    }
}
