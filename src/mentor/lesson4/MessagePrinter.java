package mentor.lesson4;

import lesson24.Range;

import java.util.Random;

public class MessagePrinter implements Runnable {
    private String message;
    private int repeatCount;
    private Random random = new Random();

    MessagePrinter(String message, int count) {
        this.message = message;
        repeatCount = count;

    }


    @Override
    public void run() {
        for (int i = 0; i < repeatCount; i++) {
            System.out.println(Thread.currentThread().getName() + " " + message);
            try {
                Thread.sleep(200+ random.nextInt(601));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
