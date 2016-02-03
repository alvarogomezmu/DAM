package monitores;

public class ComiendoClase {

    public static void main(String[] args) {
        //Objeto compartido
        Bienvenida b = new Bienvenida();

        String nombrealumno;
        int n_alumnos = 10; //int n_alumnos = Integer.parseInt(args[0]);

        for (int i = 0; i < n_alumnos; i++) {

            nombrealumno = "alumno-" + i;
            new Alumno(nombrealumno, b).start();
        }
        Profesor profesor = new Profesor("Dildo Verde", b);
        profesor.start();
    }
}
