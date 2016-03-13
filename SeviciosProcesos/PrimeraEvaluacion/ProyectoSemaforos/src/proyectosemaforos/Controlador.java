package proyectosemaforos;

import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Alvaro Gomez
 */
public class Controlador {
    
    // Variable vista
    Vista objVista = new Vista(Vista.texto_ventana.getText() + "Ascensor");

    // Variables de modelo de datos
    // Numero maximo de personas que permite el ascensor
    public static int capacidad = 6;
    // Numero de pisos
    public static int pisos = 4;
    // Piso actual en la que se encuentra el ascensor
    public static int pisoActual = 0;
    // Numero total de personas que se crearan
    public static int totalPersonas = 11;
    // Contador de personas para asignarles numeros
    public static int countPersonas = 0;
    // Boolean para controlar la direccion del ascensor
    public static boolean subiendo = true;
    // Semaforo para cada piso
    public static Semaphore[] semaforoPiso = new Semaphore[pisos];
    // Semaforo para el ascensor
    public static Semaphore semaforoAscensor;
    // ArrayList de personas esperando al ascensor
    public static ArrayList<Persona> personasEsperando = new ArrayList<Persona>();
    // ArrayList de personas dentro del ascensor
    public static ArrayList<Persona> personasAscensor = new ArrayList<Persona>();
    // Array de personas con el numero total de personas que se crearan
    public static Persona per[] = new Persona[totalPersonas];
    // Boolean que controlara el bucle del programa
    public static boolean funcionando = true;

    /**
     * Declaramos el constructor
     */
    public Controlador() {
        
        // Inicializamos los semaforos de las pisos y el del ascensor
        Metodos.inicializarSemaforos();

        while (funcionando) {
            // Cambiamos el piso del ascensor
            Metodos.cambiarPiso();

            // Abrimos semaforo del piso actual
            semaforoPiso[pisoActual].release();

            // Generamos un numero aleatorio de personas nuevas
            int personasNuevas = Metodos.nuevasPersonasAleatorio();
            // Las creamos
            //System.out.println("\nHan llegado " + personasNuevas + " personas");
            Vista.texto_ventana.setText(Vista.texto_ventana.getText() + "\nHan llegado " + personasNuevas + " personas");
            for (int i = 0; i < personasNuevas; i++) {
                Metodos.nuevaPersona();
            }

            // Dormimos al ascensor varios segundos
            try {
                sleep(2000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            // Cerramos el semaforo del piso actual
            try {
                semaforoPiso[pisoActual].acquire();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            //System.out.println("\nEl ascensor lleva actualmente " + personasAscensor.size() + " personas");
            Vista.texto_ventana.setText(Vista.texto_ventana.getText() + "\nEl ascensor lleva actualmente " + personasAscensor.size() + " personas\n");


            // Dormimos al ascensor varios segundos
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            // Comprobamos si el programa ha finalizado
            Metodos.comprobarFinPrograma();
        }
    }
}
