package ProcessBuilder;

import java.io.IOException;
import java.util.Arrays;;

public class Ej2 {

	public static void main (String args[]) throws IOException {
		if (args.length <= 0) { // En argumentos incluir la ejecución de una aplicación
			System.err.println("Se necesita un programa a ejecutar");;
			System.exit(-1);;
		}
		
		ProcessBuilder pb = new ProcessBuilder(args);
		
		try {
			Process process = pb.start();
			int retorno = process.waitFor(); // El padre espera a la finalización del hijo
			System.out.println("La ejecución de " + Arrays.toString(args) + " devuelve " + retorno);
		} catch (IOException ex) {
			System.err.println("Excepción de E/S");
			System.exit(-1);
		} catch (InterruptedException ex) {
			System.err.println("El proceso hijo finalizó de forma incorrecta");
			System.exit(-1);
		}
	}
}
