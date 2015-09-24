package entregaEjercicios;

import java.util.*;

public class ejercicio1 
{
    public static void main(String args[]) 
    {
        // Crear 4 equipos de precio normal (nombre,cantidad,precio)
        Equipo equipo1 = new Equipo();
        equipo1.nuevoEquipo("Dell", 20, 537);
        Equipo equipo2 = new Equipo();
        equipo2.nuevoEquipo("Toshiba", 12, 115);
        Equipo equipo3 = new Equipo();
        equipo3.nuevoEquipo("Lenovo", 10, 224);
        Equipo equipo4 = new Equipo();
        equipo4.nuevoEquipo("Samsung", 6, 480);

        // Crear copia de cada uno de los 4 equipos
        Equipo equipo1Desc = new Equipo();
        equipo1Desc.nuevoEquipo(equipo1.getNombre(), equipo1.getCantidad(), equipo1.getPrecio());
        Equipo equipo2Desc = new Equipo();
        equipo2Desc.nuevoEquipo(equipo2.getNombre(), equipo2.getCantidad(), equipo2.getPrecio());
        Equipo equipo3Desc = new Equipo();
        equipo3Desc.nuevoEquipo(equipo3.getNombre(), equipo3.getCantidad(), equipo3.getPrecio());
        Equipo equipo4Desc = new Equipo();
        equipo4Desc.nuevoEquipo(equipo4.getNombre(), equipo4.getCantidad(), equipo4.getPrecio());

        // Crear ArrayList para equipos sin descuento
        ArrayList<Equipo> pc1 = new ArrayList<Equipo>();
        pc1.add(equipo1);
        pc1.add(equipo2);
        pc1.add(equipo3);
        pc1.add(equipo4);

        // Crear ArrayList para equipos con descuento
        ArrayList<Equipo> pc2 = new ArrayList<Equipo>();
        pc2.add(equipo1Desc);
        pc2.add(equipo2Desc);
        pc2.add(equipo3Desc);
        pc2.add(equipo4Desc);

        // Bucle con el que aplicaremos el descuento
        for (int i = 0; i < pc2.size(); i++) 
        {
            pc1.get(i).descuentoEquipo();
        }

        // Declarar variables que se van a usar para comparar y guardar su precio en la posicion y en el ArrayList
        int menorPc1 = 0;
        double precioMenorPc1 = 2000;
        int menorPc2 = 0;
        double precioMenorPc2 = 2000;
        int mayorPc1 = 0;
        double precioMayorPc1 = 0;
        int mayorPc2 = 0;
        double precioMayorPc2 = 0;

        // Calcular equipo de la primera lista con menor y mayor precio
        for (int i = 0; i < pc1.size(); i++) 
        {
            if (pc1.get(i).getPrecio() > precioMayorPc1) 
            {
                precioMayorPc1 = pc1.get(i).getPrecio();
                mayorPc1 = pc1.indexOf(pc1.get(i));
            }
        }

        // Calcular equipo de la primera lista con menor y mayor precio
        for (int i = 0; i < pc2.size(); i++) 
        {
            if (pc2.get(i).getPrecio() < precioMenorPc2) 
            {
                precioMenorPc2 = pc2.get(i).getPrecio();
                menorPc2 = pc2.indexOf(pc2.get(i));
            }
        }

        // Comparar precios menores de cada lista y mostrar el menor
        if (precioMenorPc1 < precioMenorPc2) 
        {
            System.out.println("Equipo con menor precio: " + pc1.get(menorPc1).getNombre() + " " + pc1.get(menorPc1).getPrecio());
        } 
        else if (precioMenorPc1 > precioMenorPc2) 
        {
            System.out.println("Equipo con menor precio: " + pc2.get(menorPc2).getNombre() + " " + pc2.get(menorPc2).getPrecio());
        }

        // Comparar precios mayores de cada lista y mostrar el mayor
        if (precioMayorPc1 > precioMayorPc2) 
        {
            System.out.println("Equipo con mayor precio: " + pc1.get(mayorPc1).getNombre() + " " + pc1.get(mayorPc1).getPrecio());
        } 
        else if (precioMayorPc1 < precioMayorPc2) 
        {
            System.out.println("Equipo con mayor precio: " + pc2.get(mayorPc2).getNombre() + " " + pc2.get(mayorPc2).getPrecio());
        }
    }
}
