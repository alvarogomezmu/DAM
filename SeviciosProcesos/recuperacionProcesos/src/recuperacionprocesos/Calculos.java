/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recuperacionprocesos;

import java.util.Random;

/**
 *
 * @author Alvaro Gomez
 */
public class Calculos {

    public static void main(String[] args) throws InterruptedException {
        final int parametro = 2;
        int numeros = parametro * 100;
        int[] array = new int[numeros];
        Random rand = new Random();

        //Creacion del array. Los numeros estaran comprendidos entre 1000 y 1
        for (int i = 0; i < numeros; i++) {
            array[i] = (int) (rand.nextDouble() * 4 + 1);
        }

        Compara[] compara = new Compara[200];
        Hilo[] hilo = new Hilo[4];

        //Creacion de hilos
        for (int i = 0; i < 4; i++) {
            compara[i] = new Compara();
            hilo[i] = new Hilo(array, compara[i], numeros, parametro);
            numeros = numeros - parametro;
        }

        //Inicio de hilos
        for (int i = 0; i < 4; i++) {
            hilo[i].start();
        }

        for (int i = 0; i < 4; i++) {
            hilo[i].join();
        }

        int[] arraymayores = new int[4];

		//Paso los cuatro mayores a un array para poder
        //compararlos correctamente.
        for (int i = 0; i < 4; i++) {
            arraymayores[i] = compara[i].mayor;
        }

		//Inicializo los valores mayor y menor con la
        //primera posicion del array
        int mayor = arraymayores[0];
        int menor = arraymayores[0];

		//Aprovechando el bucle para mostrar los numeros,
        //se realiza la comparacion
        for (int i = 0; i < 4; i++) {
            System.out.println("Numero: " + arraymayores[i]);
            if (arraymayores[i] > mayor) {
                mayor = arraymayores[i];
            }
            if (arraymayores[i] < menor) {
                menor = arraymayores[i];
            }
        }

        System.out.println("\nEl mayor de los cuatro es: " + mayor);
        System.out.println("El menor de los cuatro es: " + menor);
    }
}
