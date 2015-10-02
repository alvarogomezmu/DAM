package loteria;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Loteria{ 

    public static void main(String[] args) throws IOException, InterruptedException {
        //Declaracion de objetos
        String line;
        Process[] p = new Process[6];
        InputStream[] is = new InputStream[6];
        InputStreamReader[] isr = new InputStreamReader[6];
        BufferedReader[] br = new BufferedReader[6];

        for (int i = 0; i < 6; i++) {
            p[i] = new ProcessBuilder("C:\\Users\\Alumnot\\Desktop\\aleatorios").start();
            is[i] = p[i].getInputStream();
            isr[i] = new InputStreamReader(is[i]);
            br[i] = new BufferedReader(isr[i]);
            Thread.sleep(800);
        }

        for (int j = 0; j < 6; j++) {
            p[j].waitFor();
        }

        for (int k = 0; k < 6; k++) {
            System.out.println("Salida del proceso Aleatorio" + k + ".");
            while ((line = br[k].readLine()) != null) {
                System.out.println(line);
            }
        }
    }

}
