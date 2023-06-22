package com.lyz.code;

import com.lyz.code.dataStructure.ListNode;

public class offer_22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        int len = 0;
        for (ListNode tmp = head; tmp != null; tmp = tmp.next, len++) ;
        while (len != k) {
            head = head.next;
            len--;
        }
        return head;
    }
}
