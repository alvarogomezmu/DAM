/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multihilobox;

/**
 *
 * @author Alvaro Gomez
 * @version 1.0 del 9-10-2015
 */
import java.awt.TextArea;
import java.io.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent.*;
import java.awt.event.ActionListener.*;
import java.awt.event.WindowAdapter.*;

public class ventanas {

    private JFrame ventana = new JFrame();
    private TextArea texto_ventana = new TextArea();

    ventanas(String nombre) {
        ventana.setName(nombre);
        ventana.setTitle(nombre);
        ventana.setSize(400, 400);
        ventana.setVisible(true);
        ventana.add(texto_ventana);
    }

    public void escribeCadena(String cadena) {
        texto_ventana.setText(texto_ventana.getText() + cadena);
    }
}
