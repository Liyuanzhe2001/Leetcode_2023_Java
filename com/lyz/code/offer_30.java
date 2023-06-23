package com.lyz.code;

import java.util.Stack;

public class offer_30 {
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
            minStack.add(Math.min(minStack.peek(), x));
        }

        public void pop() {
            stack.pop();
            minStack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int min() {
            return minStack.peek();
        }
    }
}
