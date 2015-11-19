/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xpath;

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
            doc = new SAXBuilder().build("C:\\petra\\persona.xml");
        } catch (JDOMException ex) {
            Logger.getLogger(Abreviado2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Abreviado2.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.print("1.-Mostrar el root del empleado con nombre González \n");

        XPathExpression<Element> xpath1 = XPathFactory.instance().compile("/child::personas/descendant::nombre", Filters.element());
        List<Element> elemento1 = xpath1.evaluate(doc);
        Iterator it1 = elemento1.iterator();

        while (it1.hasNext()) {
            Element at = (Element) it1.next();
            System.out.println(at.getName() + ": " + at.getValue());
        }

        System.out.print("2.-Obtener todos los elementos nombre de nuestra empresa. En este caso nombres de departamentos y empleados. \n");

        System.out.print("3.-Obtener la información del empleado cuyo root sea distinto a 10, 93, 44, 12. \n");

        System.out.print("4.-Mostrar el teléfono del departamento finananzas. \n");

        System.out.print("5.-Mostrar los nombres de los empleados menos el nombre del empleado cuyo salario es 1000. \n");

        System.out.print("6.-Obtener el nombre del departamento donde trabaja el empleado cuyo salario es 1000. \n");

    }
}
