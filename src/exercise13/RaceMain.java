package exercise13;

import java.util.ArrayList;
import java.util.Scanner;

public class RaceMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the step lapse:");
        int finalStep = sc.nextInt();

        Horse horse1 = new Horse("Jack");
        Horse horse2 = new Horse("Miguel");
        Horse horse3 = new Horse("Darwin");

        Thread t1 = new Thread(horse1);
        Thread t2 = new Thread(horse2);
        Thread t3 = new Thread(horse3);

        t1.start();
        t2.start();
        t3.start();

        ArrayList<Horse> horses = new ArrayList<>();
        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);

        ArrayList<Thread> threads = new ArrayList<>();
        threads.add(t1);
        threads.add(t2);
        threads.add(t3);

        boolean trigger = true;

        while (trigger) {
            for(Horse horse : horses) {
                if (finalStep == horse.getNumStepsRace()) {
                    System.out.println("The race is over!" + "win" + horse.getNameHorse());
                    for (Thread thread : threads) {
                        thread.interrupt();
                    }
                    trigger = false;
                    break;
                }
            }
        }
    }
}
