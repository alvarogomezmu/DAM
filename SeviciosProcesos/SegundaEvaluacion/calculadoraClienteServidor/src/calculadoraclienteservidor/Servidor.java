package calculadoraclienteservidor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Alvaro Gomez
 */
public class Servidor {

    public static void main(String[] args) throws IOException {

        double num1, num2, total = 0.0;
        int operacion;
        char opr = '\n';

        // Crea un socket en el puerto 12342
        ServerSocket servidor = new ServerSocket(12342);
        System.out.println("Puerto 12342 abierto!");

        // Espera a que el cliente se conecte. La ejecucion del servidor se bloquea en la llamada al metodo accept de la clase ServerSocket. 
        System.out.print("Esperando a que se conecte el cliente...");
        Socket cliente = servidor.accept();

        //System.out.println("Nueva conexion con el cliente " + cliente.getInetAddress().getHostAddress());
        
        ObjectOutputStream resultado = new ObjectOutputStream(cliente.getOutputStream());
        ObjectInputStream datos = new ObjectInputStream(cliente.getInputStream());

        operacion = datos.readInt();
        num1 = datos.readDouble();
        num2 = datos.readDouble();

        // Bucle para que el usuario elija una opcion dependiendo de la operacion que desee realizar.
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
        // escribimos el resultado final y la operacion
        resultado.writeDouble(total);
        resultado.writeChar(opr);
        resultado.flush();

        // cerramos el resultado final, los datos introducidos, y el servidor.
        resultado.close();
        datos.close();
        servidor.close();
    }
}
