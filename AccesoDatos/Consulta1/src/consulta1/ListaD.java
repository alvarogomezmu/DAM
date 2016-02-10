/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consulta1;

/**
 *
 * @author AlumnoT
 */
public class ListaD {
    public NodoListaD Primero, Ultimo, Nuevo, Aux, Pos, Ant;
    
    public ListaD(){
        Primero = Ultimo = Nuevo = Aux = Pos = Ant = null;
    }
    
    public void insertarAtras(Object dato){
        if(Primero==null){
            Primero = new NodoListaD(dato);
            Ultimo = Primero;
        }else{
            Nuevo = new NodoListaD(Ultimo, dato);
            Ultimo.Der = Nuevo;
            Ultimo = Nuevo;
        }
    }
    
    public void insertarAlFrente(Object dato){
        if(Primero==null){
            Primero = new NodoListaD(dato);
            Ultimo = Primero;
        }else{
            Nuevo = new NodoListaD(dato, Primero);
            Primero.Izq-Nuevo;
            Primero = Nuevo;
        }
    }
}
