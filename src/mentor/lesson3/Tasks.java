package mentor.lesson3;

import java.util.Arrays;

public class Tasks {
    public static void main(String[] args) {
//        System.out.println(Tasks.isPalindromeWithStringBuilder(" "));

        System.out.println(Tasks.isAnagrams("helo", "olleh"));
    }

    static boolean isPalindrome(String word) {
        if (word.isBlank()) return false;
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    static boolean isPalindromeWithStringBuilder(String word) {
        if (word.isBlank()) return false;
        String reversed = new StringBuilder().append(word).reverse().toString(); // REVERSE
        return reversed.equals(word);
    }

    static boolean isAnagrams(String word1, String word2) {
        char[] words1 = word1.toCharArray();
        char[] words2 = word2.toCharArray();
        Arrays.sort(words1);
        Arrays.sort(words2);
        return Arrays.equals(words1, words2);
    }
}


