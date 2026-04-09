import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Lesson9 {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        String word = sc.next();
//
//        char[] array = word.toCharArray();
//        for (int i = 0; i < array.length / 2; i++) {
//            char temp = array[i];
//            array[i] = array[array.length - 1 - i];
//            array[array.length - 1 - i] = temp;
//        }
//        String result = new String(array);
//        System.out.println(result);
//
//        System.out.println(String.valueOf(array));

        String name = "seva";
//        System.out.println(name.length());
//        System.out.println(name.charAt(0));
//        System.out.println(name.toCharArray());
//        System.out.println(name.toUpperCase(Locale.ROOT));
//        System.out.println(name.substring(2, name.length() - 1));
        System.out.println(name.concat("sofa"));// потом удалит Garbage collector так как нет ссылки, т е переменной

        int[] a = {1, 2, 3, 4, 5};
        char[] b = {'a', 's', 'd'};
        System.out.println(a);
        System.out.println(b); //специальная перегрузка метода println(). выводит все символы подряд как готовую строку а не ссылку на обьект

         /*
        valueOf()
        equals()
        compareTo()
        +
        replace()
        replace(CharSequence target, CharSequence replacement)
        replaceAll()
        replaceFirst()
        indexOF()
        lastIndexOf()
        startWith()
        endsWith()
        trim()
        format()
        split()
        matches()
        isEmpty()
         */


    }
}



