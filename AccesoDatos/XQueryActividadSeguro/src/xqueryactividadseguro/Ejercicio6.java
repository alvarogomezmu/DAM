package xqueryactividadseguro;

import org.xmldb.api.base.Collection;

/**
 *
 * @author Alvaro Gomez
 */
public class Ejercicio6 {

    public static void main(String args[]) {
        // Obtener las garantías con un importe 10000

        Collection col = Herramientas.connectExistDB("prueba2", "admin");
        Herramientas.consultExistDB(col, "for $a in //garantia\n"
                + "where $a/capital = 10000\n"
                + "return $a");
    }
}
