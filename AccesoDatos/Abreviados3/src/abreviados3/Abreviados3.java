/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abreviados3;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom2.Document;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author AlumnoT
 */
public class Abreviados3 {

    /**
     * @param args the command line arguments
     */
     public static void main(String args[]) throws IOException {
        Document doc = null;

        try {
            doc = new SAXBuilder().build("C:\\petra\\persona.xml");
        } catch (JDOMException ex) {
            Logger.getLogger(Abreviado2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Abreviado2.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
}