public class MentorLesson3 {
    public static void main(String[] args) {
   String s ="5";
   char ch= s.charAt(0);
    //    System.out.println(ch - '0');

       int a =  Integer.parseInt("1");
       Integer b = Integer.valueOf("010101", 16);
        System.out.println(b);
    }

    public static int squareSum(int[] n) {
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum += n[i] * n[i];

        }
        return sum;
    }

    public static String repeatStr(final int repeat, final String string) {
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            newString.append(string);
        }
        return newString.toString();
    }

    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;

        for (int i = 0; i < arrayOfSheeps.length; i++) {
            if (arrayOfSheeps[i] != null && arrayOfSheeps[i] == true) {
                count++;
            }
        }
        return count;
    }

    public static int findSmallestInt(int[] args) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < args.length; i++) {
            if (args[i] < min) min = args[i];
        }
        return min;
    }

    public static String remove(String str) {
        StringBuilder newString = new StringBuilder();
        for (int i = 1; i < str.length() - 1; i++) {
            newString.append(str.charAt(i));
        }
        return newString.toString();
    }
        //
        public static int stringToNumber(String str) {
        return Integer.parseInt(str);
        }



//    public static int stringToNumber(String str) {
//        int number = 0;
//        int i = 0;
//        if (str.charAt(0) == '-') {
//            i++;
//        }
//        for (; i < str.length(); i++) {
//            number = number * 10 + str.charAt(i) - '0';
//        }
//        if (str.charAt(0) == '-') return -number;
//        return number;
//    }

}