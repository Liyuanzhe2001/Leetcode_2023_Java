package com.lyz.code;

import com.lyz.code.dataStructure.ListNode;

import java.util.ArrayList;
import java.util.List;

public class 面试_02_06 {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int lef = 0;
        int rig = list.size() - 1;
        while (lef < rig) {
            if (!list.get(lef++).equals(list.get(rig--))) {
                return false;
            }
        }
        return true;
    }
}
