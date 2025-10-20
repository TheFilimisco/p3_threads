package exercise4;

import exercise2.Mouse;

public class Main {
    public static void main(String[] args) {
        Mouse mickey = new Mouse("Mickey");
        Mouse minnie = new Mouse("Minnie");
        Mouse jerry = new Mouse("Jerry");

        new Thread(mickey).start();
        new Thread(minnie).start();
        new Thread(jerry).start();
    }
}
