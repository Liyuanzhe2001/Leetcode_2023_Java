package com.lyz.code;

import com.lyz.code.dataStructure.ListNode;

/**
 * @author lkunk
 * @date 2023年07月21日 22:22
 * @description
 */

public class offer_52 {
    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode headOne = headA;
        ListNode headTwo = headB;
        while (headA != headB) {
            headA = headA == null ? headTwo : headA.next;
            headB = headB == null ? headOne : headB.next;
        }
        return headA;
    }
}
