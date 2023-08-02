package com.lyz.code.lc_队列_栈;

import java.util.Stack;

/**
 * @author lkunk
 * @date 2023年08月02日 23:14
 * @description
 */

public class lc_用栈实现队列 {
    class MyQueue {

        Stack<Integer> stackIn;
        Stack<Integer> stackOut;

        public MyQueue() {
            stackIn = new Stack<>();
            stackOut = new Stack<>();
        }

        public void push(int x) {
            stackIn.push(x);
        }

        public int pop() {
            fillStackOut();
            return stackOut.pop();
        }

        public int peek() {
            fillStackOut();
            return stackOut.peek();
        }

        public boolean empty() {
            return stackIn.isEmpty() && stackOut.isEmpty();
        }

        public void fillStackOut() {
            if (stackOut.isEmpty()) {
                while (!stackIn.isEmpty()) {
                    stackOut.push(stackIn.pop());
                }
            }
        }

    }

}
