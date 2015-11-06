/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ascensor;

import leer.Leer;

/**
 *
 * @author AlumnoT
 */
public class Ascensor {

    public static void main(String[] args) {

        System.out.println("Bienvenido al ascensor FOUR ROOMS \n---------\n"
                + "El programa gestiona el funcionamiento de un ascensor \n"
                + "Se entra en la Planta Baja(0). Tiene 2 sótanos y 6 plantas sobre rasante \n"
                + "El número máximo de personas es 5 \n---------");

        boolean repetir = true;

        int plantaElegida;
        int cantidadPersonas;
        Ascensor viaje = new Ascensor();

        do {
            //Se solicita PLANTA y Nº PERSONAS
            System.out.println("¿A qué planta quieres ir?");
            plantaElegida = Leer.datoInt();
            System.out.println("¿Cuántas personas soys?");
            cantidadPersonas = Leer.datoInt();

            //Se ejecuta la clase Ascensor con losdatos del usuario
            //Se da la posibilidad de usar nuevamente el ascensor
            System.out.println("\n\n------------\n¿Quiere ir a otra planta? "
                    + "\nPulse: \n1 en caso afirmativo \nCualquier número en caso negativo");
            if (Leer.datoInt() != 1) {
                repetir = false;
                System.out.println("Que tenga usted un buen día");
            }
        } while (repetir);
    }
}
