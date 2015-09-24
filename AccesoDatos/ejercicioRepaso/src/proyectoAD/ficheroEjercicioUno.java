package proyectoAD;

import java.io.*;

public class ficheroEjercicioUno {

    public static void main(String args[]) {
        try{
            //Metodo para leer por teclado
            BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
            //metodo para escribir en pantalla
            BufferedWriter pantalla=new BufferedWriter(new FileWriter("C:\\Users\\Alumnot\\Documents\\ejercicioFicheroUno.txt"));       
            for(int i=0; i<4; i++){
                pantalla.write(teclado.readLine());
                pantalla.newLine();
            }
            pantalla.close();
        }catch(IOException e) {
            System.out.println("Se ha producido un error");
        }
        try{
            BufferedReader fich = new BufferedReader(new FileReader("C:\\Users\\Alumnot\\Documents\\ejercicioFicheroUno.txt"));
            Integer cont=0;
            while (fich.ready() && cont!=2) {
                System.out.println(fich.readLine());
                cont++;
            }
            fich.close();  
        } catch (IOException e) {
            System.out.println("Se ha producido un error");
        }
    }
}
