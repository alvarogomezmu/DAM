package entregaEjercicios;

public class Equipo 
{
    String nombre;
    Integer cantidad;
    double precio;
    
    public void nuevoEquipo(String nom, Integer cant, double prec)
    {
        nombre=nom;
        cantidad=cant;
        precio=prec;
    }
    
    public void descuentoEquipo() 
    {
        precio = precio * 0.5;
    }
    
    public String getNombre()  
    {
        return nombre;
    }
    
    public Integer getCantidad() 
    {
        return cantidad;
    }
    
    public double getPrecio() 
    {
        return precio;
    }
}
