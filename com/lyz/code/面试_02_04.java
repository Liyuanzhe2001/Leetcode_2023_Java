package com.lyz.code;

import com.lyz.code.dataStructure.ListNode;

public class 面试_02_04 {

    public static void main(String[] args) {

    }

    public ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode();
        ListNode leftNode = left;
        ListNode right = new ListNode();
        ListNode rightNode = right;
        while (head != null) {
            if (head.val < x) {
                left.next = new ListNode(head.val);
                left = left.next;
            } else {
                right.next = new ListNode(head.val);
                right = right.next;
            }
            head = head.next;
        }
        left.next = rightNode.next;
        return leftNode.next;
    }

}
