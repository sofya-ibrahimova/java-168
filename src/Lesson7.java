import java.util.HashSet;

public class Lesson7 {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {2, 7, 5, 6, 3, 1, 4};


        int result = 0;
        for (int i = 0; i < array2.length; i++) {
            result += array2[i];
        }
        for (int i = 0; i < array1.length; i++) {
            result -= array1[i];
        }
        //   System.out.println(result < 0 ? -result : result);  //внутри проверяет если меньше 0 берет противоположное


        int sum = 0;  //teacher's code
        for (int i = 0; i < array1.length || i < array2.length; i++) {  //можно удалить первое условие спросить у гпт
            if (i != array1.length) {
                sum += array1[i];
            }
            if (i != array2.length) {
                sum -= array2[i];
            }
        }
        System.out.println(sum > 0 ? sum : -sum);


//        HashSet<Integer> set = new HashSet<>(array1.length - 1);
//        for (int i = 0; i < array1.length; i++) {
//            set.add(array1[i]);
//        }
//        for (int i = 0; i < array2.length; i++) {
//            if (!set.contains(array2[i])) System.out.println(array2[i]);
//        }

//        int index = 0;
//        boolean single = true;
//        for (int i = 0; i < array1.length; i++) {
//            single = true;
//            //   if (index < array2.length) {
//            if (array2[index] == array1[i]) {
//                index++;
//                i = -1;
//                single = false;
//            }
//        }
//        if(single)System.out.println(array2[index]);


//        Palindrome pal = new Palindrome();
//          System.out.println(pal.isPalindrome(3223));


    }
}