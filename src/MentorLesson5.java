public class MentorLesson5 {
    public static void main(String[] args) {



    }

    public static String noSpace(final String x) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) != ' ') {
                str.append(x.charAt(i));
            }
        }
        return str.toString();
    }
//    public static String convert(boolean b) {
//        return String.valueOf(b);
    // return b + " ";

    String word(String string) {
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char s = string.charAt(i);
            if (s != 'a' && s != 'e' && s != 'o' && s != ' ') {
                newString.append(string.charAt(i));
            }
        }
        return newString.toString();
    }


    //homework
//    public static Integer basicMath(String op, int v1, int v2) {
//        return switch (op) {
//            case "+" -> v1 + v2;
//            case "-" -> v1 - v2;
//            case "*" -> v1 * v2;
//            case "/" -> v1 / v2;
//            default -> 0;
//        };
//    }

    public static int liters(double time) {
        return (int) (time * 0.5);
    }

    public static int century(int number) {
        if (number % 100 != 0) return number / 100 + 1;
        return number / 100;
    }

    public static double sum(double[] numbers) {
        double sum = 0;
        for (double x : numbers) {
            sum += x;
        }
        return sum;

    }
}

