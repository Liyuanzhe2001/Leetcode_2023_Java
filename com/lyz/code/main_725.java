package com.lyz.code;

import com.lyz.code.dataStructure.ListNode;

import java.util.Arrays;

public class main_725 {

    public static void main(String[] args) {

    }

    public ListNode[] splitListToParts(ListNode head, int k) {
        int len = 0;
        for (ListNode node = head; node != null; node = node.next, len++) ;
        ListNode[] res = new ListNode[len];
        int[] ll = new int[k];
        Arrays.fill(ll, len / k);
        for (int i = 0; i < len % k; i++) {
            ll[i]++;
        }

        int n = 0;
        int index = 0;
        ListNode tmp = new ListNode();
        while (head != null) {
            if (n == 0) {
                tmp = new ListNode(head.val);
                res[index] = new ListNode();
                res[index] = tmp;
                index++;
            } else if (n < ll[index - 1]) {
                tmp.next = new ListNode(head.val);
                tmp = tmp.next;
            }
            n++;
            if (n == ll[index - 1]) {
                n = 0;
            }
            head = head.next;
        }
        return res;
    }

}
