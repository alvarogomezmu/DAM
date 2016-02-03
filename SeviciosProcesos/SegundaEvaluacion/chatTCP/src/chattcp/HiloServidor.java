/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chattcp;

import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AlumnoT
 */
public class HiloServidor extends Thread{
    DataInputStream fentrada;
    Socket socket = null;
    public HiloServidor(Socket s){
        socket = s;
        try{
            // crear flujo de entrada
            fentrada = new DataInputStream(socket.getInputStream());
        }catch(IOException e){
            System.out.println("ERROR DE E/S");
            e.printStackTrace();
        }
    } // constructor
    
    public void run(){
        ServidorChat.mensaje.setText("NUMERO DE CONEXIONES ACTUALES: " + ServidorChat.ACTUALES);
        // LO PRIMERO es enviar todos los mensajes
        String texto=ServidorChat.textarea.getText();
        EnviarMensajes(texto);
        // bucle que recibe lo que el cliente escribe en el chat.
        // al salir se le envia un * al servidor
        while(true){
            String cadena="";
            try{
                cadena=fentrada.readUTF(); // lee lo que el cliente escribe cuando un cliente finaliza envia un *
                if(cadena.trim().equals("*")){
                    ServidorChat.ACTUALES--;
                    ServidorChat.mensaje.setText("NUMERO DE CONEXIONES ACTUALES: " + ServidorChat.ACTUALES);
                    break; // salir del while
                } //fin if
                
                ServidorChat.textarea.append(cadena + "\n");
                texto = ServidorChat.textarea.getText();
                EnviarMensajes(texto); // se envia texto a todos los clientes
            }catch(Exception e){
                e.printStackTrace();
                break;
            }
        } // fin bucle while
    } // fin run
    
    // ENVIAR MENSAJES DEL TEXTAREA A LOS CLIENTES DEL CHAT
    private void EnviarMensajes(String texto){
        int i;
        // recorrer tabla de sockets para enviar mensajes a todos
        for(i=0; i<ServidorChat.CONEXIONES; i++){
            Socket s1 = ServidorChat.tabla[i]; // obtener socket
            try{
                DataOutputStream fsalida = new DataOutputStream(s1.getOutputStream());
                fsalida.writeUTF(texto); // escribir en el socket el texto
            }catch(SocketException se){
                //esta excepcion ocurre al escribir en un socket de un cliente que ha finalizado
            } catch (IOException e) {
                e.printStackTrace();
            }
        } //fin for
    } // fin enviar mensajes
}// fin HiloServidor
