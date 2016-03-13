package proyectosemaforos;

/**
 * Clase Persona con metodos get y set y su ejecucion
 *
 * @author Alvaro Gomez
 */
public class Persona extends Thread {

    int pisoInicio;
    int pisoFin;
    int numero;

    /**
     * Crea un hilo hijo con el numero de hilo dado por el padre
     *
     * @param nHilo Numero de hilo dado por el padre
     */
    Persona(int pi, int pf, int nu) {
        this.pisoInicio = pi;
        this.pisoFin = pf;
        this.numero = nu;
    }

    public void run() {
        Metodos.entrarAscensor(this);
        Metodos.salirAscensor(this);
    }
}
