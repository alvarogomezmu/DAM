package ProyectoAD;

import java.io.*;
import java.util.*;

public class EjToken2 
{

    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Alumnot\\Documents\\clientes.txt"));
        String linea = null;
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int cont1 = 0;
        int cont2 = 0;
        float media1 = 0;
        float media2 = 0;
        System.out.print("Introduce la opcion(1, 2, 3, 4): ");
        int opcion = Integer.parseInt(sc.readLine());
        switch (opcion) 
        {
            case 1:
                while ((linea = br.readLine()) != null) 
                {
                    StringTokenizer st = new StringTokenizer(linea, ".");
                    while (st.hasMoreTokens()) 
                    {
                        String num = st.nextToken();
                        System.out.print(num + " ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                int cont = 0;
                while ((linea = br.readLine()) != null) 
                {
                    StringTokenizer st = new StringTokenizer(linea, ".");
                    while (st.hasMoreTokens()) 
                    {
                        int num = Integer.parseInt(st.nextToken());
                        if (num < 10 && num >= 0) 
                        {
                            cont++;
                        }
                    }
                }
                System.out.println("La cantidad de numeros de una cifra es: " + cont);
                break;
            case 3:
                int contmas2 = 0;
                while ((linea = br.readLine()) != null) 
                {
                    StringTokenizer st = new StringTokenizer(linea, ".");
                    while (st.hasMoreTokens()) 
                    {
                        int num = Integer.parseInt(st.nextToken());
                        if (num > 9) 
                        {
                            contmas2++;
                        }
                    }
                }
                System.out.println("La cantidad de numeros de mas de una cifra es: " + contmas2);
                break;
            case 4:
                while ((linea = br.readLine()) != null) 
                {
                    StringTokenizer st = new StringTokenizer(linea, ".");
                    while (st.hasMoreTokens()) 
                    {
                        float num = Float.parseFloat(st.nextToken());
                        if (num < 10) 
                        {
                            media1 = media1 + num;
                            cont1++;
                        } else {
                            media2 = media2 + num;
                            cont2++;
                        }
                    }
                }
                System.out.println("La media de los de una cifra es: " + media1 / cont1 + ", y la media de mas de una es: " + media2 / cont2);
                break;

        }
    }
}

//Listar ficher
// La cantidad de nº de 1 cifra
// La cantidad de nº de 2 p + cifras
// La media de cada caso
