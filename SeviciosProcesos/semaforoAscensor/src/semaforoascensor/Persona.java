/*
 En la clase Persona incluiremos los métodos set y get
 */
package semaforoascensor;

public class Persona extends Thread{

    int plantaInicio;
    int plantaFin;
    int peso;
    int numero;

    Persona(int pinic, int pfin, int nu, int kg) {
        this.plantaInicio = pinic;
        this.plantaFin = pfin;
        this.peso = kg;
        this.numero = nu;
    }

    public void run() {
        System.out.println("Persona" + numero + "va del piso" + plantaInicio + "al" + plantaFin);

        metodos.entrarAscensor(this);
        metodos.salirAscensor(this);
    }

    public void setPlantaInicio(int pinic) {
        plantaInicio = pinic;
    }

    public void setPlantaFin(int pfin) {
        plantaFin = pfin;
    }

    public void setPeso(int kg) {
        peso = kg;
    }

    public int getPlantaInicio() {
        return plantaInicio;
    }

    public int getPlantaFin() {
        return plantaFin;
    }

    public int getPeso() {
        return peso;
    }

    public int getNumero() {
        return numero;
    }
}
