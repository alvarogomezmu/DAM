/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garaje;

/**
 *
 * @author AlumnoT
 */
public class ActividadMecanica {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Garaje garaje = new Garaje();
        Coche cochecito = new Coche("Fiat", "Punto");
        Coche cochazo = new Coche("Mazda", "6");

        System.out.println(garaje.aceptarCoche(cochecito, "Rotura de luna"));
        System.out.println(garaje.aceptarCoche(cochecito, "Calibrar ejes"));
        garaje.devolverCoche();
        System.out.println(garaje.aceptarCoche(cochazo, "Cambio de aceite"));
        cochazo.setAceite(10);
        garaje.devolverCoche();
        System.out.println(garaje.aceptarCoche(cochecito, "Chapa y pintura"));
        garaje.devolverCoche();
        System.out.println(garaje.aceptarCoche(cochazo, "Instalar GPS"));
        garaje.devolverCoche();

        Motor m = new Motor(75);
        System.out.println(cochecito);

        Motor m2 = new Motor(140);
        System.out.println(cochazo);
    }

}
