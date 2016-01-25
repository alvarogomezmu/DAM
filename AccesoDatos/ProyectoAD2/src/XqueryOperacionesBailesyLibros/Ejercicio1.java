package XqueryOperacionesBailesyLibros;

import Herramientas.Herramientas;
import org.xmldb.api.base.Collection;

/**
 *
 * @author AlumnoT
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Añadir un nuevo atributo en los libros  publicados después de 1999, cambio:”siglo”
        Collection col = Herramientas.connectExistDB("prueba", "admin");
        Herramientas.consultExistDB(col, ("for $nombre in //libro/autor\n"
                + "return update rename $nombre as 'author'"));

    }
}