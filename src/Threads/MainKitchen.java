package Threads;

public class MainKitchen {
    public static void main(String[] args) {
        // We create our helper (but they aren't doing anything yet)
        Helper helperTony = new Helper();

        System.out.println("Chef: Tony. get the water boiling!");

        // We tell them to START (start)
        // Helper Tony starts doing their 'run()'
        helperTony.start();

        // 4. Meanwhile (AT THE SAME TIME), the Chef does their job
        String[] vegetables = {"carrot","onion","pepper","celery","cucumber"};
        for (String vegetable : vegetables) {
            System.out.println("Chef: chopping " + vegetable + "...");
            try {
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println("The helper was interrupted" + e.getMessage() );
            }
        }
        System.out.println("Chef: I've finished chopping!");
    }
}
