/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chattcp;

import java.net.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;

/**
 *
 * @author AlumnoT
 */
public class ServidorChat extends JFrame implements ActionListener{
    private static final long serialVersionUID = 1L;
    static ServerSocket servidor;
    static final int PUERTO=44444; // Puerto por el que se escucha
    static int CONEXIONES=0; // cuenta las conexiones
    static int ACTUALES=0; // máximo de conexiones permitidas
    static int MAXIMO=10; // maximo de conexiones permitidas
    
    static JTextField mensaje=new JTextField("");
    static JTextField mensaje2=new JTextField("");
    private JScrollPane scrollpanel;
    static JTextArea textarea;
    JButton salir = new JButton("Salir");
    static Socket tabla[]=new Socket[10]; // almacena sockets de clientes

    public ServidorChat(){
        super("Ventana del Servidor de CHAT");
        setLayout(null);
        mensaje.setBounds(20,10,400,30);
        add(mensaje);
        mensaje.setEditable (false);
        
        mensaje2.setBounds(20,349,400,30);
        add(mensaje2);
        mensaje2.setEditable(false);
        
        textarea = new JTextArea();
        scrollpanel = new JScrollPane(textarea);
        
        scrollpanel.setBounds(10,50,400,300);
        add(scrollpanel);
        salir.setBounds(420,10,100,30);
        add(salir);
        
        textarea.setEditable(false);
        salir.addActionListener(this);
        // SE ANULA EL CIERRE DE LA VENTANA para que la finalizacion del servidor se haga desde el boton salir
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
    
    // Accion cuando se pulsa el boton Salir
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == salir){ // se pulsa salir
            try{
                servidor.close(); // cierre
            }catch(IOException e1){
                e1.printStackTrace();
            }
            System.exit(0); //fin
        }
    }
    
    public static void main(String[] args) throws IOException{
        servidor = new ServerSocket(PUERTO);
        System.out.println("Servidor Iniciado...");
        ServidorChat pantalla = new ServidorChat();
        pantalla.setBounds(0,0,540,400);
        pantalla.setVisible(true);
        mensaje.setText("NUMERO DE CONEXIONES ACTUALES: " + 0);
        
        // BUCLE para controlar el numero de conexiones
        // Desde el bucle se espera la conexion del cliente
        // cuandp hay una conexion se crea el Socket
        
        while(CONEXIONES < MAXIMO){
            Socket s = new Socket();
            try{
                s = servidor.accept(); // espera de cliente
            }catch(SocketException ns){
            // sale por aqui si se pulsa boton salir
            // no se ejecuta por tanto el bucle
            break; // sale del bucle
        }
            //almacenar el socket en la tabla y se incrementan las conexiones
            // se lanza hilo para gestion de mensajes con el cliente nuevo
            tabla[CONEXIONES]=s; //Almacenar el Socket
            CONEXIONES++;
            ACTUALES++;
            HiloServidor hilo = new HiloServidor(s);
            hilo.start(); // lanzando hilo
        } // fin bucle
        // cerrando el servidor si no se ha cerrado
        if(!servidor.isClosed())
            try{
                // sale cuando llega al maximo de conexiones
                mensaje2.setForeground(Color.red);
                mensaje2.setText("MAXIMO Nº DE CONEXIONES ESTABLECIDAS: "+ CONEXIONES);
                servidor.close();
            }catch(IOException e1){
                e1.printStackTrace();
            }
        System.out.println("Servidor finalizado...");
    } // main
}
