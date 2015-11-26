/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoxpath;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AlumnoT
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Document doc = null;

        try {
            doc = new SAXBuilder().build("C:\\petra\\ciclos2.xml");
        } catch (JDOMException ex) {
            Logger.getLogger(Abreviado2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Abreviado2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
