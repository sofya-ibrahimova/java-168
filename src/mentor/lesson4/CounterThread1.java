package mentor.lesson4;

public class CounterThread1 implements Runnable{

    private MyArray myArray;

    CounterThread1(MyArray myArray){
        this.myArray = myArray;
    }

    @Override
    public void run() {
        myArray.sum(82, 100);
    }
}

