package com.lyz.code;

import com.lyz.code.dataStructure.TreeNode;

public class main_236 {

    public static void main(String[] args) {

    }

    TreeNode res;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root, p, q);
        return res;
    }

    public boolean dfs(TreeNode node, TreeNode node1, TreeNode node2) {
        if (node == null) {
            return false;
        }
        boolean lFlag = dfs(node.left, node1, node2);
        boolean rFlag = dfs(node.right, node1, node2);
        if (lFlag && rFlag || ((lFlag || rFlag) && (node.val == node1.val || node.val == node2.val))) {
            res = node;
        }
        return lFlag || rFlag || node.val == node1.val || node.val == node2.val;
    }

}
