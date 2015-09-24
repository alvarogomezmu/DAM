/*
 NomAsig String
 nota double
    
 1. Escribir el fichero. Sacar el menu
 2.
 2.1 Leer todo el fichero
 2.2 Leer la asignatura 
 */
package proyectoAD;

import java.io.*;

public class leerFicheroAsignatura 
{

    public static void main(String args[]) 
    {
        try 
        {
            BufferedReader asignatura = new BufferedReader(new FileReader("C:\\Users\\Alumnot\\Documents\\ficherillo.txt"));

        }catch(IOException e)
        {
            System.out.println("Aqui andamios");
        }
    }
}
