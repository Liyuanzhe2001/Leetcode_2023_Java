package com.lyz.code;

import com.lyz.code.dataStructure.ListNode;

/**
 * @author lkunk
 * @date 2023年07月21日 22:12
 * @description
 */

public class offer_II_021 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        for (ListNode tmp = head; tmp != null; tmp = tmp.next, len++) ;
        if (len == n) {
            return head.next;
        }
        ListNode preNode = new ListNode();
        preNode.next = head;
        for (int i = 0; i < len - n; i++, preNode = preNode.next) ;
        preNode.next = preNode.next.next;
        return preNode;
    }
}
