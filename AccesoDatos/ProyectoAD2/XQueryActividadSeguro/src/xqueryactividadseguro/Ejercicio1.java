package xqueryactividadseguro;

import org.xmldb.api.base.Collection;

/**
 *
 * @author AlumnoT
 */
public class Ejercicio1 {
    public static void main(String args[]) {
        // Obtener los asegurados de la primera poliza

        Collection col = Herramientas.connectExistDB("prueba2", "admin");
        Herramientas.consultExistDB(col, "for $a in //poliza[1]/asegurado\n"
                + "return <newaseg>"
                + "{<nombre>{data($a/@nombre)}</nombre> |"
                + "<apellidos>{data($a/@apellidos)}</apellidos>}"
                + "</newaseg>");
    }
}