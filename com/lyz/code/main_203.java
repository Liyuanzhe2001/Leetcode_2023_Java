package com.lyz.code;

import com.lyz.code.dataStructure.ListNode;

public class main_203 {

    public static void main(String[] args) {

    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode root = new ListNode();
        root.next = head;
        ListNode pre;
        pre = root;
        while (head != null) {
            if (head.val == val) {
                pre.next = head.next;
            }else {
                pre = pre.next;
            }
            head = head.next;
        }
        return root.next;
    }

}
