package main.java;

import java.util.Stack;

public class ValidateParenthesis {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!stack.isEmpty() && ((ch == ']' && stack.peek().equals('[')) || (ch == ')' && stack.peek().equals('(')) || (ch == '}' && stack.peek().equals('{')))) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();

    }

    public static void main(String[] args) {
        System.out.println(isValid("){"));
    }
}
