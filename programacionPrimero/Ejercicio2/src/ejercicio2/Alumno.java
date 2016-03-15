package ejercicio2;
/*
Clase que hereda de la clase anterior Persona
    Clase Alumno
        Atributos propios:
            grupo
            horario (MAÑANA O TARDE)(tipo enumerado)
        Metodos: deberemos intentar aprovechar la potencialidad de la herencia en la programacion orientada a objetos.
            Constructor: para dar un valor inicial unicamente a los atributos comunes.
            Constructur: para dar un valor iicial a los atributos comunes y a los atributos propios de la clase
            obtenerAlumno: para imprimir por pantalla los datos del alumno.
                Persona: 3 JuanCarlos Garcia 18-mar-2015 al TARDE
            ponGrupo: para permitir modificar el contenido de los atributos grupo y horario.
            ponGrupo (sobrecargado): para permitir modificar unicamente el contenido del atributo grupo
            numDias: para obtener el numero de dias de antiguedad del alumno en el centro. El metodo no debe imprimir los dias, unicamente devolver el valor.
*/
import java.util.*;
import java.io.*;

/**
 *
 * @author Alvaro Gomez
 */

public class Alumno extends Persona
{
    String grupo, horario;
    int hor;

    public Alumno(String id, String nombre, String apellidos, Calendar fecha) throws Exception
    {
       super(id, nombre, apellidos, fecha);
    }

    public Alumno(String id, String nombre, String apellidos, Calendar fecha, String grupo, int hor) throws Exception{
        super(id, nombre, apellidos, fecha);
        this.grupo=grupo;
        this.hor=hor;
        if(hor==1){
            horario="MAÑANA";
        }
        else if(hor==2){
            horario="TARDE";
        }
    }
    
    public String obtenerAlumno()
    {
         return id + " " + nombre + " "+  apellidos + " " + grupo + " " + horario;
    }
    
    public void ponGrupo(String grupo, int hor){
        this.grupo=grupo;
        this.hor=hor;
        if(hor==1){
            horario="MAÑANA";
        }
        else if(hor==2){
            horario="TARDE";
        }
    }
    
    public void ponGrupo(String grupo){
        this.grupo=grupo;
    }
    
    public int numDias(){
    	Date fechaActual = new Date();
        int ndias = (int)((fechaActual.getTime()-fechaA.getTimeInMillis())/(24*60*60*1000));
        return ndias;
    }
}
