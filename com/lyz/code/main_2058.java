package com.lyz.code;

import com.lyz.code.dataStructure.ListNode;

import java.util.ArrayList;
import java.util.List;

public class main_2058 {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int preVal = head.val;
        head = head.next;
        List<Integer> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int preIndex = -1;
        int i = 1;
        while (head.next != null) {
            if ((preVal < head.val && head.val > head.next.val) || (preVal > head.val && head.val < head.next.val)) {
                if (preIndex != -1) {
                    min = Math.min(i - preIndex, min);
                }
                preIndex = i;
                list.add(i);
            }
            i++;
            preVal = head.val;
            head = head.next;
        }

        return list.size() >= 2 ? new int[]{min, list.get(list.size() - 1) - list.get(0)} : new int[]{-1, -1};
    }
}
