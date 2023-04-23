package com.lyz.code;

import com.lyz.code.dataStructure.ListNode;

import java.util.Stack;

public class main_445 {

    public static void main(String[] args) {
        // l1 = [7,2,4,3], l2 = [5,6,4]
        ListNode node1 = new ListNode(7);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(4);
        node5.next = node6;
        node6.next = node7;
        ListNode listNode = new main_445().addTwoNumbers(node1, node5);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        while (l1 != null) {
            stack1.add(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            stack2.add(l2.val);
            l2 = l2.next;
        }
        ListNode root = new ListNode();
        int val = 0;
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            if (!stack1.isEmpty()) {
                val += stack1.pop();
            }
            if (!stack2.isEmpty()) {
                val += stack2.pop();
            }
            ListNode node = new ListNode(val % 10);
            node.next = root.next;
            root.next = node;
            if (val < 10) {
                val = 0;
            } else {
                val = 1;
            }
        }
        if(val == 1) {
            ListNode node = new ListNode(1);
            node.next = root.next;
            root.next = node;
        }
        return root.next;
    }

}
