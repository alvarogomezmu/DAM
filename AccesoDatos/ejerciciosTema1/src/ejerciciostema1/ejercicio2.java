/*
    Basándonos en el ejercicio 1, debemos decir si los valores guardados en el fichero son pares o impares.
    Deberemos mostrar dos mensajes uno para los pares y otro para los impares. Primero los miraremos en el fichero, 
    luego repetir para mirarlos en el Arraylist.
 */
package ejerciciostema1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ejercicio2 {

    public static void main(String[] args) {
        try {
            BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\Alumnot\\Documents\\numero.txt"));
            ArrayList<Integer> ar = new ArrayList<Integer>();
            String str = null;
            int num;
            
            while (bf.ready()) {
                str = bf.readLine();
                num = Integer.parseInt(str);
                ar.add(num);
            }
            
            for (int i = 0; i < ar.size(); i++) {
                if (ar.get(i) % 2 == 0) {
                    System.out.println("El numero " + ar.get(i) + " es par");
                } else {
                    System.out.println("El numero " + ar.get(i) + " es impar");
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}