package exercise7;

import exercise7.Mouse;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*Thread t = new Thread(new StateTest());
        System.out.println("t id: " + t.getId());
        System.out.println("t name: " + t.getName());
        System.out.println("t state: " + t.getState());
        System.out.println("t isAlive: " + t.isAlive());
        String name = "New name";
        t.setName(name);
        System.out.println("t name: " + t.getName());
        System.out.println("t priority: " + t.getPriority());
        t.start();
        // Because you need launch to verify
        System.out.println("t isAlive: " + t.isAlive());*/

        // 7.2
        Thread minniMouse = new Thread(new Mouse("Minni"));
        Thread mickeyMouse = new Thread(new Mouse("Mickey"));
        Thread tomMouse = new Thread(new Mouse("Tom"));

        System.out.println(minniMouse.getName() + " starting");
        minniMouse.setName("Minni");
        System.out.println(mickeyMouse.getName() + " starting");
        mickeyMouse.setName("Mickey");
        System.out.println(tomMouse.getName() + " starting");
        tomMouse.setName("Tom");

        /*minniMouse.start();
        mickeyMouse.start();
        tomMouse.start();*/

        System.out.println(minniMouse.getName() + " starting next to setName");
        System.out.println(mickeyMouse.getName() + " starting next to setName");
        System.out.println(tomMouse.getName() + " starting next to setName");

        // 7.3

        System.out.println("==========Start With Minni Priority=========");

        minniMouse.setPriority(Thread.MAX_PRIORITY);


        mickeyMouse.start();
        tomMouse.start();
        minniMouse.start();
        //

    }
}
