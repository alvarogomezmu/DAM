/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoad2;

import Herramientas.Herramientas;
import org.xmldb.api.base.Collection;

/**
 *
 * @author AlumnoT
 */
public class ProyectoAD2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Añadir un título un atributo llamado traducción=español
        Collection col = Herramientas.connectExistDB("prueba", "admin");
        Herramientas.consultExistDB(col, ("for $nombre in //libro/autor\n"
                + "return update rename $nombre as 'author'"));

    }
}
