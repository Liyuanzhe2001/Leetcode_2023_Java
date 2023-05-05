package com.lyz.code;

import com.lyz.code.dataStructure.ListNode;

import java.util.ArrayList;
import java.util.List;

public class main_1171 {

    public static void main(String[] args) {

    }

    public ListNode removeZeroSumSublists(ListNode head) {
        if (head == null) {
            return null;
        }
        int sum = 0;
        for (ListNode node = head; node != null; node = node.next) {
            sum += node.val;
            if (sum == 0) {
                return removeZeroSumSublists(node.next);
            }
        }
        head.next = removeZeroSumSublists(head.next);
        return head;
    }

}
