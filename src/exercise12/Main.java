package exercise12;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Clock clock1 = new Clock(LocalDateTime.of(2025,10,26,20,29,50),"Test");
        Thread t1 = new Thread(clock1);
        t1.start();
    }
}
