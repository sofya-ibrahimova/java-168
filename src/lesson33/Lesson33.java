package lesson33;

public class Lesson33 {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    }

    public static int sum(int a, int b) {
        int sum = a + b;
        if (a + b > 0) return sum;
        System.out.println("testing");
        return Math.abs(sum);
    }
    }

