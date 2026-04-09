public class Palindrome {

    boolean isPalindrome(int n) {
        int original = n;
        int palindrome = 0;
        while (n > 0) {
            palindrome = palindrome * 10 + n % 10;
            n /= 10;
        }
        return original == palindrome;
    }


}
