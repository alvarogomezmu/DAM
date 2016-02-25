/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AlumnoT
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        try {
            /*1. (usar usu1) Vamos a crear una tabla personas, concretamente DNI, nombre, edad, y hay que
            crear un procedimiento que nos devuelva el número de personas que tenemos registradas y la media
            de la edad.  Concretamente nos mostrará la media de la edad si es mayor a 25.
            
            DNI, nombre, edad
            1, Pepe, 10
            2, Juan, 15
            3, Ana, 30*/
            
            Connection conn = PackHerramientas.Herramientas.conectar("usu1", "root");
            
            CallableStatement cs;
            
            cs = conn.prepareCall("{call num_pers_media(?, ?)}");
            
            cs.registerOutParameter(1, Types.INTEGER);
            cs.registerOutParameter(2, Types.FLOAT);
            
            cs.executeUpdate();
            
            System.out.println("Contador: " + cs.getInt(1));
            float media;
            if ((media = (float) cs.getFloat(2)) < 25) {
                System.out.println("Media: " + media);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Ejercicio1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Ejercicio1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Ejercicio1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Ejercicio1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
