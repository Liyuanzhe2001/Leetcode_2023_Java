package com.lyz.code;

import com.lyz.code.dataStructure.ListNode;

public class 面试_02_07 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode nodeA = new ListNode();
        nodeA = headA;
        ListNode nodeB = new ListNode();
        nodeB = headB;
        while (headA != headB) {
            headA = headA == null ? nodeA : headA.next;
            headB = headB == null ? nodeB : headB.next;
        }
        return headA;
    }
}
