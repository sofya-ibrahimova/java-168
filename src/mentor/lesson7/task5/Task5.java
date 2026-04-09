package mentor.lesson7.task5;

public class Task5 {
    public static void main(String[] args) {

        Calculator sum = Integer::sum;
        System.out.println( sum.calculate(3,4));
        Calculator raznost = (a, b) ->  a-b;
        System.out.println(raznost.calculate(20, 26));
        Calculator proizvedeniye = (a, b) -> a*b;
        System.out.println(proizvedeniye.calculate(3, 10));
        Calculator otnoseniye = (a, b) -> a/b;
        System.out.println(otnoseniye.calculate(6, 3));


    }

}