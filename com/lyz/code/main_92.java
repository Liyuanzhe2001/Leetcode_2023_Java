package com.lyz.code;

import com.lyz.code.dataStructure.ListNode;
import com.lyz.code.util.Util;

public class main_92 {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(5);
//        ListNode node3 = new ListNode(3);
//        ListNode node4 = new ListNode(4);
//        ListNode node5 = new ListNode(5);
        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
        int left = 1;
        int right = 2;
        ListNode listNode = new main_92().reverseBetween(node1, left, right);
        Util.printListNode(listNode);
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        int n = 1;
        ListNode tmp;
        ListNode lef = new ListNode();
        lef.next = head;

        ListNode leftNode;
        leftNode = lef;

        ListNode rigNode = new ListNode();

        while (n <= right) {
            if (n > left) {
                tmp = new ListNode(head.val);
                tmp.next = lef.next;
                lef.next = tmp;
            } else if (n == left) {
                rigNode = head;
            } else {
                lef = head;
            }
            head = head.next;
            n++;
        }
        rigNode.next = head;
        return leftNode.next;
    }

}
