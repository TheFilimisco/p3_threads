package exercise2;

public class Mouse {
    private String name;
    public Mouse(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("The mouse " + name + " has started to eat");
        System.out.println("The mouse " + name + " is eating");
        System.out.println("The mouse " + name + " has ate");

    }
}
