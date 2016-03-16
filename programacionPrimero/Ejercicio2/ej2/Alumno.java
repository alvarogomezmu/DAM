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
public class Alumno extends Persona {

    String grupo, horario;
    int horarioM_T;

    public Alumno(String id, String nombre, String apellidos, Calendar fecha) throws Exception {
        super(id, nombre, apellidos, fecha);
    }

    public Alumno(String id, String nombre, String apellidos, Calendar fecha, int horarioM_T, String grupo) throws Exception {
        super(id, nombre, apellidos, fecha);
        this.grupo = grupo;//para indicar que accedemos al parametro y no al metodo
        this.horarioM_T = horarioM_T;
        if (horarioM_T == 1) {
            horario = "MAÑANA";
        } else if (horarioM_T == 2) {
            horario = "TARDE";
        }
    }

    // metodo para imprimir los datos del alumno
    public String obtenerAlumno() {
        return identificador + " " + nombre + " " + apellidos + " " + horario + " " + grupo;
    }

    // metodo que permite modificar el contenido de los atributos grupo y horario
    public void ponGrupo(String grupo, int horarioM_T) {
        this.grupo = grupo;
        this.horarioM_T = horarioM_T;
        if (horarioM_T == 1) {
            horario = "MAÑANA";
        } else if (horarioM_T == 2) {
            horario = "TARDE";
        }
    }

    // metodo ponGrupo(sobrecargado) que permite modificar unicamente el contenido del atributo grupo
    public void ponGrupo(String grupo) {
        this.grupo = grupo;
    }

    // metodo para obtener el numDias de antiguedad del alumno en el centro
}
