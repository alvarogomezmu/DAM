package Servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main 
{
	public static void main(String[] args) throws IOException
	{
		int h=0;
		
		int numeroPuerto=5555; //192.168.35.102
		ServerSocket servidor=new ServerSocket(numeroPuerto);
		String cad="";
		System.out.println("Esperando conexión…");
		
		while(h<4)
		{
			Socket clienteConectado=servidor.accept();
			h++;
			System.out.println("Cliente conectado…");
			
			Thread t=new Server(clienteConectado);
			t.start();
		}
		
		servidor.close(); 
	}
}
