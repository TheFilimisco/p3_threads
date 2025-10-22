package exercise7;

public class StateTest implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("State before to sleep" + Thread.currentThread().getState());
            Thread.sleep(2000);
            System.out.println("State after to sleep" + Thread.currentThread().getState());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
