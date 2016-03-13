package proyectosemaforos;

import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alvaro Gomez
 */
public class Metodos {

    /**
     * Metodo para crear una nueva persona
     */
    public static void nuevaPersona() {
        // Piso donde cogera el ascensor
        int pInicio = Metodos.pisoAleatorio();
        // Piso donde se bajara
        int pFin = Metodos.pisoAleatorio();

        // Si las pisos son las mismas, se cambia la de fin hasta que sea distinta
        while (pInicio == pFin) {
            pFin = Metodos.pisoAleatorio();
        }

        // Se crea la persona y se le anaden las pisos de inicio y fin, y su numero
        Persona p = new Persona(pInicio, pFin, Controlador.countPersonas);

        // Se anade la persona al array de personas esperando
        Controlador.personasEsperando.add(p);

        //System.out.println("\nPersona " + numero + " va del piso " + pisoInicio + " al " + pisoFin);
        Vista.texto_ventana.setText(Vista.texto_ventana.getText() + "\nPersona " + Controlador.countPersonas + " va del piso " + pInicio + " al " + pFin);

        // Lanzamos a la persona
        Controlador.per[Controlador.countPersonas] = p;
        Controlador.per[Controlador.countPersonas].start();

        // Aumentamos el contador
        Controlador.countPersonas++;
    }

    /**
     * Metodo que inicializa los semaforos
     */
    public static void inicializarSemaforos() {
        Controlador.semaforoAscensor = new Semaphore(5);

        for (int i = 0; i < Controlador.pisos; i++) {
            Controlador.semaforoPiso[i] = new Semaphore(1);
            try {
                Controlador.semaforoPiso[i].acquire();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    /**
     * Metodo para cambiar de piso el ascensor
     */
    public static void cambiarPiso() {
        if (Controlador.subiendo) {
            // Se incrementa el piso
            Controlador.pisoActual++;
            // Si llega al último piso, cambiamos la direccion para que baje
            if (Controlador.pisoActual == (Controlador.pisos - 1)) {
                Controlador.subiendo = false;
            }
        } else if (!Controlador.subiendo) {
            // Se decrementa el piso
            Controlador.pisoActual--;
            // Si llega al primer piso, cambiamos la dirección para que suba
            if (Controlador.pisoActual == 0) {
                Controlador.subiendo = true;
            }
        }

        //System.out.println("\nEl ascensor ha llegado a al piso " + Controlador.pisoActual);
        Vista.texto_ventana.setText(Vista.texto_ventana.getText() + "\nEl ascensor ha llegado al piso " + Controlador.pisoActual);
    }

    /**
     * Metodo para controlar la region critica de la entrada del ascensor
     *
     * @param p Persona que entra el ascensor
     */
    public static void entrarAscensor(Persona p) {

        while (p.pisoInicio != Controlador.pisoActual) {
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        // Cierra el semaforo del piso
        // Debe estar abierto previamente, sino el hilo esperara a que se abra
        try {
            Controlador.semaforoPiso[p.pisoInicio].acquire();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        // Abre el ascensor del piso
        Controlador.semaforoPiso[p.pisoInicio].release();

        // Cerramos el semaforo del ascensor
        try {
            Controlador.semaforoAscensor.acquire();
            //System.out.println("\nPersona " + p.numero + " entra al ascensor");
            Vista.texto_ventana.setText(Vista.texto_ventana.getText() + "\nPersona " + p.numero + " entra al ascensor");
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        // Quitamos a la persona del array de personas esperando
        Controlador.personasEsperando.remove(p);
        // Anadimos a la persona al array de personas dentro del ascensor
        Controlador.personasAscensor.add(p);
    }

    /**
     * Metodo para controlar la region critica de la salida del ascensor
     *
     * @param p Persona que sale del ascensor
     */
    public static void salirAscensor(Persona p) {

        while (p.pisoFin != Controlador.pisoActual) {
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        // Cierra el semaforo del  piso
        // Debe estar abierto previamente, sino el hilo esperara a que se abra
        try {
            Controlador.semaforoPiso[p.pisoFin].acquire();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        // Abre el semaforo del piso
        Controlador.semaforoPiso[p.pisoFin].release();

        // Quitamos a la persona del array de personas dentro del ascensor
        Controlador.personasAscensor.remove(p);

        // Abrimos el semaforo del ascensor
        Controlador.semaforoAscensor.release();

        //System.out.println("\nPersona " + p.numero + " sale del ascensor");
        Vista.texto_ventana.setText(Vista.texto_ventana.getText() + "\nPersona " + p.numero + " sale del ascensor");
    }

    /**
     * Metodo para generar un numero aleatorio para el piso
     *
     * @return Numero aleatorio generado entre 0 y 4
     */
    public static int pisoAleatorio() {
        Random rand = new Random();

        int piso = rand.nextInt(4);;

        return piso;
    }

    /**
     * Metodo para generar un numero aleatorio para el Sleep() de las personas
     *
     * @return Numero aleatorio generado entre 1000 y 5000
     */
    public static int sleepAleatorio() {
        Random rand = new Random();

        int sl = rand.nextInt(2000) + 1000;

        return sl;
    }

    /**
     * Metodo para generar un numero aleatorio para las personas que llegan en
     * cada oleada
     *
     * @return Numero aleatorio generado entre 1 y 4
     */
    public static int nuevasPersonasAleatorio() {
        Random rand = new Random();

        int np = rand.nextInt(4) + 1;

        return np;
    }

    /**
     * Metodo que comprueba si se ha alcanzado el numero total de personas
     * creadas
     */
    public static void comprobarFinPrograma() {
        if (Controlador.countPersonas == Controlador.totalPersonas) {
            Controlador.funcionando = false;
        }
    }
}
