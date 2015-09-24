package entregaEjercicios2;

public class profesor {

    String nombre;
    int edad;
    String titulacion;

    public void nuevoProfesor(String nom, int e, String titul) 
    {
        nombre = nom;
        edad = e;
        titulacion = titul;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public int getEdad() 
    {
        return edad;
    }

    public String getTitulacion() 
    {
        return titulacion;
    }
}
