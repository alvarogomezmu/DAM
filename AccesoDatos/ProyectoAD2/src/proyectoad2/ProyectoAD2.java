/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoad2;

import Herramientas.Herramientas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
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
        Connection c = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:C:\\sqlite3\\ejemplo.db");
            System.out.println("BD abierta con exito. \nTarta de fresa en proceso...\n");
            
            Statement stmt = c.createStatement();
            ResultSet rs= stmt.executeQuery("Select * from eje1;");
            while (rs.next()){
                int id=rs.getInt(1);
                String nom=rs.getString(2);
                System.out.println("El id es: " +id);
                System.out.println("El nombre es: " +nom);
            }
        } catch (Exception e) {

            e.printStackTrace();
            System.out.println("No funca... :C");
        }

    }

}
