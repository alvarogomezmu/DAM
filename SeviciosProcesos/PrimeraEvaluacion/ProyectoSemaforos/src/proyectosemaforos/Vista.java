package proyectosemaforos;

import java.awt.TextArea;
import javax.swing.JFrame;

/**
 *
 * @author Alvaro Gomez
 */
public class Vista {

    private JFrame ventana = new JFrame();
    public static TextArea texto_ventana = new TextArea();

    /**
     * Creacion de ventana de Windows
     *
     * @param nombre Nombre de la ventana
     */
    Vista(String nombre) {
        ventana.setName(nombre);
        ventana.setTitle(nombre);
        ventana.setSize(400, 800);
        ventana.setVisible(true);
        ventana.add(texto_ventana);
    }
}
