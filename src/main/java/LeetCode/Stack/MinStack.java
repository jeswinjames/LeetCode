package LeetCode.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class MinStack {

    private Deque<Integer> stack;
    private Deque<Integer> minStack;

    /** initialize your data structure here. */
    public MinStack() {
        this.stack = new ArrayDeque<>();
        this.minStack = new ArrayDeque<>();
    }

    public void push(int x) {
        if(minStack.isEmpty() || x <= getMin()){
            minStack.push(x);
        }
        stack.push(x);

    }

    public void pop() {
        int val = stack.pop();
        if(val == getMin()){
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

