package multihilosthread;

public class MultihilosThread extends Thread{

    private int c;
    private int hilo;

    public MultihilosThread(int hilo) {
        this.hilo = hilo;
    }
    
    public void run() {
        c = 0;
        while (c <= 4) {
            System.out.println("Hilo:" + hilo + " C=" + c);
            c++;
        }
    }

    public static void main(String[] args) {
        MultihilosThread h = null;
        for (int i = 0; i <= 5; i++) {
            h = new MultihilosThread(i + 1);
            h.start();
            System.out.println("3 hilos creados");
        }
    }

}
