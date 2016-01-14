/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import java.io.IOException;
import org.jdom2.Document;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author AlumnoT
 */
public class Consulta {

    public static void main(String args[]) {
        // Abrimos el fichero
        Document doc = null;
        try {
            doc = new SAXBuilder().build("C:\\Users\\AlumnoT\\Desktop\\recuperacionAD\\src\\Ejercicio3\\arbol.xml");
        } catch (JDOMException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println("1. Mostrar el titulo de los CD cuyo precio esta comprendido entre 8 y 12€");
        Metodos.xpath(doc, "//CD[precio>8 and precio<12]/titulo");
        
        System.out.println("\n2. CD que tienen mas de una discografica"); 
        Metodos.xpath(doc, "//CD[count(discografica)>=2]/titulo");
        
        System.out.println("\n3. Mostrar cd que tienen su pais en el mismo que el del cd publicado el año 1987");
        Metodos.xpath(doc, "//CD[pais=//CD[Ano=1987]/pais]/titulo");
    }
}
