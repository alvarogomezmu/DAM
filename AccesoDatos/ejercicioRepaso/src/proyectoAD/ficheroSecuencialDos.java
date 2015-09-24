// 1.Leer por teclado --> ?
// 2.Escribir en el secuencial
package proyectoAD;

import java.io.*;
import java.util.Scanner;

public class ficheroSecuencialDos {

    public static void main(String args[]) {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan = new Scanner(teclado);
        try {
            BufferedWriter fe = new BufferedWriter(new FileWriter("C:\\Users\\Alumnot\\ejemplo.txt"));
            for (int i = 1; i <= 3; i++) {
                fe.write(scan.nextLine());
                fe.newLine();
            }
            fe.close();
        } catch (IOException e) {
            System.out.println("error");
        }
    }
}
