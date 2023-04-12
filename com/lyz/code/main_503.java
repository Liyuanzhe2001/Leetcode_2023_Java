package com.lyz.code;

import java.util.Arrays;
import java.util.Stack;

public class main_503 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(new main_503().nextGreaterElements(nums)));
    }

    class N {
        public N(int index, int value) {
            this.index = index;
            this.value = value;
        }

        int index;
        int value;
    }

    public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        int len = nums.length;
        boolean[] visit = new boolean[nums.length];
        Stack<N> stack = new Stack<>();
        for (int i = 0; i < len * 2; i++) {
            if (stack.isEmpty()) {
                stack.push(new N(i % len, nums[i % len]));
            } else {
                while (!stack.isEmpty() && stack.peek().value < nums[i % len]) {
                    N n = stack.pop();
                    res[n.index] = nums[i % len];
                    visit[n.index] = true;
                }
                stack.push(new N(i % len, nums[i % len]));
            }
        }
        while (!stack.isEmpty()) {
            N n = stack.pop();
            if (!visit[n.index]) {
                res[n.index] = -1;
            }
        }
        return res;
    }

}
