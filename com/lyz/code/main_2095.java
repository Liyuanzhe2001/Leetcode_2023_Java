package com.lyz.code;

import com.lyz.code.dataStructure.ListNode;

public class main_2095 {

    public static void main(String[] args) {

    }

    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null) {
            return null;
        }
        ListNode slowNode = head;
        ListNode quickNode = head;
        ListNode pre = slowNode;

        while (quickNode.next.next != null) {
            quickNode = quickNode.next.next;
            pre = slowNode;
            slowNode = slowNode.next;
        }
        pre.next = pre.next.next;
        return head;
    }

}
