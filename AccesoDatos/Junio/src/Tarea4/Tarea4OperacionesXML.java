/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea4;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.*;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author Alvaro
 */
public class Tarea4OperacionesXML {

    public static void main(String[] args) {
        // Declaracion del element root
        Element root = new Element("tebeos");

        // Creacion de los hijos de root y se los agregamos
        Element personajes = new Element("personajes");
        Element autores = new Element("autores");

        root.addContent(personajes);
        root.addContent(autores);

        // Crear y agregar los hijos de personajes
        personajes.addContent(new Element("personaje").setAttribute("id", "P001").setAttribute("especie", "humano").setText("Asterix"));
        personajes.addContent(new Element("personaje").setAttribute("id", "P002").setAttribute("especie", "animal").setText("Idefix"));
        personajes.addContent(new Element("personaje").setAttribute("id", "P003").setAttribute("especie", "humano").setText("Lucky Luke"));
        personajes.addContent(new Element("personaje").setAttribute("id", "P004").setAttribute("especie", "animal").setText("Spiderman"));

        // Crear y agregar los hijos de autores
        Element dibujantes = new Element("dibujantes");
        Element guionistas = new Element("guionistas");

        autores.addContent(dibujantes);
        autores.addContent(guionistas);

        // Crear y agregar los hijos de dibujantes
        Element dibujante1 = new Element("dibujante").setAttribute("id", "D001");
        Element dibujante2 = new Element("dibujante").setAttribute("id", "D002");

        dibujantes.addContent(dibujante1);
        dibujantes.addContent(dibujante2);

        // Crear y agregar los hijos de dibujante1 y dibujante2
        dibujante1.addContent(new Element("nombre").setText("Albert Uderzo"));
        dibujante1.addContent(new Element("nacimientoFecha").setText("1927"));
        dibujante1.addContent(new Element("nacimientoPais").setText("Francia"));

        dibujante2.addContent(new Element("nombre").setText("Maurice de Bevere"));
        dibujante2.addContent(new Element("apodo").setText("Morris"));
        dibujante2.addContent(new Element("nacimientoFecha").setText("1923"));
        dibujante2.addContent(new Element("nacimientoPais").setText("Belgica"));
        dibujante2.addContent(new Element("fallecimientoFecha").setText("2001"));

        // Crear y agregar el hijo de guionistas
        Element guionista1 = new Element("guionista").setAttribute("id", "G001");

        guionistas.addContent(guionista1);

        // Crear y agregar los hijos de guionista1
        guionista1.addContent(new Element("nombre").setText("Rene Goscinny"));
        guionista1.addContent(new Element("nacimientoFecha").setText("1926"));
        guionista1.addContent(new Element("nacimientoPais").setText("Francia"));
        guionista1.addContent(new Element("fallecimientoFecha").setText("1977"));

        // Creacion del documento y mostrar por volcado rapido
        Document doc = new Document(root);
        try {
            Herramientas.escribirXML(doc);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Mostrar
        System.out.println(root.getName());
        System.out.println();
        System.out.println(personajes.getName());

        List<Element> listaPersonajes = personajes.getChildren("personaje");

        Iterator iPersonajes = listaPersonajes.iterator();
        while (iPersonajes.hasNext()) {
            Element p = (Element) iPersonajes.next();
            System.out.println(p.getName()
                    + " id: " + p.getAttributeValue("id")
                    + " especie: " + p.getAttributeValue("especie")
                    + ", " + p.getText());
        }

        System.out.println(autores.getName());
        System.out.println(dibujantes.getName());

        System.out.println(dibujante1.getName() + " id: " + dibujante1.getAttributeValue("id"));

        // Guardar hijos de dibujante1
        List<Element> listaDibujante1 = dibujante1.getChildren();

        Iterator iDibujante1 = listaDibujante1.iterator();

        while (iDibujante1.hasNext()) {
            Element n = (Element) iDibujante1.next();
            Element nf = (Element) iDibujante1.next();
            Element np = (Element) iDibujante1.next();
            //Element
                    
            System.out.println(n.getName() + " " + n.getText());
            System.out.println(nf.getName() + " " + nf.getText());
            System.out.println(np.getName() + " " + np.getText());
        }

        System.out.println(dibujante2.getName() + " id: " + dibujante2.getAttributeValue("id"));

        // Guardar hijos de dibujante2
        List<Element> listaDibujante2 = dibujante2.getChildren();

        Iterator iDibujante2 = listaDibujante2.iterator();

        while (iDibujante2.hasNext()) {
            Element n = (Element) iDibujante2.next();
            Element a = (Element) iDibujante2.next();
            Element nf = (Element) iDibujante2.next();
            Element np = (Element) iDibujante2.next();
            Element ff = (Element) iDibujante2.next();

            System.out.println(n.getName() + " " + n.getText());
            System.out.println(a.getName() + " " + a.getText());
            System.out.println(nf.getName() + " " + nf.getText());
            System.out.println(np.getName() + " " + np.getText());
            System.out.println(ff.getName() + " " + ff.getText());
        }

        System.out.println(guionistas.getName());

        System.out.println(guionista1.getName() + " id: " + guionista1.getAttributeValue("id"));

        // Guardar hijos de guionista1
        List<Element> listaGuionista1 = guionista1.getChildren();

        Iterator iGuionista1 = listaGuionista1.iterator();

        while (iDibujante2.hasNext()) {
            Element n = (Element) iGuionista1.next();
            Element a = (Element) iGuionista1.next();
            Element nf = (Element) iGuionista1.next();
            Element np = (Element) iGuionista1.next();
            Element ff = (Element) iGuionista1.next();

            System.out.println(n.getName() + " " + n.getText());
            System.out.println(nf.getName() + " " + nf.getText());
            System.out.println(np.getName() + " " + np.getText());
            System.out.println(ff.getName() + " " + ff.getText());
        }
        /*
         Ejercicio1. Eliminar la etiqueta de la fecha de su fallecimiento, para el guionista G001. 
         */
        System.out.println("\nEjercicio1\n");

        System.out.println("Vamos a proceder a borrar el id del guionista y a comprobar su estado del registro:");

        // Guardar hijos de guionistas
        List<Element> listaGuionistas = guionistas.getChildren();
        // Iterar hijos de guionistas
        Iterator i = listaGuionistas.iterator();

        while (i.hasNext()) {
            Element g = (Element) i.next();

            if (g.getAttributeValue("id").equals("G001")) {
                g.removeChild("fallecimientoFecha");

                // Mostrar
                List<Element> listaHijosGuionista1 = g.getChildren();
                Iterator ite = listaHijosGuionista1.iterator();

                while (ite.hasNext()) {
                    Element h = (Element) ite.next();
                    System.out.println(h.getName() + " " + h.getText());
                }
                System.out.println(g.getName());
            }
        }

        /*
         Ejercicio2. Añadir a la etiqueta autores un atributo llamado famosos que tenga el Valor SI. 
         */
        System.out.println("\nEjercicio2\n");

        System.out.println("Vamos a agregar un atributo a autores:");

        autores.setAttribute("famosos", "si");

        // Mostrar
        System.out.println(autores.getName() + " famosos = " + autores.getAttributeValue("famosos"));

        /*
         Ejercicio3. Modificamos la fecha de nacimiento del dibujante nacido en Belgica.
         */
        System.out.println("\nEjercicio3\n");

        // Crear lista con hijos de dibujantes
        List<Element> listaDibujantes = dibujantes.getChildren("dibujante");
        // Iterar lista con hijos de dibujantes
        Iterator i2 = listaDibujantes.iterator();

        while (i2.hasNext()) {
            Element d = (Element) i2.next();

            if (d.getChild("nacimientoPais").getText().equals("Belgica")) {
                d.getChild("nacimientoFecha").setText("1995");

                // Mostrar
                System.out.println("Vamos a modificar la fecha de nacimiento del dibujante belga.");
                System.out.println("De nombre: Maurice Bevere.");
                System.out.println(d.getChild("nacimientoFecha").getName() + " " + d.getChild("nacimientoFecha").getText());
            }
        }
    }
}
