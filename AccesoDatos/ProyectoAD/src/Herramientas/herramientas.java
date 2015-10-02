package Herramientas;

/**
 * @author Daniel Marcos Lorrio
 * @version 1.0.1 02-10-2015
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

public class herramientas {

    /**
     * Metodo que sirve para recorrer listas
     *
     * @param colec Para cualquier colección
     */
    public static void recorrerColeccion(Collection colec) {
        Iterator it = colec.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    /**
     * Metodo para recorrer maps con clave String
     *
     * @param map Para cualquier map
     */
    public static void recorrerMapStr(Map map) {

        Iterator it = map.keySet().iterator();

        while (it.hasNext()) {
            String clave = (String) it.next();
            Object valor = (Object) map.get(clave);
            System.out.println(clave + " " + valor);
        }
    }

    /**
     * Metodo para recorrer maps con clave Integer, de tipo entero
     *
     * @param map Para cualquier map
     */
    public static void recorrerMapInt(Map map) {

        Iterator it = map.keySet().iterator();

        while (it.hasNext()) {
            Integer clave = (Integer) it.next();
            Object valor = (Object) map.get(clave);
            System.out.println(clave + " " + valor);
        }
    }

    /**
     * Determina el tamaño de una cadena dentro de un fichero de tipo aleatorio
     *
     * @param txt Para cualquier string
     * @param longitud Integer que va asociado al string
     * @return retorna la cadena generada
     */
    public static String convertUTF(String txt, int longitud) {

        if (txt.length() > longitud) {
            return txt.substring(0, longitud);
        }
        for (int n = txt.length(); n < longitud; n++) {
            txt = txt + " ";
        }
        return txt;
    }

    /**
     * Metodo para leer fichero mediante BufferedReader
     *
     * @param lecturaFich BufferedReader declarado previamente
     * @param arrList ArrayList de Integer declarado previamente
     */
    public static void leerFichero(BufferedReader lecturaFich, ArrayList<Integer> arrList) {
        String linea = null;
        try {
            while ((linea = lecturaFich.readLine()) != null) {
                StringTokenizer tok = new StringTokenizer(linea, "!");
                while (tok.hasMoreTokens()) {
                    arrList.add(Integer.parseInt(tok.nextToken()));
                    arrList.add(Integer.parseInt(tok.nextToken()));
                }
            }
            lecturaFich.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    /**
     * Metodo para recorrer un ArrayList de Integers e imprimirlos
     *
     * @param arrList ArrayList de Integers declarado previamente
     */
    public static void listarFichero(ArrayList<Integer> arrList) {
        for (int i = 0; i < arrList.size(); i++) {
            System.out.print(arrList.get(i) + " ");
        }
    }

    /**
     * Metodo para contar los Integers de un ArrayList menores de 10
     *
     * @param arrList ArrayList de Integers declarado previamente
     * @return Cantidad de Integers menores de 10
     */
    public static int contarUnaCifra(ArrayList<Integer> arrList) {
        int count = 0;

        for (int i = 0; i < arrList.size(); i++) {
            if (arrList.get(i) < 10) {
                count++;
            }
        }
        return count;
    }

    /**
     * Metodo para contar los Integers de un ArrayList mayores o igual a 10
     *
     * @param arrList ArrayList de Integers declarado previamente
     * @return Cantidad de Integers mayores o igual a 10
     */
    public static int contarDosCifras(ArrayList<Integer> arrList) {
        int count = 0;

        for (int i = 0; i < arrList.size(); i++) {
            if (arrList.get(i) >= 10) {
                count++;
            }
        }
        return count;
    }

    /**
     * Metodo para sumar los Integers menores de 10 de un ArrayList
     *
     * @param arrList ArrayList de Integers declarado previamente
     * @return Suma de los integers
     */
    public static int sumaUnaCifra(ArrayList<Integer> arrList) {
        int suma = 0;

        for (int i = 0; i < arrList.size(); i++) {
            if (arrList.get(i) < 10) {
                suma += arrList.get(i);
            }
        }
        return suma;
    }

    /**
     * Metodo para sumar los enteros mayores o igual a 10 de un ArrayList
     *
     * @param arrList ArrayList de Integers declarado previamente
     * @return Suma de los integers
     */
    public static int sumaDosCifras(ArrayList<Integer> arrList) {
        int suma = 0;

        for (int i = 0; i < arrList.size(); i++) {
            if (arrList.get(i) >= 10) {
                suma += arrList.get(i);
            }
        }
        return suma;
    }
}
