/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoad2;

import Herramientas.Herramientas;
import static java.awt.PageAttributes.MediaType.C;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import org.xmldb.api.base.Collection;

/**
 *
 * @author AlumnoT
 */
public class ProyectoAD2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // LLamada a el metodo connectExistDB
        Collection col = Herramientas.connectExistDB("prueba", "admin");

        Herramientas.operationExistDB(col, "let $b:= //libro/titulo\n"
                + "return $b");
        
        

    }
}
