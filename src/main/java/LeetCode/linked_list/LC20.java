package LeetCode.linked_list;

import java.util.Stack;

public class LC20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] array = s.toCharArray();{
            for(char c : array){
                if(checkOpen(c)){
                    stack.push(c);
                }else {
                    if(stack.empty() || stack.peek() != getPair(c)){
                        return false;
                    }else {
                        stack.pop();
                    }
                }
            }
        }
        return stack.empty();
    }

    private char getPair(char c){
        switch (c){
            case ')':
                return '(';
            case '}':
                return '{';
            case ']':
                return '[';
            default:
                return '\0';
        }
    }

    private boolean checkOpen(char c){
        return c=='{' || c=='(' || c == '[';
    }
}
