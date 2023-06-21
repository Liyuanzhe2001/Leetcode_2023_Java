package com.lyz.code;

import com.lyz.code.dataStructure.ListNode;

public class 面试_02_02 {
    public int kthToLast(ListNode head, int k) {
        int len = 0;
        for (ListNode tmp = head; tmp != null; tmp = tmp.next, len++) ;
        while (len != k) {
            head = head.next;
            len--;
        }
        return head.val;
    }
}
