package com.lyz.code;

import com.lyz.code.dataStructure.ListNode;

public class main_1721 {

    public static void main(String[] args) {

    }

    public ListNode swapNodes(ListNode head, int k) {
        int len = 0;
        for (ListNode tmp = head; tmp != null; tmp = tmp.next, len++) ;
        int i = 0;
        ListNode pre = null;
        ListNode aft = null;
        for (ListNode tmp = head; tmp != null; i++, tmp = tmp.next) {
            if (i == k) {
                pre = tmp;
            } else {
                aft = tmp;
            }
        }
        int tmp = pre.val;
        pre.val = aft.val;
        aft.val = tmp;
        return head;
    }

}
