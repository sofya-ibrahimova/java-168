package lesson23;

public class PrimitiveWrappedMethods {

    public static void sum(int a) {
        long start = System.nanoTime();
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += a;
        }
        long end = System.nanoTime();
        System.out.println(sum);
        System.out.println("Primitive type working time: " + (end - start));
    }

    public static void sum(Integer a) {
        long start = System.nanoTime();
        Integer sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += a;
        }
        long end = System.nanoTime();
        System.out.println(sum);
        System.out.println("Non primitive type working time: " + (end - start));;
    }


}