/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.io.IOException;
import java.util.ArrayList;
import org.jdom2.Document;
import org.jdom2.Element;

/**
 *
 * @author Alvaro
 */
public class EscribirEXML {
    public static void main(String args[]){
        // Creamos el elemento root
        Element root = new Element("alumnos");

        // Creamos los hijos de root
        ArrayList<Element> hijosRoot = new ArrayList<Element>();
        hijosRoot.add(new Element("alumno").setAttribute("id", "e01"));
        hijosRoot.add(new Element("alumno").setAttribute("id", "e02"));
        hijosRoot.add(new Element("alumno").setAttribute("id", "e03").setAttribute("becado", "si"));

    }
}
