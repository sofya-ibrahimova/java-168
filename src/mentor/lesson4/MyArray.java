package mentor.lesson4;

public class MyArray {

    private int[] myArray = new int[100];
    private int sum;

    public void setMyArray(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i;
        }
    }

    public void sum(int start, int end) {
        if (end > myArray.length) {
            throw new RuntimeException();
        }
        for (int i = start; i <= end; i++) {
            sum+=i;
        }
    }

    public int getSum() {
        return sum;
    }
}
