package serializacion;

import Herramientas.herramientas;
import java.io.IOException;

public class list implements java.io.Serializable {
        public static void main(String[] args) throws IOException, ClassNotFoundException {

            int array[] = {12, 15, 11};

            herramientas.Serializar(array, "C:\\Users\\alumnot\\Desktop\\fichero.obj");
            herramientas.Deserializar("C:\\Users\\alumnot\\Desktop\\fichero.obj");
        }
    }
