package com.lyz.code;

import com.lyz.code.dataStructure.ListNode;
import com.lyz.code.dataStructure.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

public class main_1367 {
    public boolean isSubPath(ListNode head, TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode treeNode = queue.poll();
            if (treeNode.val == head.val) {
                if (dfs(head, treeNode)) {
                    return true;
                }
            }
            if (treeNode.left != null) {
                queue.add(treeNode.left);
            }
            if (treeNode.right != null) {
                queue.add(treeNode.right);
            }
        }
        return false;
    }

    public boolean dfs(ListNode node, TreeNode root) {
        if (node == null) {
            return true;
        }
        if (root == null) {
            return false;
        }
        if (node.val != root.val) {
            return false;
        }
        return dfs(node.next, root.left) || dfs(node.next, root.right);
    }
}
