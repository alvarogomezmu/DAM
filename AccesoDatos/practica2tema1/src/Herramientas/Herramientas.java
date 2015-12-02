/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herramientas;

/**
 *
 * @author AlumnoT
 */
import java.util.*;
import java.util.Collection;
import java.util.Iterator;
import java.io.*;
public class Herramientas {

    public static void recorrerColeccion(Collection C) {
        Iterator it = C.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static boolean duplicados(Collection C, Object O) {
        //metodo que devuelve true si el objeto pasado por parametro ya esta en la coleccion pasada por parametro
        //vale para cualquier tipo de coleccion
        boolean encontrado = false;
        Iterator it = C.iterator();
        while (it.hasNext() && !encontrado) {
            if (O.equals(it.next())) {
                encontrado = true;
            }
        }
        return encontrado;
    }

    public static boolean duplicadosMap(Map M, Object O) {
        //metodo que devuelve true si el objeto pasado por parametro ya esta en la coleccion pasada por parametro
        //vale para cualquier tipo de coleccion
        boolean encontrado = false;
        Iterator it = M.keySet().iterator();
        while (it.hasNext() && !encontrado) {
            if (O.equals(it.next())) {
                encontrado = true;
            }
        }
        return encontrado;
    }

    public static void recorrerMapString(Map M) {
        Iterator it = M.keySet().iterator();
        while (it.hasNext()) {
            String clave = (String) it.next();
            Object valor = (Object) M.get(clave);
            System.out.println(clave + " " + valor);
        }
    }

    public static void rellenarMapyFichero(BufferedWriter escribir) {
        try {
            Map<String, alumno> alumnos = new HashMap<String, alumno>();
            String clave;
            String nombre;
            String nota;
            double notaAux;
            boolean primeraLinea = true;
            alumno al = new alumno("", 0.0);
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            for (int i = 0; i < 2; i++) {
                System.out.println("dame la clave: ");
                clave = teclado.readLine();
                System.out.println("dame el nombre: ");
                nombre = teclado.readLine();
                System.out.println("dame la nota: ");
                nota = teclado.readLine();
                if (primeraLinea) {
                    escribir.write(clave + "@");
                    escribir.write(nombre + "@");
                    escribir.write(nota);
                    primeraLinea = false;
                } else {
                    escribir.newLine();
                    escribir.write("@" + clave);
                    escribir.write("@" + nombre);
                    escribir.write("@" + nota);
                }
                notaAux = Double.parseDouble(nota);
                al.setNombre(nombre);
                al.setNota(notaAux);
                alumnos.put(clave, al);
            }
            escribir.close();
        } catch (IOException e) {
            System.err.println("Error escritura");
        }
    }

    public static void menu() {
        System.out.println("1-mostrar todos los datos");
        System.out.println("2-media de las notas");
        System.out.println("3-alumnos cuyas notas sean mayores que la media de la clase");
        System.out.println("0-salir");
    }

    public static void menu2() {
        System.out.println("1-mostrar ultimo libro introducido");
        System.out.println("2-mostrar un libro en concreto");
        System.out.println("3-mostrar todos los libros");
        System.out.println("0-salir");
    }

    public static void mostrarDatos() {
        try {
            String linea = null;
            String clave;
            String nombre;
            String nota;
            BufferedReader leer = new BufferedReader(new FileReader("FichInfoAlumno.txt"));
            while ((linea = leer.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(linea, "@");
                while (st.hasMoreTokens()) {
                    clave = st.nextToken();
                    nombre = st.nextToken();
                    nota = st.nextToken();
                    System.out.println("clave: " + clave + " nombre: " + nombre + " nota: " + nota);
                }
            }
            System.out.println("");
            leer.close();
        } catch (IOException e) {
            System.err.println("Error lectura");
        }
    }

    public static double calcularMedia() {
        double media = 0;
        int cont = 0;
        try {
            String linea = null;
            String clave;
            String nombre;
            String nota;
            BufferedReader leer = new BufferedReader(new FileReader("FichInfoAlumno.txt"));
            while ((linea = leer.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(linea, "@");
                while (st.hasMoreTokens()) {
                    clave = st.nextToken();
                    nombre = st.nextToken();
                    nota = st.nextToken();
                    media = media + Double.parseDouble(nota);
                    cont++;
                    System.out.println("clave: " + clave + " nombre: " + nombre + " nota: " + nota);
                }
            }
            System.out.println("");
            leer.close();
        } catch (IOException e) {
            System.err.println("Error lectura");
        }
        media = media / cont;
        return media;
    }

    public static void alumnosMayorMedia(double media) {
        try {
            String linea = null;
            String clave;
            String nombre;
            String nota;
            BufferedReader leer = new BufferedReader(new FileReader("FichInfoAlumno.txt"));
            System.out.println("Alumnos que superan la nota media de la clase:");
            while ((linea = leer.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(linea, "@");
                while (st.hasMoreTokens()) {
                    clave = st.nextToken();
                    nombre = st.nextToken();
                    nota = st.nextToken();
                    if (media < Double.parseDouble(nota)) {
                        System.out.println("clave: " + clave + " nombre: " + nombre + " nota: " + nota);
                    }
                }
            }
            System.out.println("");
            leer.close();
        } catch (IOException e) {
            System.err.println("Error lectura");
        }
    }

    public static void recorrerMapInteger(Map M) {
        Iterator it = M.keySet().iterator();
        while (it.hasNext()) {
            Integer clave = (Integer) it.next();
            Object valor = (Object) M.get(clave);
            System.out.println(clave + " " + valor);
        }
    }

    public static void leerFichero(BufferedReader Fl) {
        //metodo que lee un fichero hasta el final
        //hay que declarar el buffered en el main, pero no el String para leer
        try {
            String linea;
            while (Fl.ready()) {
                linea = Fl.readLine();
                System.out.println(linea);
            }
            Fl.close();
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    public static void escribirFichero(BufferedWriter fe) {
        //metodo que escribe en un fichero un solo valor
        //(estructuras repetitivas en el main y cerrarlo al final tambn, y la declaracion del buffered tambien)
        try {
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("dame valor:");
            fe.write(teclado.readLine());
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    public static String ConvertUTF(String txt, int longitud) {
        if (txt.length() > longitud) {
            return txt.substring(0, longitud);
        }
        for (int i = txt.length(); i < longitud; i++) {
            txt = txt + " ";
        }
        return txt;
    }
}
}
