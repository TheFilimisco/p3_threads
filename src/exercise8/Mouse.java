package exercise8;

public class Mouse implements Runnable {
    private String name;
    private int timeToEat;

    public Mouse(String name, int timeToEat) {
        this.name = name;
        this.timeToEat = timeToEat;
    }
    public Mouse(String name) {
        this.name = name;
    }

    @Override
    public void run() {
            try {
                eat();
                setTimeEat(timeToEat);
            }catch (Exception e){
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Finish process " + name);
            }
    }

    public void eat(){
        System.out.println(name + " eating");
    }

    public void setTimeEat(int time) throws InterruptedException {
        System.out.println("Setting time to " + time);
        Thread.sleep(time);
    }
}
