package com.lyz.code;

import com.lyz.code.dataStructure.ListNode;

public class main_2074 {

    ListNode pre = null;
    ListNode next = null;

    public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode root;
        root = head;
        int sum = 1;
        int len = 0;
        int index = 0;
        for (ListNode tmp = head; tmp != null; tmp = tmp.next, len++) ;
        while (head != null) {
            if (sum % 2 == 0 || (sum > len - index && (len - index) % 2 == 0)) {
                pre = null;
                next = null;
                head.next = reverse(head.next, sum);
                while (head.next != null) {
                    head = head.next;
                }
                head.next = next;
                head = head.next;
            } else {
                for (int i = 1; i < sum && head != null; i++) {
                    head = head.next;
                }
            }
            index += sum;
            sum++;
        }
        return root;
    }

    public ListNode reverse(ListNode node, int sum) {
        if (sum == 1 || node.next == null) {
            next = node.next;
            node.next = pre;
            return node;
        }
        ListNode nextNode;
        nextNode = node.next;
        node.next = pre;
        pre = node;
        return reverse(nextNode, sum - 1);
    }

}
