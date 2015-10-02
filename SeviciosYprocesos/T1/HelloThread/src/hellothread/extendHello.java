package hellothread;

public class extendHello extends Thread{
    public void run(){
        System.out.println("Hola desde el hilo creado!");
    }
}

public class RunT{
    public static void main(String args[]){
        new extendHello().start(); // Crea y arranca un nuevo hilo de ejecucion
        System.out.println("Hola desde el hilo principal");
        System.out.println("Proceso acabando");
    }
}
