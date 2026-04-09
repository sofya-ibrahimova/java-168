package algorithms;

import java.math.BigInteger;

public class CodeWars {
    public static String add(String a, String b) {
        char[] number1 = a.toCharArray();                   // insert(0, sum),  replaceFirst(),
        char[] number2 = b.toCharArray();
        int max;
        if (a.length() >= b.length()) {
            max = a.length();
        } else {
            max = b.length();
        }
        int[] result = new int[max + 1];
        int k = 0;
        for (int i = 0; i < max; i++) {
            if (i < number1.length && i < number2.length) {
                int sum = number1[number1.length - i - 1] - '0' + number2[number2.length - i - 1] - '0';
                result[result.length - i - 1] += (sum + k) % 10;
                k = (sum + k) / 10;
            } else {
                if (i < number1.length) {
                    result[result.length - i - 1] += (number1[number1.length - i - 1] - '0' + k) % 10;
                    k = (number1[number1.length - i - 1] - '0' + k) / 10;
                } else {
                    result[result.length - i - 1] += (number2[number2.length - i - 1] - '0' + k) % 10;
                    k = (number2[number2.length - i - 1] - '0' + k) / 10;
                }
            }
        }
        if (k != 0) result[result.length - max - 1] = k;
        StringBuilder res = new StringBuilder();
        if (result[0] == 0 && result[1] == 0) {
            for (int i = 2; i < result.length; i++) {
                res.append(result[i]);
            }
        } else if (result[0] == 0) {
            for (int i = 1; i < result.length; i++) {
                res.append(result[i]);
            }
        } else {
            for (int i = 0; i < result.length; i++) {
                res.append(result[i]);
            }
        }
        return res.toString();
    }

    public static BigInteger sumOfSums(int n) {
        BigInteger a = BigInteger.valueOf(n);
// n(n+1)(n+2)/6
        BigInteger s = a
                .multiply(a.add(BigInteger.ONE))
                .multiply(a.add(BigInteger.TWO))
                .divide(BigInteger.valueOf(6));
        // s(s+1)/2
        return s.multiply(s.add(BigInteger.ONE)).divide(BigInteger.TWO);
    }

    //  stress   moon-men  apple
//    public static String firstNonRepeatingLetter(String s) {
//        int[] num = new int[127];
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) - 96 > 0) {
//                num[s.charAt(i) - 96] += s.charAt(i) - 96;
//            }
//            if (s.charAt(i) - 64 > 0 && s.charAt(i) - 64 < num.length) {
//                num[s.charAt(i) - 64] += s.charAt(i) - 64;
//            }
//        }
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) - 96 > 0){
//            if (s.charAt(i) - 96 == num[s.charAt(i) - 96]) {
//                return String.valueOf(s.charAt(i));
//            }
//            }
//            if (s.charAt(i) - 64 < num.length && s.charAt(i) - 64 > 0) {
//                if (s.charAt(i) - 64 == num[s.charAt(i) - 64]) {
//                    return String.valueOf(s.charAt(i));
//                }
//            }
//        }
//        return "";
//    }

    //    public static String firstNonRepeatingLetter(String s) {
//
//    }
// 1 2 3 4 5 6
    public static String getMiddle(String word) {
        if (word.length() % 2 == 0) {
            return "" + word.charAt(word.length() / 2 - 1) + word.charAt(word.length() / 2);
        }
        return "" + word.charAt(word.length() / 2);
    }

//    public static boolean getXO (String str) {
//
//        // Good Luck!!
//
//    }

    public static int findIt(int[] a) {
        int odd = a[0];
        for (int i = 1; i < a.length; i++) {
            odd ^= a[i];
        }
        return odd;
    }

    public static boolean isValid(char[] walk) {
        int NorthAndSouth = 0;
        int EastAndWest = 0;
        for (int i = 0; i < walk.length; i++) {
            if (walk[i] == 'n' || walk[i] == 's') {
                NorthAndSouth += walk[i];
            } else if (walk[i] == 'e' || walk[i] == 'w') {
                EastAndWest += walk[i];
            }
        }
        return NorthAndSouth % 225 == 0 && EastAndWest % 220 == 0 && walk.length == 10;
    }


    public static long sumTwoSmallestNumbers(long[] numbers) {
        long min1 = Long.MAX_VALUE;
        long min2 = Long.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min1) {
                min2 = min1;
                min1 = numbers[i];
            } else if (numbers[i] <= min2) {
                min2 = numbers[i];
            }
        }
        return min1 + min2;
    }

    public static boolean solution(String str, String ending) {
        if (ending.isEmpty() || str.isEmpty() || ending.length() > str.length()) return false;
        for (int i = 0; i < ending.length(); i++) {
            if (str.charAt(str.length() - i - 1) != ending.charAt(ending.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static int findShort(String s) {

        return 0;
    }

    // 148
    public static int digital_root(int n) {
        int a = 0;
        while (n > 0) {
            a += n % 10;
            n /= 10;
        }
        return a / 10 > 0 ? digital_root(a) : a;
    }

//    public static String walk(int[][] maze, String[] directions) {
//
//        return "";
//    }
}



