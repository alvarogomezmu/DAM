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

public class testingxpath {

    public static void main(String args[]) {

        Document doc = null;
        try {
            doc = new SAXBuilder().build("C:\\petra\\cole.xml");
        } catch (JDOMException ex) {
            Logger.getLogger(testingxpath.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(testingxpath.class.getName()).log(Level.SEVERE, null, ex);
        }

        XPathExpression<Element> xpath = XPathFactory.instance().compile("/cole/asignatura/nombre", Filters.element());
        List<Element> elemento = xpath.evaluate(doc);
        Iterator it = elemento.iterator();

        while (it.hasNext()) {
            Element at = (Element) it.next();
            System.out.println(at.getName() + ": " + at.getValue());
        }
    }
}
