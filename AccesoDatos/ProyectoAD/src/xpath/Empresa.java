/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xpath;

import Herramientas.herramientas;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.filter.Filters;
import org.jdom2.input.SAXBuilder;
import org.jdom2.xpath.XPathExpression;
import org.jdom2.xpath.XPathFactory;

public class Empresa {

    public static void main(String args[]) throws IOException {
       Document doc = null;

        try {
            doc = new SAXBuilder().build("C:\\petra\\empresa.xml");
        } catch (JDOMException ex) {
            Logger.getLogger(Abreviado2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Abreviado2.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.print("1.-Mostrar el root del empleado con nombre González \n");
        herramientas.xPath(doc,"//ancestor::empleado[child::nombre='Gonzalez']/child::rut");
       

        System.out.print("2.-Obtener todos los elementos nombre de nuestra empresa. En este caso nombres de departamentos y empleados. \n");
        herramientas.xPath(doc,"/child::Empresa/child::departamento/descendant::nombre");
        
        System.out.print("3.-Obtener la información del empleado cuyo root sea distinto a 10, 93, 44, 12. \n");
        herramientas.xPath(doc,"/descendant::empleado[child::rut != '10934412']");
        
        System.out.print("4.-Mostrar el teléfono del departamento finananzas. \n");
        herramientas.xPath(doc,"/child::Empresa/child::departamento[child::nombre='Finanzas']");
        
        System.out.print("5.-Mostrar los nombres de los empleados menos el nombre del empleado cuyo salario es 1000. \n");
        herramientas.xPath(doc,"/descendant::empleado[attribute::salario!=1000000]/child::nombre");
        
        System.out.print("6.-Obtener el nombre del departamento donde trabaja el empleado cuyo salario es 1000. \n");
        herramientas.xPath(doc,"/child::Empresa/child::departamento/child::empleado[attribute::salario='1000000']/parent::departamento/child::nombre");

    }
}
