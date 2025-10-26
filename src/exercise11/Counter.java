package exercise11;

public class Counter implements Runnable{
    private int ini;
    private int fin;

    public Counter(int ini, int fin) {
        this.ini = ini;
        this.fin = fin;
    }

    @Override
    public void run() {
        for (int i = ini; i < fin; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread: " +Thread.currentThread().getName() + " - count :"+ i);
        }
    }
}
