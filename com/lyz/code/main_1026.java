package com.lyz.code;

import com.lyz.code.dataStructure.TreeNode;

public class main_1026 {

    public static void main(String[] args) {

    }

    public int maxAncestorDiff(TreeNode root) {
        return dfs(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public int dfs(TreeNode root, int max, int min) {
        if (root == null) {
            return max - min;
        }
        min = Math.min(root.val, min);
        max = Math.max(root.val, max);
        return Math.max(dfs(root.left, max, min), dfs(root.right, max, min));
    }

}
