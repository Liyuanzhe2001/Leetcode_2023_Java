package com.lyz.code;

import com.lyz.code.dataStructure.ListNode;

public class main_61 {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
//        ListNode node3 = new ListNode(3);
//        ListNode node4 = new ListNode(4);
//        ListNode node5 = new ListNode(5);
        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
        ListNode listNode = new main_61().rotateRight(node1, 1);
        while (listNode != null) {
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
        System.out.println();
    }


    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        int len = 1;
        ListNode root;
        root = head;
        while (head.next != null) {
            len++;
            head = head.next;
        }
        head.next = root;
        head = root;

        k = len - k % len;
        int n = 0;
        while (head != null) {
            n++;
            if (n == k) {
                root = head.next;
                head.next = null;
                break;
            }
            head = head.next;
        }
        return root;
    }

}
