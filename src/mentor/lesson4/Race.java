package mentor.lesson4;

import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

public class Race {

    private Random random = new Random();
    AtomicBoolean hasWinner = new AtomicBoolean(false);

    public  void go(String name) {
        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(1000 + random.nextInt(301));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name + " step: " + i);
            if (i == 10) {
                if (hasWinner.compareAndSet(false, true)) {
                    System.out.println("Winner is " + name);
                }
            }
        }
    }


}
