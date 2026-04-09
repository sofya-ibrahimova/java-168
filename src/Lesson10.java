import java.util.Arrays;

public class Lesson10 {
    public static void main(String[] args) {

        int[] array = {1, 2, 1, 1, 5, 6, 6, 2, 0, 0, 12, 14};
        int [] newArray = Test.countArray(array);
        System.out.println(Arrays.toString(newArray));
        System.out.println(Test.countElements(4, newArray));





    }

}
