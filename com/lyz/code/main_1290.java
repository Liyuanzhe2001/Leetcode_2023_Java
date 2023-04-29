package com.lyz.code;

import com.lyz.code.dataStructure.ListNode;

public class main_1290 {

    public static void main(String[] args) {

    }

    public int getDecimalValue(ListNode head) {
        StringBuilder s = new StringBuilder();
        while (head != null) {
            s.append(head.val);
            head = head.next;
        }
        return Integer.parseInt(s.toString(), 2);
    }

}
