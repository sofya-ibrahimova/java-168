package lesson22;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Lesson22 {
    public static void main(String[] args) throws InterruptedException {
//        CustomStringBuilder csb = new CustomStringBuilder();
//        csb.append("H");
//        csb.append("lkrfd;ds;s;a;;a;a;a;a;a;a;a;a;a;a;a;a;a;a;a;a ");
//        csb.append("World!");
//
//        System.out.println(csb);
//
//        System.out.println(csb.reverse());
//
//        System.out.println("*******");
//
//        csb.resize(30);
//        System.out.println(csb.getValue().length);
//
//        System.out.println("********");
//
//        CustomStringBuilder csm1 = new CustomStringBuilder("Hello  Hello  Hello  Hello  Hello");
//        System.out.println(csm1.getSize());
//        System.out.println(csm1.getValue().length);


        MyThread myThread = new MyThread("MyThread");
        MyThread myThread1 = new MyThread();

//        myThread.start();
//        myThread1.start();
//        Thread.sleep(100);
//
//        myThread.join();
//        myThread.join();

        Counter counter = new Counter();
        System.out.println(counter.getI());

        System.out.println("main thread");

//        ExecutorService executorService = Executors.newFixedThreadPool(5);
//        executorService.execute(myThread1);
//        executorService.execute(myThread);
//        executorService.shutdown();
//        AtomicInteger atomicInteger = new AtomicInteger();
//        atomicInteger.incrementAndGet();
//        atomicInteger.compareAndSet(5, 10);



    }
}