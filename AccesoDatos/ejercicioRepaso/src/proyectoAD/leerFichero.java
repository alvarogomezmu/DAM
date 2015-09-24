package proyectoAD;

import java.io.*;

public class leerFichero {

    public static void main(String args[]) {
        try {
            BufferedReader fl = new BufferedReader(new FileReader("C:\\Users\\Alumnot\\Documents\\ficherillo.txt"));
            while (fl.ready()) {
                System.out.println(fl.readLine());
            }
        } catch (IOException e) {
            System.out.println("Se ha producido un error");
        }
    }
}
