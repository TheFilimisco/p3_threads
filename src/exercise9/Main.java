package exercise9;

import exercise9.Mouse;

public class Main {
    public static void main(String[] args) {
        Thread minniThread = new Thread(new Mouse("Minni",2000));
        Thread mickeyThread = new Thread(new Mouse("Mickey",500));
        Thread mickey2Thread = new Thread(new Mouse("Mickey",500));
        Thread mickey3Thread = new Thread(new Mouse("Mickey",500));
        Thread jerryThread = new Thread(new Mouse("Jerry",10000));
        Thread mikeThread = new Thread(new Mouse("Mike",2000));

        minniThread.start();
        mickeyThread.start();
        jerryThread.start();
        mikeThread.start();
        mickey2Thread.start();
        mickey3Thread.start();

    }
}
