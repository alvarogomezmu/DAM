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
public class Coche extends Motor {

    private Motor motor;
    private String marca;
    private String modelo;
    private double gastos;

    public Coche() {
    }

    public Coche(String marca, String modelo) {
        super(cv);
        this.marca = marca;
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecioAverias() {
        return gastos;
    }

    public void acumularAveria(double importe) {
        gastos = gastos + importe;
        System.out.println("Has gastado " + gastos + "€ en averías");
    }

    @Override
    public String toString() {
        return marca + " " + modelo + ", " + getCv() + "cv";
    }
}
