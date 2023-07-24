package com.lyz.code;

import com.lyz.code.dataStructure.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lkunk
 * @date 2023年07月24日 17:31
 * @description
 */

public class main_2487 {
    public ListNode removeNodes(ListNode head) {
        if (head.next == null) {
            return head;
        }
        ListNode node = removeNodes(head.next);
        if (node.val > head.val) {
            return node;
        }
        head.next = node;
        return head;
    }
}
