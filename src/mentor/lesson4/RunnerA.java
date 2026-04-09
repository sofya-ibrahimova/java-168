package mentor.lesson4;

import java.util.Random;

public class RunnerA implements Runnable {

    private Race race;

    public RunnerA(Race race) {
        this.race = race;
    }

    @Override
    public void run() {
        race.go("Runner A");
    }
}
