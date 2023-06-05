package com.lyz.code;

import com.lyz.code.dataStructure.TreeNode;

public class main_687 {

    public static void main(String[] args) {

    }

    int res = 0;

    public int longestUnivaluePath(TreeNode root) {
        dfs(root);
        return res;
    }

    public int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = dfs(node.left);
        int right = dfs(node.right);
        int left1 = 0;
        int right1 = 0;
        if (node.left != null && node.left.val == node.val) {
            left1 = left + 1;
        }
        if (node.right != null && node.right.val == node.val) {
            right1 = right + 1;
        }
        res = Math.max(res, left1 + right1);
        return Math.max(left1, right1);
    }

}
