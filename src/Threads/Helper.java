package Threads;
// This is the uniform and the contract.
public class Helper extends Thread {

    // This is the helper's task list.
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("HELPER: The water is " + (i * 20) + "% boiling...");
            try {
                // We take a short pause to simulate it taking time
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("The helper was interrupted");
            }
        }
        System.out.println("Helper: The Water is Boiling");
    }

}
