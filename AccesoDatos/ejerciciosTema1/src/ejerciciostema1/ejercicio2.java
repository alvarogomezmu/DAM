/*
    
 */
package ejerciciostema1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ejercicio2 {

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
            
            
            System.out.println("");
            while(f1.ready())
            {
                
            }
        } catch (IOException e) {
            System.out.println("Error " + e);
        }
    }
}