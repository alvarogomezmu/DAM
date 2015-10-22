package serializacionObjetosCompuestos;

import java.io.*;

public class Contacto implements Serializable {

    String nombre;
    String telefono;

    Contacto() {

    }

    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String toString() {
        return "Nombre: " + nombre + ", telefono: " + telefono;
    }
}
