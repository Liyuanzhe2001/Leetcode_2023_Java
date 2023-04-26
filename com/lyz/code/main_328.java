package com.lyz.code;

import com.lyz.code.dataStructure.ListNode;

import java.util.List;

public class main_328 {

    public static void main(String[] args) {

    }

    public ListNode oddEvenList(ListNode head) {
        ListNode lef = new ListNode();
        ListNode lefHead = lef;
        ListNode rig = new ListNode();
        ListNode rigHead = rig;

        boolean flag = true;
        while (head != null) {
            if (flag) {
                lef.next = new ListNode(head.val);
                lef = lef.next;
            }else {
                rig.next = new ListNode(head.val);
                rig = rig.next;
            }
            flag = !flag;
            head = head.next;
        }
        lef.next = rigHead.next;
        return lefHead.next;
    }

}
