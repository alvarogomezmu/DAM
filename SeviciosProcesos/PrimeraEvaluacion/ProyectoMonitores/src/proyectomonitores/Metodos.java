package proyectomonitores;

import java.util.Random;

/**
 *
 * @author Alvaro Gomez
 */
public class Metodos {

    /**
     * Metodo para actualizar el panel de informacion
     */
    public static void actualizarInfo() {
        Ventana.info.setText("Clientes actuales: " + (ModernSupermarket.clientes - ModernSupermarket.clientesAtendidos)
                + "\nCajas activas: " + ModernSupermarket.cajas + "\nRecaudacion total: " + ModernSupermarket.recaudacion);
    }

    /**
     * Metodo para inicializar los estados de las cajas
     */
    public static void inicializarCajas() {
        for (int i = 0; i < ModernSupermarket.cajas; i++) {
            ModernSupermarket.estadoCaja[i] = true;
        }
    }

    /**
     * Metodo para crear un numero aleatorio para los clientes
     *
     * @return Numero generado
     */
    public static int calcularClientes() {
        Random rand = new Random();
        int num = rand.nextInt(50) + 50;
        return num;
    }

    /**
     * Metodo para crear un numero aleatorio entre 2 y 6 para las cajas
     *
     * @return Numero generado
     */
    public static int calcularCajas() {
        Random rand = new Random();
        int num = rand.nextInt(4) + 2;
        return num;
    }

    /**
     * Metodo para crear un numero aleatorio entre 1 y 100 para el pago
     *
     * @return Numero generado
     */
    public static int generarPago() {
        Random rand = new Random();
        int num = rand.nextInt(100) + 1;
        return num;
    }

    /**
     * Metodo para crear un numero aleatorio entre 1000 y el numero pasado para
     * el sleep al pagar
     *
     * @param n Integer que aumentara el tiempo del sleep
     * @return Numero generado
     */
    public static int generarDormir(int n) {
        Random rand = new Random();
        int num = rand.nextInt(n) + 1000;
        return num;
    }
}
