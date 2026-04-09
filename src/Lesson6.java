import javax.swing.*;
import java.util.Arrays;

public class Lesson6 {
    public static void main(String[] args) {

        int[] arr1 = {2, 3, 1, 2};
        int[] arr2 = {4, 5};
        int[] arr3 = {1, 7, 8, 9};

        //               arrL[0]      arrL[1]     arrL[2]
        int[][] arrL = {{2, 3, 1, 2}, {4, 5}, {1, 7, 8, 9}};

//        int[][] array = new int[3][];
        // array[2][6] = 5; ошибка так как размер массива под номером 2 не определен
        //     System.out.println(array[2][6]);

        for (int i = 0; i < arrL[0].length; i++) {
            for (int j = 0; j < arrL.length; j++) {
                if (i < arrL[j].length) {
                    //      System.out.print(arrL[j][i] + " ");
                }
            }
        }

        for (int i = 0; i < arrL.length; i++) {
            for (int j = 0; j < arrL[i].length; j++) {
//                System.out.println(arrL[i][j] + " ");
            }
        }

//        поиск минимального элемента
        int min = arrL[0][0];
        for (int i = 0; i < arrL.length; i++) {
            for (int j = 0; j < arrL[i].length; j++) {
                if (arrL[i][j] < min) {
                    min = arrL[i][j];
                }
            }
        }
//        System.out.println(min);


//       нахождение факториала максимального элемента
        int max = arrL[0][0];
        for (int i = 0; i < arrL.length; i++) {
            for (int j = 0; j < arrL[i].length; j++) {
                if (arrL[i][j] > max) max = arrL[i][j];
            }
        }
        int factorial = 1;
        for (int i = max; i > 0; i--) {
            factorial *= i;
        }
        //       System.out.println(factorial);


// находить минимум в одномерном массиве и вычитать его из всех элементов каждый раз
        int[] nums = {2, 1, 2, 3, 1};

//        boolean step = true;
//        while (step) {
//            step = false;
//            int min1 = Integer.MAX_VALUE;
//            for (int i = 0; i < nums.length; i++) {
//                if (nums[i] < min1 && nums[i] > 0) {
//                    min1 = nums[i];
//                }
//                if (i == nums.length - 1) {
//                    for (int j = 0; j < nums.length; j++) {
//                        if (nums[j] != 0) {
//                            nums[j] -= min1;
//                            step = true;
//                        }
//                    }
//                }
//            }
//        }
//        System.out.println(Arrays.toString(nums));



        //teacher's code
        int min2 = 0;  //если не хотим использовать Integer.MAX_VAlue находим первый ненулевой элемент массива
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > 0){
                min2 = nums[i];
                break;
            }
        }
        boolean flag = true;
        while (flag) {
            int min1 = Integer.MAX_VALUE;
            flag = false;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < min1 && nums[i] > 0) {
                    min1 = nums[i];

                }
            }
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 0) {
                    nums[i] -= min1;
                    flag = true;
                }
                System.out.print(nums[i] + " ");
            }
            System.out.println();
        }



//        // компактный вариант  GPT code
//        while (true){
//            int min = Integer.MAX_VALUE;
//            for(int i = 0; i < nums.length; i ++){
//                if (nums[i] < min && nums[i] !=0){
//                    min = nums[i];
//                }
//            }
//            if (min == Integer.MAX_VALUE) break;
//
//            for (int j = 0; j < nums.length; j ++){
//                if (nums[j] != 0){
//                    nums[j] -= min;
//                }
//            }
//        }

    }
}



