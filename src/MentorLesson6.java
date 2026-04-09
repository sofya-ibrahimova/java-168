import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MentorLesson6 {
    public static void main(String[] args) {
//        System.out.println(MentorLesson6.sortDesc(3241));

        System.out.println(MentorLesson6.isSquare(-1));
//     #AT LESSON
//        Scanner sc = new Scanner(System.in);
//
//        List<String> names = new ArrayList<>();
//        names.add("Sofya");
//        names.add("Leyla");
//        names.add("Aytekin");
//        names.add("Elsen");
//        names.add("Sadiq");
//        names.add("Sabir");
//        names.add("Toqrul");
//        names.add("Deniz");
//        names.add("Xan");
//        while (true) {
//            System.out.println("ad axtar");
//            String searchName = sc.next();
////            for (int i = 0; i < names.size(); i++) {
////                if (names.get(i).equals(searchName) )
////                    System.out.println("ad movcuddu");
////            }
//            System.out.println(names.contains(searchName) ? "ad movcuddur" : "movcud deyil");
//
//            System.out.println("ad elave et");
//            String str = sc.next();
//            names.add(str);
//
//            for (int i = 0; i < names.size(); i++){
//                System.out.println(names.get(i));
//            }
//        }
        //   System.out.println(MentorLesson6.squareDigits(9119));
    }


    //HOMEWORK

    //    #1
    public static String highAndLow(String numbers) {
        String[] arr = numbers.split(" ");    // метод split
        int[] numArray = new int[arr.length];
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = Integer.parseInt(arr[i]);   //метод parseInt
        }
        int min = numArray[0];
        int max = numArray[0];
        for (int i = 1; i < numArray.length; i++) {
            if (min > numArray[i]) min = numArray[i];
            if (max < numArray[i]) max = numArray[i];
        }
        return max + " " + min;


    }

    //    #2
    public static int sortDesc(final int num) {
        if (num == 0) return 0;
        int number = num;
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        int number1 = num;
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = number1 % 10;
            number1 /= 10;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] >= arr[index]) {
                    index = j;
                }
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }
        StringBuilder str = new StringBuilder();
        for (int x : arr) {
            str.append(x);
        }
        return Integer.parseInt(str.toString());
    }
// #3
    public static boolean isSquare(int n) {
        if (n < 0) return false;
        if (n == 0) return true;
        int a = n / 2;
        while (a > 0) {
            if (a == (double)n / a) {
                return true;
            }
            a--;
        }
        return false;
    }

    // #4  не получилось!
    public static List<Object> filterList(final List<Object> list) {
        List<Object> number = new ArrayList<>();
        for (Object element : list) {
            if (element instanceof Integer) {
                number.add(element);
            }

        }return number;

    }
}





