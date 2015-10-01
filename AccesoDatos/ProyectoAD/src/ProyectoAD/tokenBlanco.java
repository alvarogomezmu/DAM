package ProyectoAD;

import Herramientas.herramientas;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class tokenBlanco {
    
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Alumnot\\Documents\\GitHub\\dam\\AccesoDatos\\ProyectoAD\\src\\ProyectoAD\\empleados.txt"));
		int opcion, cont = 0, mayor = 0, menor = 99;
		Scanner sc = new Scanner(System.in);
		String nommayor = " ", nommenor = " ", linea = null;
		//Creamos menu
		System.out.println("Menú");
		System.out.println("-----");
		System.out.println("1. Obtener listado. ");
		System.out.println("2. Nombre empleado con sueldo desconocido. ");
		System.out.println("3. Conteo de empleados con edad desconocida. ");
		System.out.println("4. Empleado mas joven, y mas mayor. ");
		System.out.println("5. Salir. ");
		System.out.println("Selecciona una opción: ");
		opcion = sc.nextInt(); //Solicitud opcion

		switch (opcion) {
		case 1:
			while ((linea = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(linea, "#, ");
				while (st.hasMoreTokens()) {
					String codigo = st.nextToken();
					System.out.println(codigo);
				}
			}
			br.close();
			break;

		case 2:
			while ((linea = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(linea, "#");
				while (st.hasMoreTokens()) {
					String nombre = st.nextToken();
					String edad = st.nextToken();
					String sueldo = st.nextToken();

					if (sueldo.equals(" ")) {
						System.out.println(nombre);
					}
				}
				br.close();
			}
			break;

		case 3:
			while ((linea = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(linea, "#");
				while (st.hasMoreTokens()) {
					String nombre = st.nextToken();
					String edad = st.nextToken();
					String sueldo = st.nextToken();

					if (edad.equals(" ")) {
						cont++;
					}
				}
			}

			System.out.println("Empleados con edad desconocida: " + cont);
			br.close();
			break;
			

		case 4:
			while ((linea = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(linea, "#");
				while (st.hasMoreTokens()) {
					String nombre = st.nextToken();
					String edad = st.nextToken();
					String sueldo = st.nextToken();

					if (!edad.equals(" ")) {
						if (Integer.parseInt(edad) > mayor) {
							nommayor = nombre;
							mayor = Integer.parseInt(edad);
						}

						if (Integer.parseInt(edad) < menor) {
							nommenor = nombre;
							menor = Integer.parseInt(edad);
						}
					}
				}
			}
			System.out.println("El empleado mayor es " + nommayor + ", con " + mayor + " años, y el menor es "
					+ nommenor + " con " + menor + " años");
			br.close();
			break;
			
			//Opcion default
			default: {
			System.out.println("Fin de programa");
			br.close();
		}

		}
	}
}
