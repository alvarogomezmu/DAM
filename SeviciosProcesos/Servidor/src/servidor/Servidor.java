package servidor;

import java.io.*;
import java.net.*;

public class Servidor {

    public static void main(String[] args) {
        try {

            //Creando socket cliente
            Socket clientSocket = new Socket();

            //Estableciendo conexión
            InetSocketAddress addr = new InetSocketAddress("192.168.35.185", 1027);
            clientSocket.connect(addr);

            //enviando mensaje
            InputStream is = clientSocket.getInputStream();
            OutputStream os = clientSocket.getOutputStream();
            String mensaje = "ghj";
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

            while (!mensaje.equals("cerrar")) {
                System.out.print("Introduce argo: ");
                mensaje = teclado.readLine();
                os.write(mensaje.getBytes());
            }
            //Mensaje eviado, ahora cierro el socket 
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
