package exercise8;

public class Main {
    public static void main(String[] args) {
        Thread minniThread = new Thread(new Mouse("Minni",2000));
        Thread mickeyThread = new Thread(new Mouse("Mickey",500));
        Thread jerryThread = new Thread(new Mouse("Jerry",10000));
        Thread mikeThread = new Thread(new Mouse("Mike",2000));

        try {
            minniThread.start();
            /*mickeyThread.join();*/

            mickeyThread.start();
            /*mickeyThread.join();*/

            jerryThread.start();
            /*jerryThread.join();*/

            mikeThread.start();

        } catch (Error e) {
            e.getMessage();
        }

    }
}
