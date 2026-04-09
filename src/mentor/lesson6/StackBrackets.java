package mentor.lesson6;

import java.util.Stack;

public class StackBrackets {
    public static void main(String[] args) {

        System.out.println(StackBrackets.stackBrackets("((()))"));


    }


    public static boolean stackBrackets(String brackets) {
        char[] array = brackets.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '(') {
                stack.push(array[i]);
            } else if (array[i] == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        if (stack.isEmpty()) return true;
        return false;
    }
}