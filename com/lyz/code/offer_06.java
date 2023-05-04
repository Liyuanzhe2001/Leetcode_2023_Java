package com.lyz.code;

import com.lyz.code.dataStructure.ListNode;

import java.util.Stack;

public class offer_06 {

    public static void main(String[] args) {

    }

    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.add(head.val);
            head = head.next;
        }
        int[] res = new int[stack.size()];
        int index = 0;
        while (!stack.isEmpty()) {
            res[index++] = stack.pop();
        }
        return res;
    }

}
