package mentor.lesson4;

public class CounterThread2 implements Runnable {
    private MyArray myArray;

    CounterThread2(MyArray myArray){
        this.myArray = myArray;
    }
    @Override
    public void run() {
        myArray.sum(0, 24);
    }
}
