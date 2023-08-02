package com.lyz.code.lc_队列_栈;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author lkunk
 * @date 2023年08月02日 23:19
 * @description
 */

public class lc_用队列实现栈 {
    class MyStack {

        Queue<Integer> queue1;
        Queue<Integer> queue2;

        public MyStack() {
            queue1 = new LinkedList<>();
            queue2 = new LinkedList<>();
        }

        public void push(int x) {
            while (!queue1.isEmpty()) {
                queue2.add(queue1.poll());
            }
            queue1.add(x);
            while (!queue2.isEmpty()) {
                queue1.add(queue2.poll());
            }
        }

        public int pop() {
            return queue1.poll();
        }

        public int top() {
            return queue1.peek();
        }

        public boolean empty() {
            return queue1.isEmpty();
        }
    }

}
