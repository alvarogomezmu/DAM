/*
    
*/
package ejerciciostema1;

import java.util.ArrayList;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class ejercicio1 {

    public static void main(String[] args) {
        try {
            BufferedReader f1 = new BufferedReader(new FileReader("C:\\Users\\Alumnot\\Documents\\numero.txt"));
            ArrayList<Integer> Arr=new ArrayList<Integer>();
            String str=null;
            int num=0;
            int suma=0;
            
            while (f1.ready()) {
                str=f1.readLine();
                num=Integer.parseInt(str);
                Arr.add(num);
            }
            
            for(int i=0; i<Arr.size(); i++)
            {
                suma =suma+Arr.get(i);
            }
            System.out.println(suma);
        } catch (IOException e) {
            System.out.println("Error " + e);
        }
    }
}
