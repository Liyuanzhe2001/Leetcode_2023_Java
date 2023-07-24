package com.lyz.code;

import com.lyz.code.dataStructure.ListNode;

/**
 * @author lkunk
 * @date 2023年07月24日 17:26
 * @description
 */

public class offer_18 {
    public ListNode deleteNode(ListNode head, int val) {
        if (head.val == val) {
            return head.next;
        }
        ListNode pre = head;
        for (ListNode tmp = head.next; tmp != null; tmp = tmp.next) {
            if (tmp.val == val) {
                pre.next = tmp.next;
                break;
            }
            pre = pre.next;
        }
        return head;
    }
}
