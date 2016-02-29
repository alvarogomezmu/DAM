/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chattcp;

import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

/**
 *
 * @author AlumnoT
 */
public class Cliente {

    static String ip = "127.0.0.1";
    static int puerto = 1027;

    public static void main(String args[]) {
        try {
            // Crear socket cliente
            Socket cliente = new Socket();

            // Establecer conexion
            InetSocketAddress addr = new InetSocketAddress(ip, puerto);
            cliente.connect(addr);

            InputStream is = cliente.getInputStream();
            OutputStream os = cliente.getOutputStream();

            PrintWriter fsalida = new PrintWriter(os, true);

            String mensaje = "mensaje jaja saludos";
            fsalida.println(mensaje);

            cliente.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
