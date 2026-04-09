import javax.swing.*;
import java.util.Arrays;

public class Lesson5 {
    public static void main(String[] args) {
        int[] array1 = {2, 3, 4, 1, 3, 2, 8, 9}; //  работает
        int[] array2 = {2, 3, 4, 1, 1, 2, 8, 9};//  не работает
       // System.out.println(Lesson5.firstTwoMin(array1));
        //System.out.println(Lesson5.firstTwoMin(array2));
int [] n = {5,2,3};
        int min1 =Integer.MAX_VALUE ;
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < n.length; i++){
            if (n[i] < min1){
                min2 = min1;
                min1 = array1[i];
            }
            else if (n[i] < min2){
                min2 = array1[i];
            }
        }
        System.out.println(min1);
        System.out.println(min2);

    }




    static String firstTwoMin(int[] nums) {
         for (int i = 0; i < nums.length; i++) {
            int min = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
            if (min == 1) {
                break;
            }
        }
        return nums[0] + " " + nums[1];
    }



}

