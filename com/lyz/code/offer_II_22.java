package com.lyz.code;

import com.lyz.code.dataStructure.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lkunk
 * @date 2023年07月18日 23:13
 * @description
 */

public class offer_II_22 {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (!set.add(head)) {
                return head;
            }
            head = head.next;
        }
        return null;
    }
}
