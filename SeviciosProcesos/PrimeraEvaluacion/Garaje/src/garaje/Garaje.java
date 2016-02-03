/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garaje; 
public class Garaje extends Coche{ 
    private Coche coche; 
    private String tipoAveria; 
    private int cochesAtendidos; 
    private boolean ocupado; 
     
    public Garaje(){} 
     
    public boolean aceptarCoche(Coche coche, String tipoAveria){ 
        if(!ocupado){ 
            this.coche=coche; 
            this.tipoAveria=tipoAveria; 
            ocupado=true; 
             
            return true; 
        } 
         
        return false; 
    } 
    public void devolverCoche(){ 
        ocupado=false; 
        cochesAtendidos++; 
        System.out.println("El garaje está libre. Se han atendido " +cochesAtendidos+ " coches."); 
    } 
    public String toString() { 
        return coche+ " averiado. " +tipoAveria; 
    } 
} 