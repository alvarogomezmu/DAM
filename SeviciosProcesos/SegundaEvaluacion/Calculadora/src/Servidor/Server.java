package Servidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread {

    
    
    public static void main(String[] args) throws IOException {
        double num1, num2, total = 0.0;
        int operacion;
        char opr = '\n';

        // Crea un socket en el puerto 12342
        ServerSocket servidor = new ServerSocket(12342);
        System.out.println("Puerto 12342 abierto!");

        // Espera a que alguien se conecte. La ejecucion del servidor se bloquea en la llamada al metodo accept de la clase ServerSocket. 
        // Cuando alguien se conecta al servidor, el método se desbloquea y devuelve un objeto de la clasea clase de objeto Socket, que es un puerto de comunicación.
        System.out.print("Esperando a que se conecte el cliente...");
        Socket cliente = servidor.accept();

        System.out.println("Nueva conexion con el cliente " + cliente.getInetAddress().getHostAddress());

        ObjectOutputStream resultado = new ObjectOutputStream(cliente.getOutputStream());
        ObjectInputStream datos = new ObjectInputStream(cliente.getInputStream());

        operacion = datos.readInt();
        num1 = datos.readDouble();
        num2 = datos.readDouble();

        // Bucle para que el usuario elija una opcion.
        if (operacion == 1) {

            opr = '+';
            total = (num1 + num2);

        } else if (operacion == 2) {

            opr = '-';
            total = (num1 - num2);

        } else if (operacion == 3) {

            opr = 'x';
            total = (num1 * num2);

        } else {

            opr = '/';
            total = (num1 / num2);

        }

        resultado.writeDouble(total);
        resultado.writeChar(opr);
        resultado.flush();

        resultado.close();
        datos.close();
        servidor.close();
    }
}
