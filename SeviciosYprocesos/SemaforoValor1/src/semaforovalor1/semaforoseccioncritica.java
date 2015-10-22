/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforovalor1;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Alumnot
 */
public class semaforoseccioncritica {

    private static Sumador sumadores[];
    private static Semaphore semaforoprincipal = new Semaphore(1);

    public static void main(String[] args) {
        
        int n_sum=4; // int n_sum=Integer.parseInt(arg[0]);
        
        // Crea Array de procesos Sumadores
        sumadores = new Sumador[n_sum];
        // Inicia los Procesos del Array
        for(int i=0; i<n_sum; i++){
            sumadores[i] = new Sumador(10000,i,semaforoprincipal);
            sumadores[i].start();
        }
        
        //Indica al Programa Principal espere a que todos los Procesos estén muertos
        for(int i=0; i<n_sum;i++){
            try{
                sumadores[i].join();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        
        System.out.println("Acumulador; "+ SemaforoValor1.acumulador);

    }
}
