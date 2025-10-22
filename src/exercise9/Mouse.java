package exercise9;

public class Mouse implements Runnable {
    private String name;
    private int timeToEat;

    //Static variable
    static private int attempsLoves = 1;

    public Mouse(String name, int timeToEat) {
        this.name = name;
        this.timeToEat = timeToEat;
    }

    public Mouse(String name) {
        this.name = name;
        timeToEat = 0;
    }

    @Override
    public void run() {
        if (name.equals("Mickey") && attempsLoves == 1) {
            attempsLoves -=1;
            System.out.println("Mickey loves minnie");
        }

            try {
                eat();
                Thread.sleep(setTimeEat(timeToEat));

            }catch (Exception e){
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Finish process " + name);
            }
    }

    public void eat(){
        System.out.println(name + " eating");
    }

    public long setTimeEat(int time) {
        System.out.println("Setting time to eat " + time);
        return time;
    }
}
