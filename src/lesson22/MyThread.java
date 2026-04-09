package lesson22;

public class MyThread extends Thread {
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

        @Override
    public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println(MyThread.currentThread().getName() + " " + i);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.getMessage();
                }
            }


//    @Override
//    public void run() {
//        for (int i = 0; i < 1000; i++){
//        }
//    }

        }
}
