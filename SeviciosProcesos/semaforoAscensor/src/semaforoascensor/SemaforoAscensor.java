/*
    Implementar una aplicación que simule el funcionamiento de un ascensor.
    El ascensor tiene una capacidad de N personas de un edificio de M plantas. A cada planta van llegando personas que suben o esperan según la capacidad disponible.
    El número de personas que bajan en cada planta es aleatorio. El ascensor para en todas las plantas.
    Mejora: Cuando la personas suben, indican en que planta se bajarán, y adicionalmente existe un botón en cada planta que se activa cuando llega una persona que desea usar el mismo.
 */
package semaforoascensor;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class SemaforoAscensor {

    // Declaracion de un objeto para cada clase
    Modelo objModelo = null;
    Vista objVista = null;
    
    // Declaramos el constructor
    public SemaforoAscensor(Vista vis, Modelo mod){
        this.objVista = vis;
        this.objModelo = mod;
    }
    
    // Variables de modelo de datos
    
    // Establecemos el numero maximo de personas que se permiten en el ascensor
    public static int capacidad = 6;
    
    // Establecemos el numero de plantas
    public static int plantas = 4;
    
    // Boolean para controlar la direccion del ascensor
    public static boolean subiendo = true;
    
    // Semaforo para cada planta
    public static Semaphore semaforoPlanta[];
    
    // Planta actual en la que se encuentra el ascensor
    public static int plantaActual = 0;
    
    // Hacemos un ArrayList de personas esperando al ascensor
    public static ArrayList<Persona> personasEsperando = new ArrayList<Persona>();
    
    // Hacemos un ArrayList de personas dentro del ascensor
    public static ArrayList<Persona> personasAscensor = new ArrayList<Persona>();
    
    
    // Hacemos un metodo para crear una nueva persona
    public static void nuevaPersona(){
        int pInicio = Modelo.plantaAleatoria() // Planta donde la persona coge el ascensor
        int pFin = Modelo.plantaAleatoria(); // Planta donde la persona se baja
        
        // Si las plantas son las mismas, cambiamos la de FIN
        while(pInicio == pFin){
            pFin = Modelo.plantaAleatoria();
        }
        
        // Se crea la persona y se le aniaden las plantas de Inicio y FIN
        Persona p = new Persona();
        
        // TODO nombre
        p.setPlantaInicio(pinicio);
        p.setPlantaFin(pFin);
        
        // Se aniade la persona al array
        personaEsperando.add(p);
        
        // TODO Lanzar persona
    }
    
    // Metodo para que el ascensor cambie de piso
    public static void cambiarPiso(){
        if(subiendo){
            // Se incrementa la planta
            plantaActual++;
            
            //Si llega al ultimo piso, cambiamos la direccion para que baje
            if(plantaActual == plantas){
                subiendo = false;
            }
        }else if(!subiendo){
            // Se decrementa la planta
            if(plantaActual == 0){
                subiendo = true;
            }
        }
    }
    
    public void Run(){
        // Cambiar de piso en el ascensor
        cambiarPiso();
        
        // Generamos un numero aleatorio de personas nuevas
    }
}
