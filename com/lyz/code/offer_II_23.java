package com.lyz.code;

import com.lyz.code.dataStructure.ListNode;

import java.util.HashSet;

/**
 * @author lkunk
 * @date 2023年07月18日 23:10
 * @description
 */

public class offer_II_23 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();
        while (headA != null) {
            set.add(headA);
            headA = headA.next;
        }
        while (headB != null) {
            if (set.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }
}
