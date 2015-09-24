package proyectoAD;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;

import herramientas.herramientass;
import java.io.IOException;

public class ficheroAleatorio {

    public static void main(String arg[]) {
        try {
            RandomAccessFile RAF = new RandomAccessFile("C:\\Users\\Alumnot\\Documents\\raf.txt", "rw");

            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

            for (int i = 0; i < 2; i++) {
                System.out.println("Nombre");
                RAF.writeUTF(herramientass.ConvertUTF(teclado.readLine(), 20));
            }
        } catch (IOException ex) {
            System.out.println("hola");
        }

        try {
            RandomAccessFile x = new RandomAccessFile("C:\\Users\\Alumnot\\Documents\\raf.txt", "r");
            for (int i = 0; i < 2; i++) {
                x.seek(i * 22);
                String nombre = x.readUTF();
                System.out.println(nombre);
                x.close();
            }
        } catch (IOException ex) {
            System.out.println("que tal");
        }
    }
}
