package ProyectoAD;

import java.io.*;
import java.util.*;

public class Ej1Leer1token {
    public static void main(String args[]){
        try{
            BufferedReader leer= new BufferedReader(new FileReader("C:\\Users\\Alumnot\\Documents\\clientes.txt"));
            String linea=null;
            while((linea=leer.readLine())!=null){
                StringTokenizer st=new StringTokenizer(linea, "#");
                while(st.hasMoreTokens()){
                    String codigo=st.nextToken();
                    String nom=st.nextToken();
                    String suel=st.nextToken();
                    System.out.println(codigo+nom+suel);
                }
            }
            leer.close();
        }catch(IOException e){
            System.out.println("Error: " + e);
        }
    }
    
}
