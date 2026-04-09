package mentor.lesson4;

import java.util.Random;

public class RunnerC implements Runnable {

    private Race race;

    RunnerC (Race race){
        this.race = race;
    }
    @Override
    public void run() {
        race.go("Runner C");
    }

}

