package com.lyz.code;

import com.lyz.code.dataStructure.TreeNode;

public class main_404 {

    public static void main(String[] args) {

    }

    public int sumOfLeftLeaves(TreeNode root) {
        return dfs(root, false);
    }

    public int dfs(TreeNode node, boolean isLef) {
        if (node.left == null && node.right == null) {
            if (isLef) {
                return node.val;
            } else {
                return 0;
            }
        }
        int res = 0;
        if (node.left != null) {
            res += dfs(node.left, true);
        }
        if (node.right != null) {
            res += dfs(node.right, false);
        }
        return res;
    }

}
