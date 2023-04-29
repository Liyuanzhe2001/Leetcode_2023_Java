package com.lyz.code;

import com.lyz.code.dataStructure.ListNode;
import com.lyz.code.util.Util;

public class main_1669 {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        ListNode node7 = new ListNode(1000000);
        ListNode node8 = new ListNode(1000001);
        ListNode node9 = new ListNode(1000002);
        node7.next = node8;
        node8.next = node9;
        ListNode listNode = new main_1669().mergeInBetween(node1, 3, 4, node7);
        Util.printListNode(listNode);
    }

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode root;
        root = list1;
        ListNode leftNode = new ListNode();
        ListNode rightNode = new ListNode();
        int n = 0;
        while (list1 != null) {
            if (n == a - 1) {
                leftNode = list1;
            }
            if (n == b + 1) {
                rightNode = list1;
                break;
            }
            list1 = list1.next;
            n++;
        }
        leftNode.next = list2;
        for (; list2.next != null; list2 = list2.next) ;
        list2.next = rightNode;
        return root;
    }

}
