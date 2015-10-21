/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforovalor1;

import java.util.concurrent.Semaphore;

public class SemaforoValor1 {

    public static int acumulador = 0; // inicializa el acumulador a 0

}

class Sumador extends Thread {

    private int cuenta;
    private Semaphore semaforo;

    // Constructor
    Sumador(int hasta, int id, Semaphore semaforo) {
        this.cuenta = hasta;
        this.semaforo = semaforo;
    }

    // Metodo que incrementa el acumulador
    public void sumar() {
        SemaforoValor1.acumulador++;
    }

    public void run() {
        for (int i = 0; i < cuenta; i++) {
            try {
                semaforo.acquire(); // Señal Wait del Semaforo. Disminuye en 1 el semaforo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sumar();
            semaforo.release(); // Señal Signal del semaforo. Incrementa en 1 el semaforo
        }
    }
}
