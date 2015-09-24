/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoAD;

import java.io.*;

public class ficheroSecuencial {

    public static void main(String args[]) {
        try {
            BufferedWriter fe = new BufferedWriter(new FileWriter("C:\\Users\\Alumnot\\ejemplo.txt"));
            for (int i = 1; i <= 3; i++) {
                fe.write("linea" + i);
                fe.newLine();
            }
            fe.close();
        } catch (IOException e) {
            System.out.println("error");
        }
    }
}
