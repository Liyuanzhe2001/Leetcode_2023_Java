package com.lyz.code;

import java.util.Stack;

/**
 * @author lkunk
 * @date 2023年07月07日 21:26
 * @description
 */

public class main_739 {

    class Node {
        int index;
        int val;

        public Node(int index, int val) {
            this.index = index;
            this.val = val;
        }
    }

    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Node> stack = new Stack<>();
        int[] res = new int[temperatures.length];
        stack.add(new Node(0, temperatures[0]));
        for (int i = 1; i < temperatures.length; i++) {
            while (!stack.isEmpty() && stack.peek().val < temperatures[i]) {
                Node node = stack.pop();
                res[node.index] = i - node.index;
            }
            stack.add(new Node(i, temperatures[i]));
        }
        return res;
    }
}
