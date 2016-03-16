/*
Disena e implementa un programa multihilo que sea capaz de crear 4 hilos que sean 
capaces de escribir un array de 10 enteros, segun el siguiente criterio.

Cada hilo generara 50 numeros aleatorios entre 0 y 99, y usaran el Array como contador en funcion del rango del numero aleatorio obtenido
*/
package examenpsyp;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Alvaro Gomez
 */
public class Principal {

    // Array de 10 enteros
    public static int enteros[] = new int[10];
    // Array de semaforos
    public static Semaphore semaforos[] = new Semaphore[10];
    // Contador de veces sumados
    public static int count = 0;

    /**
     * Metodo main
     *
     * @param args
     */
    public static void main(String args[]) {

        // Inicializar semaforos
        Metodos.inicializarSemaforos();

        // Creamos y lanzamos los 4 hilos
        for (int i = 0; i < 4; i++) {
            Sumador su = new Sumador(i);
            su.start();
        }
    }
}
