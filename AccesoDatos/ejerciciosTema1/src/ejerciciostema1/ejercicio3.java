/*
    
 */
package ejerciciostema1;

import java.io.IOException;
import java.io.RandomAccessFile;

public class ejercicio3 
{
    public static void main(String args[])
    {
        try 
        {
            RandomAccessFile x = new RandomAccessFile("C:\\Users\\Alumnot\\Documents\\raf.txt", "r");
            for (int i = 0; i < 2; i++) 
            {
                x.seek(i * 22);
                String nombre = x.readUTF();
                System.out.println(nombre);
                x.close();
            }
        } catch (IOException ex);
    }

