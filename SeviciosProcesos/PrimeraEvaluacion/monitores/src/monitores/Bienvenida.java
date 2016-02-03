package monitores;

public class Bienvenida {

    boolean clase_comenzada;
    
    public Bienvenida() {
        this.clase_comenzada = false;
    }
//hasta que el profe no salude no empieza la clase
//por lo que los alumnos esperan con un wait

    public synchronized void saludarProfesor(String nombreA) {

        try {
            while (clase_comenzada == false) {
                wait();
            }
            System.out.println("Soy " + nombreA + ". Buenos dias criaturitas del señor");

        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
    
//Cuando el profe saluda avisa a los alumnos con notifyall de su  llegada
    public synchronized void llegadaProfesor(String nombre) {
        System.out.println("Buenos dias criaturitas del señor. Soy el profe " + nombre);
        this.clase_comenzada = true;
        notifyAll();
    }
}
