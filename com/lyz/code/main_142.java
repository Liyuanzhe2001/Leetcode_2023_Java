package com.lyz.code;

import com.lyz.code.dataStructure.ListNode;

import java.util.HashSet;
import java.util.Set;

public class main_142 {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while(head!=null) {
            if(!set.add(head)){
                return head;
            }
            head = head.next;
        }
        return null;
    }
}
