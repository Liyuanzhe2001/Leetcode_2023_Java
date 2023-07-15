package com.lyz.code;

import com.lyz.code.dataStructure.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author lkunk
 * @date 2023年07月15日 23:16
 * @description
 */

public class offer_027 {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int lef = 0;
        int rig = list.size() - 1;
        while (lef < rig) {
            if (!Objects.equals(list.get(lef), list.get(rig))) {
                return false;
            }
            lef++;
            rig--;
        }
        return true;
    }
}
