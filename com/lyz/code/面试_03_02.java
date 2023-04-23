package com.lyz.code;

import java.util.*;

public class 面试_03_02 {
}

class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;


    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
        minStack.add(Integer.MAX_VALUE);
    }

    public void push(int x) {
        stack.add(x);
        minStack.add(Math.min(x, minStack.peek()));
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
