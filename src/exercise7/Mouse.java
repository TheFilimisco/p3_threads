package exercise7;

public class Mouse implements Runnable {
    private String name;
    public Mouse(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            eat();
            sleep();
        }
    }

    public void eat(){
        System.out.println(name + " eating");
    }

    public void sleep(){
        System.out.println(name + " sleeping");
    }
}
