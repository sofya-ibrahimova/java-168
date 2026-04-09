package mentor.lesson4;

public class CounterThread4 implements Runnable {

    private MyArray myArray;

    CounterThread4(MyArray myArray){
        this.myArray = myArray;
    }

    @Override
    public void run() {
        myArray.sum(40, 81);
    }
}

