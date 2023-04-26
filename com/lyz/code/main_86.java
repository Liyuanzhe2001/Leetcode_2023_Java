package com.lyz.code;

import com.lyz.code.dataStructure.ListNode;
import com.lyz.code.util.Util;

public class main_86 {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(2);
        int x = 3;

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        ListNode partition = new main_86().partition(node1, x);
        Util.printListNode(partition);

    }

    public ListNode partition(ListNode head, int x) {
        ListNode lef = new ListNode(0);
        ListNode root = lef;
        ListNode rig = new ListNode(0);
        ListNode rigHead = rig;
        while (head != null) {
            if (head.val < x) {
                lef.next = head;
                lef = lef.next;
            } else {
                rig.next = head;
                rig = rig.next;
            }
            head = head.next;
        }
        rig.next = null;
        lef.next = rigHead.next;
        return root.next;
    }

}
