package monitores;

public class Profesor extends Thread {

    String nombre;
    Bienvenida saludo;

    public Profesor(String nombre, Bienvenida mensajeprofesor) {
        this.nombre = nombre;
        this.saludo
                = mensajeprofesor;
    }

    public void run() {
        System.out.println(nombre + " llego.");

        try {
            Thread.sleep(1000);
            saludo.llegadaProfesor(nombre);

        } catch (InterruptedException ex) {
            System.err.println("Thread profesor interrumpido ");
            System.exit(-1);

        }
    }
}
