package proyectomonitores;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author Alvaro Gomez
 */
public class Ventana {

    // Ventana
    private JFrame ventana = new JFrame();
    // Array de paneles para cada caja
    public static ArrayList<JTextArea> texto_ventana;
    // Panel de informacion 
    public static JTextArea info = new JTextArea();
    // Nombre de la ventana
    private String nombre = "ModernSuperMarket";

    /**
     * Constructor de ventana de Windows
     *
     * @param nombre Nombre de la ventana
     */
    Ventana(int num) {
        // Asignacion de valores de la ventana
        ventana.setName(nombre);
        ventana.setTitle(nombre);
        ventana.setSize((200 * num), 800); // Segun el numero de cajas varia el tamano
        ventana.setVisible(true);

        // Inicializacion del array de paneles
        texto_ventana = new ArrayList<JTextArea>();

        for (int i = 0; i < (num + 1); i++) {

            // Inicializacion de cada panel del array
            texto_ventana.add(i, new JTextArea());

            // Asignacion de valores a cada panel
            switch (i) {
                case 0:
                    texto_ventana.get(i).setBounds(0, 0, 200, 700);

                    // Panel de informacion
                    info.setBounds(0, 700, (200 * num), 100);
                    ventana.add(info);
                    break;
                case 1:
                    texto_ventana.get(i).setBounds(200, 0, 200, 700);
                    break;
                case 2:
                    texto_ventana.get(i).setBounds(400, 0, 200, 700);
                    break;
                case 3:
                    texto_ventana.get(i).setBounds(600, 0, 200, 700);

                    break;
                case 4:
                    texto_ventana.get(i).setBounds(800, 0, 200, 700);

                    break;
                case 5:
                    texto_ventana.get(i).setBounds(1000, 0, 200, 700);

                    break;
                case 6:
                    texto_ventana.get(i).setBounds(0, 0, 0, 0);

                    break;
            }
            // Anadimos en cada vuelta del bucle el panel correspondiente a la ventana
            ventana.add(texto_ventana.get(i));
        }
    }
}
