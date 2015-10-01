package ProyectoAD;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class tokens3jugadores 
{
    public static void main(String args[])
    {
        try 
        {
            BufferedReader fl = new BufferedReader(new FileReader("C:\\Users\\Alumnot\\Documents\\GitHub\\dam\\AccesoDatos\\ProyectoAD\\src\\ProyectoAD\\deportes.txt"));
            String linea = null;
            
            while ((linea = fl.readLine()) != null) 
            {
                StringTokenizer st = new StringTokenizer(linea,"=;");
                
                while (st.hasMoreTokens()) 
                {
                    String nombre = st.nextToken();
                    String deporte = st.nextToken();
                   
                    System.out.println(nombre + " " + deporte);
                }
            }
            // Cerramos el fichero
            fl.close();
        } 
        catch (IOException e) 
        {
        	// Si ha habido un error, mostrarlo
            System.out.println("Error: " + e);
        }
    }
}
