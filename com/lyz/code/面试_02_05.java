package com.lyz.code;

import com.lyz.code.dataStructure.ListNode;

public class 面试_02_05 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode res = head;
        boolean flag = false;
        while (l1 != null || l2 != null) {
            head.next = new ListNode();
            head.next.val = flag ? 1 : 0;
            if (l1 != null && l2 != null) {
                head.next.val += l1.val + l2.val;
            } else if (l1 != null) {
                head.next.val += l1.val;
            } else {
                head.next.val += l2.val;
            }
            flag = head.next.val >= 10;
            head.next.val = head.next.val % 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
            head = head.next;
        }
        if (flag) {
            head.next = new ListNode(1);
        }
        return res.next;
    }

}
