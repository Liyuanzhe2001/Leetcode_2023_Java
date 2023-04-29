package com.lyz.code;

import com.lyz.code.dataStructure.ListNode;

public class main_147 {

    public static void main(String[] args) {

    }

    public ListNode insertionSortList(ListNode head) {
        ListNode root = new ListNode();
        while (head != null) {
            ListNode next = head.next;
            ListNode leftNode = root;
            while (leftNode.next != null && leftNode.next.val < head.val) {
                leftNode = leftNode.next;
            }
            head.next = leftNode.next;
            leftNode.next = head;
            head = next;
        }
        return root.next;
    }
}
