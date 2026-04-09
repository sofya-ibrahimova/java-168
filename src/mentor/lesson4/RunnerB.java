package mentor.lesson4;

import java.util.Random;

public class RunnerB implements Runnable {
    private Race race;

    public RunnerB(Race race) {
        this.race = race;
    }

    @Override
    public void run() {
        race.go("Runner B");
    }
}


