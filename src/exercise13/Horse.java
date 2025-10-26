package exercise13;

public class Horse implements Runnable{
    private final String nameHorse;
    private int numStepsRace;

    public Horse(String nameHorse, int numStepsRace) {
        this.nameHorse = nameHorse;
        this.numStepsRace = numStepsRace;
    }

    public Horse(String nameHorse) {
        this.nameHorse = nameHorse;
        numStepsRace = 0;
    }

    public String getNameHorse() {
        return nameHorse;
    }

    public int getNumStepsRace() {
        return numStepsRace;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(nameHorse + " " + numStepsRace);
            numStepsRace++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(nameHorse + " was interrupted!");
                break;
            }
        }
    }
}
