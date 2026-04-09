package lesson22;

public class Counter {

    private int I;


 public synchronized  void  increment (){
        I++;
    }

    public  int getI() {
        return I;
    }
}
