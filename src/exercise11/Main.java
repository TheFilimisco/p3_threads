package exercise11;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(2,10);
        Counter counter2 = new Counter(1,15);
        Counter counter3 = new Counter(5,9);
        Thread t1 = new Thread(counter);
        Thread t2 = new Thread(counter2);
        Thread t3 = new Thread(counter3);

        t1.start();
        t2.start();
        t3.start();
    }
}
