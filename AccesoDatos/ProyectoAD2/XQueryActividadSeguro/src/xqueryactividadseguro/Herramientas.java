/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xqueryactividadseguro;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.xmldb.api.DatabaseManager;
import org.xmldb.api.base.Collection;
import org.xmldb.api.base.Database;
import org.xmldb.api.base.Resource;
import org.xmldb.api.base.ResourceIterator;
import org.xmldb.api.base.ResourceSet;
import org.xmldb.api.base.XMLDBException;
import org.xmldb.api.modules.XPathQueryService;

/**
 *
 * @author AlumnoT
 */
public class Herramientas {

    // Metodo para conectar
    public static void connectExistDB(String uri, String user) {
        String Driver = "org.exist.xmldb.DatabaseImpl";
        String URI = "xmldb:exist://localhost:8080/exist/xmlrpc/db/" + uri;
        String username = user;
        String password = "root";

        //Proceso de conexion
        //Crea el canal para conectarsev
        try {
            Class C1 = Class.forName(Driver);
            Database database = (Database) C1.newInstance();
            DatabaseManager.registerDatabase(database);
            System.out.println("Inicializado el Driver");
        } catch (Exception e) {
            System.out.println("Error al inicializar la Base de Datos");
        }

        Collection col = null;
        try {
            col = DatabaseManager.getCollection(URI, username, password);
        } catch (Exception ex) {

        }
        if (col == null) {
            System.out.println("La coleecion no existe");
        } else {
            System.out.println("Te has conectado");
        }
        try {
            XPathQueryService s = (XPathQueryService) col.getService("XPathQueryService", "1.0");

            ResourceSet result = s.query("for $t in //titulo return $t");
            ResourceIterator i = result.getIterator();
            while (i.hasMoreResources()) {
                Resource r = i.nextResource();
                System.out.println(r.getContent());
            }
        } catch (XMLDBException ex) {
            Logger.getLogger(Herramientas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Metodo para consultar    
    public static void consultaExistDB() {
        
    }
}
