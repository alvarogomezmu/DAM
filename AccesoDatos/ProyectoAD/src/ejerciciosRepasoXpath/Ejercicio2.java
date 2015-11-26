/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosRepasoXpath;

import Herramientas.herramientas;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom2.Document;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import xpath.Abreviado2;

/**
 *
 * @author AlumnoT
 */
public class Ejercicio2 {

    public static void main(String args[]) {

        Document doc = null;

        try {
            doc = new SAXBuilder().build("C:\\petra\\repasoXpath2.xml");
        } catch (JDOMException ex) {
            Logger.getLogger(Abreviado2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Abreviado2.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.print("\nApartado 1. 1.	Mostrar el nombre de las películas en Ingles que han sido dirigidas por directores cuyo país de nacimiento sea EEUU:\n");
        herramientas.xPath(doc, "//persona[nacimiento/@fecha=//persona[@id=//puesto[@cargo='director']/@id]/nacimiento/@fecha]/nombre");

        System.out.print("\nApartado 2. 2.	Mostrar el nombre de los compositores que han participado en las películas que ha dirigido el director que nació en 1970:\n");
        herramientas.xPath(doc, "//persona/nacimiento[@fecha!=//persona[@id=//puesto[@cargo='recepcionista']/@id]/nacimiento/@fecha]/../madre");

        System.out.print("\nApartado 3. 3.	Mostrar el título de las películas en castellano que se hayan estrenado antes que la película con titulo en Ingles “Prestige”:\n");
        //herramientas.xPath(doc,"//persona[@id!=//puesto=camarera]");

        System.out.print("\nApartado 4. 4.	Mostrar l director de las películas cuyo estreno está comprendido entre 1990 y 2011 y cuya fecha de nacimiento sea anterior a la del director de “uno de los nuestros”:\n");
        //herramientas.xPath(doc,"//persona[@id!=//puesto=camarera]");
    }
}
