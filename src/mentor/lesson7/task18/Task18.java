package mentor.lesson7.task18;

public class Task18 {
    public static void main(String[] args) {

        NumberChecker numberChecker1 = number -> number > 0;
        System.out.println(numberChecker1.check(54));
        NumberChecker numberChecker2 = number -> number % 2 == 0;
        System.out.println(numberChecker2.check(11));
        NumberChecker numberChecker3 = number -> number >10;
        System.out.println(numberChecker3.check(10));
    }
}
