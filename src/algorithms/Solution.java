package algorithms;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        int[] array = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    array[0] = i;
                    array[1] = j;
                }
            }
        }
        return array;
    }

    public boolean isPalindrome(int x) {
        int reverseNumber = 0;
        int number = x;
        for (; x > 0; x /= 10) {
            reverseNumber = reverseNumber * 10 + x % 10;
        }
        return reverseNumber == number;
    }

    public static int removeDuplicates(int[] nums) {//доработать
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                count++;
                for (int j = i; j < nums.length; j++) {
                    nums[j - 1] = nums[j];
                }
                nums[nums.length - 1] = nums[i - 1];
            }
        }
        return nums.length - count;
    }

    public int removeElement(int[] nums, int val) {
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[a] = nums[i];
                a++;
            }
        }
        return a;
    }
// {4,3,2,8,9}  original = 2

    static public int findFinalValue(int[] nums, int original) {
        boolean found = true;
        while (found) {
            found = false;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == original) {
                    original *= 2;
                    found = true;
                    break;
                }
            }
        }
        return original;
    }

    public int findFinalValue1(int[] nums, int original) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == original) {
                original *= 2;
                i = -1;
            }
        }
        return original;
    }

    static public boolean isPowerOfTwo(int n) {
        if (n == 1) return true;
        if (n <= 0) return false;
        else {
            while (n > 1) {
                if (n % 2 != 0) return false;
                n /= 2;
            }
            return true;
        }
    }

    static public int mySqrt1(int x) {//переделать
        int n = 0;
        while (n < x / 2) {
            if (n * n == x) return n;
            if (n * n < x && ((long) (n + 1) * (n + 1)) > x) return n;
            n++;
        }
        return n;
    }

//  [ 1 2 3 ]     [2 9]    [9 9 9]

    static public int[] plusOne(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            if (digits[digits.length - i - 1] != 9) {
                digits[digits.length - i - 1] += 1;
                return digits;
            }
            if (digits[digits.length - i - 1] == 9 && (i != digits.length - 1)) {
                digits[digits.length - i - 1] = 0;
            }
        }
        int[] newArray = new int[digits.length + 1];
        newArray[0] = 1;
        return newArray;
    }

//[2, 0, 3,0,9 ]    [2, 3, 9 ]

    public void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }
        if (index < nums.length && nums[0] != 0) {
            for (int i = index; i < nums.length; i++) {
                nums[i] = 0;
            }


        }


    }

    static public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }

    //    9
    public int mySqrt(int x) {  //разобрать
        if (x < 2) return x;

        int left = 1;
        int right = x / 2; //4
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;  //2

            if (mid <= x / mid) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    //  [7,1,5,3,6,4]
// [2,1,2,1,0,0,1]    {2,1,2,1,0,1,2}   [3,3,5,0,0,3,1,4]
    public static int maxProfit(int[] prices) { //time limit exceed ...
        int difference = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int a = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
                a = i;
                max = Integer.MIN_VALUE;
            }
            if (prices[i] > max && a < i) {
                max = prices[i];
            }
            if (min != Integer.MAX_VALUE && max != Integer.MIN_VALUE && difference < max - min) difference = max - min;
        }
        return difference;
    }
}


//    public int majorityElement(int[] nums) {

//    }
// if (difference < max - min && min != Integer.MAX_VALUE && max != Integer.MIN_VALUE) {
//                difference = max - min;
//
//           }


//public int romanToInt(String s) {
//    String[] romanNumerals = {"I", "V", "X", "L", "C", "D", "M"};
//    int[] numerals = {1, 5, 10, 50, 100, 500, 1000};
//    for (int i = 2; i < s.length() - 2; i++) {
//        if (s.charAt(i - 2) == 'I') ;
//    }
//}









