public class MyMath {


    static int minimumTwo(int a, int b) {
        if (a < b) return a;
        return b;
    }


    static int maximum(int a, int b) {
        if (a > b) return a;
        return b;
    }

    static int power(int number, int power) {
        int power1 = 1;
        for (int i = 0; i < power; i++) {
            power1 *= number;
        } return power1;
    }

    static int faktorial1(int number) {
        int faktorial = 1;
        for (int i = number; i > 0; i--) {
            faktorial *= i;
        }
        return faktorial;
    }

    static int mySqrt1(int x) {//переделать
        int n = 0;
        while (n < x / 2) {
            if (n * n == x) return n;
            if (n * n < x && ((long) (n + 1) * (n + 1)) > x) return n;
            n++;
        }
        return n;

    }
}


