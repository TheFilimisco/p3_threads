package exercise2;

public class Mouse extends Thread {
    private String name;
    public Mouse(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("The mouse " + name + " has started to eat");
        System.out.println("The mouse " + name + " is eating");
        System.out.println("The mouse " + name + " has ate");

    }

    @Override
    public void run() {
        this.eat();
    }


}
