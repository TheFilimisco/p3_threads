package exercise6;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new StateTest());
        System.out.println("Starting thread" + t.getName());
        t.start();
        Thread.sleep(500);
        System.out.println("State during launching " + t.getState());
    }
}
