import org.apache.commons.compress.harmony.pack200.NewAttributeBands;

import java.util.*;
import java.util.concurrent.Callable;

public class HackerRank {

    public static void main(String[] args) {
        List<Integer> list = List.of(-3,-2,-1);
        System.out.println(binarySearch(list, -2));
     ;

    }


    public static int countResponseTimeRegressions(List<Integer> responseTimes) {
        int count = 0;
        double sum = 0;
        for (int i = 0; i < responseTimes.size(); i++) {
            if (i != 0) {
                double average = sum / (double) i;
                if (responseTimes.get(i) > average) {
                    count++;
                }
            }
            sum += responseTimes.get(i);
        }
        return count;
    }

    // [2,3,1,5,6]
    public static int findSmallestMissingPositive(List<Integer> orderNumbers) {  //НЕ РАБОТАЕТ :))
        if (orderNumbers.isEmpty()) return 1;
        Integer min = orderNumbers.get(0);
        for (int i = 1; i < orderNumbers.size(); i++) {
            if (orderNumbers.get(i) > 0 && orderNumbers.get(i) < min) {
                min = orderNumbers.get(i);
            }
            orderNumbers.remove(i - 1);
        }
        if (min == null) {
            return 1;
        }
        return min + 1;
    }

    public static int binarySearch(List<Integer> nums, int target) {
        if (nums.isEmpty()) return -1;
        int start = 0;
        int end = nums.size();
        while (true) {
            int index = (end + start - 1) / 2;
            if (nums.get(index) == target) return index;
            if (start == end) return -1;
            if (nums.get(index) < target) {
                start = index + 1;
            } else if (nums.get(index) > target) {
                end = index - 1;
            }
        }
    }
//prices = [1, 2, 3, 4, 5]
//budget = 7
    public static int countAffordablePairs(List<Integer> prices, int budget) {
        int count = 0;
        for (int i = 0; i < prices.size()-1; i++){
            for (int j = i+1; j < prices.size(); j++  ){
                if (prices.get(i) + prices.get(j) <= budget ){
                    count++;
                }
            }
        }return count;
    }

    class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;
    }
//    [1,2,2,3,4,4,4,5,5]
//    public static SinglyLinkedListNode deleteDuplicates(SinglyLinkedListNode head) {
//        SinglyLinkedListNode a = head;
//        while (head.next != null){
//            if (head.data == head.next.data){
//                head.next = head.next.next;
//            }
//                head = head.next;
//        }
//
//    }
}


