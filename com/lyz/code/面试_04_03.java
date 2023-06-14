package com.lyz.code;

import com.lyz.code.dataStructure.ListNode;
import com.lyz.code.dataStructure.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class 面试_04_03 {

    public static void main(String[] args) {

    }

    public ListNode[] listOfDepth(TreeNode tree) {
        if (tree == null) {
            return null;
        }
        List<ListNode> list = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(tree);
        while (!queue.isEmpty()) {
            int size = queue.size();
            ListNode tmp = new ListNode(0);
            ListNode head = tmp;
            for (int i = 0; i < size; i++) {
                TreeNode tmpTreeNode = queue.poll();
                if (tmpTreeNode.left != null) {
                    queue.add(tmpTreeNode.left);
                }
                if (tmpTreeNode.right != null) {
                    queue.add(tmpTreeNode.right);
                }
                tmp.next = new ListNode(tmpTreeNode.val);
                tmp = tmp.next;
            }
            list.add(head.next);
        }
        ListNode[] res = new ListNode[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

}
