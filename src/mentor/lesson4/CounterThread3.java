package mentor.lesson4;

public class CounterThread3 implements Runnable{

    private MyArray myArray;

    CounterThread3(MyArray myArray){
        this.myArray = myArray;
    }

    @Override
    public void run() {
        myArray.sum(25, 39);
    }

}
