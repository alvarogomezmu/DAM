package calculadoraclienteservidor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.swing.JOptionPane;

/**
 *
 * @author Alvaro Gomez
 */
public class Cliente {

    public static void main(String[] args) throws UnknownHostException, IOException {
        // declaracion de los dos numeros que pediremos por pantalla, la operacion y el caracter que se le asigna a dicha operacion
        double num1;
        double num2;
        int operacion = 0;
        char opr;

        Socket cliente = new Socket("127.0.0.1", 12342);
        System.out.println("El cliente se conecta al servidor");

        ObjectInputStream resultado = new ObjectInputStream(cliente.getInputStream());
        ObjectOutputStream datos = new ObjectOutputStream(cliente.getOutputStream());

        num1 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el primer número"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el segundo número"));

        while (!((operacion >= 1) && (operacion <= 4))) {
            operacion = Integer.parseInt(JOptionPane.showInputDialog("¿Que operacion desea realizar? 1= +, 2= -,3= X,4= / "));
            if (!((operacion >= 1) && (operacion <= 4))) {
                System.out.println("Operacion no valida");
            }
        }
        // pasamos la operacion (junto con los numeros introducidos) a los datos  
        datos.writeInt(operacion);
        datos.writeDouble(num1);
        datos.writeDouble(num2);
        datos.flush();
        
        double total = resultado.readDouble();
        opr = resultado.readChar();

        System.out.println("Resultado de " + num1 + opr + num2 + " = " + total);
        
        // cerramos el resultado, los datos introducidos y el cliente
        resultado.close();
        datos.close();
        cliente.close();
    }
}
