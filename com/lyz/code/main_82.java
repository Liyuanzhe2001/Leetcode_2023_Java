package com.lyz.code;

import com.lyz.code.dataStructure.ListNode;

import java.util.TreeMap;

public class main_82 {

    public static void main(String[] args) {
//        1,2,3,3,4,4,5
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(4);
        ListNode node7 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        ListNode listNode = new main_82().deleteDuplicates(node1);
        while (listNode != null) {
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        int[] nums = new int[201];
        while (head != null) {
            nums[head.val + 100]++;
            head = head.next;
        }
        ListNode root = new ListNode();
        ListNode res = root;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                root.next = new ListNode(i - 100);
                root = root.next;
            }
        }
        return res.next;
    }
}
