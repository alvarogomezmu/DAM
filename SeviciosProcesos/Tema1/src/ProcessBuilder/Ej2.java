package ProcessBuilder;

import java.io.IOException;
import java.util.Arrays;;

public class Ej2 {

	public static void main (String args[]) throws IOException {
		if (args.length <= 0) { // En argumentos incluir la ejecuci�n de una aplicaci�n
			System.err.println("Se necesita un programa a ejecutar");;
			System.exit(-1);;
		}
		
		ProcessBuilder pb = new ProcessBuilder(args);
		
		try {
			Process process = pb.start();
			int retorno = process.waitFor(); // El padre espera a la finalizaci�n del hijo
			System.out.println("La ejecuci�n de " + Arrays.toString(args) + " devuelve " + retorno);
		} catch (IOException ex) {
			System.err.println("Excepci�n de E/S");
			System.exit(-1);
		} catch (InterruptedException ex) {
			System.err.println("El proceso hijo finaliz� de forma incorrecta");
			System.exit(-1);
		}
	}
}
