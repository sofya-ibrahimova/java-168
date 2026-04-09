import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//            if (i >= 5 && i <= 8) {  //оба условия должны быть true (пересечение)
//                break;
//            }
//        }
//        System.out.println("------");
//        int count = 0;
//        a:
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                if (i == 5) {
//                    break a;  //завершает внешний цикл i
//                }
//                count++;
//            }
//        }
//        System.out.println(count);
//
//        System.out.println("-------");
//
//        int count1 = 0;
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                if (i == 5) {
//                    break;  //завершает цикл j для i=5
//                }
//                count1++;
//            }
//        }
//        System.out.println(count1);
//
//        System.out.println("-----");
//
//        for (int i = 2; i < 10; i++) {
//            for (int j = 2; j <= i/2; j++) {
//                if (i % j == 0) {
//                    System.out.println(i);
//                    break;
//                }
//            }
//
//        }
//        System.out.println("----");

//        for (int i = 2; i < 10; i++) {
//            boolean isPrime = true;
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0){
//                    isPrime = false;
//                    break; // чтобы не было лишних итераций
//                }
//            }
//            if (isPrime)
//                System.out.println(i);
//        }
//
//        System.out.println("-------");

        int aSqr = 1;
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int j = 0; j < b; j++) {
            aSqr *= a;
        }
        System.out.println(a + " в степени " + b + " = " + aSqr);


        for (int i = 4; i < 10; i++) {
            boolean isCompositeDivided3 = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0 && i % 3 == 0) {
                    isCompositeDivided3 = true;
                    break;
                }
            }
            if (isCompositeDivided3) {
                int factorial = 1;
                for (int k = i; k >= 1; k--) {
                    factorial *= k;
                }
                System.out.println(factorial);
            }
        }
    }
}


