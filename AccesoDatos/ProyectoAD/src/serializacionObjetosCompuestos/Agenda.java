package serializacionObjetosCompuestos;

import java.util.*;
import java.io.*;

public class Agenda implements Serializable {

    Contacto contacto;

    Agenda(Contacto contacto) {
        this.contacto = contacto;
    }

    public String toString() {
        return contacto.nombre + " " + contacto.telefono;
    }
}
