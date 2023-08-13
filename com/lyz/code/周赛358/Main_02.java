package com.lyz.code.周赛358;

import com.lyz.code.dataStructure.ListNode;
import com.lyz.code.dataStructure.TreeNode;

import java.util.List;

/**
 * @author lkunk
 * @date 2023年08月13日 10:34
 * @description
 */

public class Main_02 {
    public ListNode doubleIt(ListNode head) {
        int dfs = dfs(head);
        if (dfs == 1) {
            ListNode listNode = new ListNode(1);
            listNode.next = head;
            return listNode;
        }
        return head;
    }

    public int dfs(ListNode head) {
        if (head == null) {
            return 0;
        }
        int v = head.val * 2 + dfs(head.next);
        head.val = v % 10;
        return v / 10;
    }
}
