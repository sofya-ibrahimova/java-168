public class MentorLesson2 {
    public static void main(String[] args) {

    }

    public static int makeNegative(final int x) {
        if (x <= 0) return x;
        return -x;
    }

    public static String evenOrOdd(int number) {     // even - четные     odd - нечетные
        if (number % 2 == 0) return "Even";
        return "Odd";
    }

    public static Double multiply(Double a, Double b) {
        return a * b;
    }

    public static String booleanToWord (boolean b) {
        if (b) return "Yes";
        return "No";
    }
    public static int opposite (int number){
        if (number == 0) return number;
        return -number;
    }
}
