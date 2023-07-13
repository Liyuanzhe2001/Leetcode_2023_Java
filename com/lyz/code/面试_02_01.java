package com.lyz.code;

import com.lyz.code.dataStructure.ListNode;

/**
 * @author lkunk
 * @date 2023年07月13日 21:05
 * @description
 */

public class 面试_02_01 {
    boolean[] visited = new boolean[20001];

    public ListNode removeDuplicateNodes(ListNode head) {
        if (head == null) {
            return null;
        }
        if (visited[head.val]) {
            return removeDuplicateNodes(head.next);
        }
        visited[head.val] = true;
        head.next = removeDuplicateNodes(head.next);
        return head;
    }
}
