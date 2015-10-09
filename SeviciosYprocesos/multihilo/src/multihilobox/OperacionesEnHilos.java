/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multihilobox;

import static java.lang.Thread.sleep;

/**
 *
 * @author Alumnot
 */
public class OperacionEsEnHilos entends Thread{
    private int numHilo;
    Operaciones r;
    private ventanas ventana_hilo;

    OperacionesEnHilos(int i, Operaciones resultados) {
        this.numHilo = i;
        this.r = resultados;
        ventana_hilo = new ventanas("Hilo" + numHilo);
    }

    public void run() {
        String cadena = new String();
        switch (numHilo) {
            case 1:
                for (int i = 1; i <= 10; i++) {
                    r.Sumas = r.Sumas + (double) i;
                    //System.out.println("Soy el Hilo"+ numHilo +" en el numero "+ i + y valgo "+ r.Sumas);
                    cadena = "Soy el Hilo" + numHilo + " en el numero " + i + " y valgo " + r.Sumas + "\n";
                    ventana_hilo.escribeCadena(cadena);
                }
                ;
                try {
                    sleep(1000);
                } catch (InterrumptedException e) {
                    System.out.println("Hilo Interrumpido");
                }
        
        break;
        
        case 2:
            for(int j=1;j<=10;j++){
                r.Multiplica=r.Multiplica*j;
                //System.out.println("Soy el Hilo" + numHilo +" en el numero "+ i +" y valgo " + r.Multiplica);
                cadena="Soy el Hilo"+ numHilo +" en el numero "+ j + "y valgo" + r.Multiplica+ "\n";
                ventana_hilo.escribeCadena(cadena);
                try{
                    sleep(1000);
                }catch(InterruptedException e){
                    System.out.println("Hilo interrumpido");
                }
            }
        break;
        
        case 3:
            int cuenta=0;
            int k=0;
            while(cuenta <=10){
                if(k%2==0){
                    r.SumaPares=r.SumaPares+k;
                    cuenta++;
                }
            }
                    
            
    }

}
}

