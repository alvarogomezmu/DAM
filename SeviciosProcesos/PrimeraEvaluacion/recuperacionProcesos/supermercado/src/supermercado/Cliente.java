/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;

/**
 *
 * @author Alvaro
 */
public class Cliente extends Thread {

    // Variables del cliente
    int numero;
    int pago;
    int cajaAsignada;
    Caja caja;

    /**
     * Constructor de cliente
     *
     * @param n Numero de cliente
     * @param c Clase caja
     */
    public Cliente(int n, Caja c) {
        this.numero = n;
        this.caja = c;
    }

    public void run() {
        // Le asignamos un numero de caja
        cajaAsignada = caja.asignarCaja();

        // Calculamos el pago
        pago = Metodos.generarPago();

        try {
            // Realizamos el pago
            caja.pagar(numero, cajaAsignada, pago);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
