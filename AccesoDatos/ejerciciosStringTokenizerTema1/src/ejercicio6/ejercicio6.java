package ejercicio6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import Herramientas.herramientas;

public class ejercicio6 {

    public static void main(String[] args) {

        ArrayList<String> prod = new ArrayList<>();

        try {

            BufferedReader fich = new BufferedReader(new FileReader("/Users/juliadelasdoblas/Desktop/AccesoDatos/Mis_ficheros/Productos.txt"));

            String linea = null;
            System.out.println("");

            while ((linea = fich.readLine()) != null) {

                StringTokenizer st = new StringTokenizer(linea, "#");

                while (st.hasMoreTokens()) {
                    String producto = st.nextToken();
                    String descrip = st.nextToken();
                    String precio = st.nextToken();

                    if (descrip.equals(" ")) {
                        prod.add(producto);

                    }

                }

            }

            fich.close();

            herramientas.recorrerColeccion(prod);

        } catch (IOException e) {

            System.out.println("Error");

        }
    }

}
