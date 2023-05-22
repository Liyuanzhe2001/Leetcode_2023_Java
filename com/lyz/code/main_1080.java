package com.lyz.code;

import com.lyz.code.dataStructure.TreeNode;
import com.lyz.code.util.Util;

public class main_1080 {

    public static void main(String[] args) {
        // root = [5,4,8,11,null,17,4,7,1,null,null,5,3], limit = 22
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(8);
        TreeNode node4 = new TreeNode(11);
        TreeNode node5 = new TreeNode(17);
        TreeNode node6 = new TreeNode(4);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(1);
        TreeNode node9 = new TreeNode(5);
        TreeNode node10 = new TreeNode(3);
        int limit = 22;
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node4.left = node7;
        node4.right = node8;
        node3.left = node5;
        node3.right = node6;
        node6.left = node9;
        node6.right = node10;
        Util.printTreeNode(node1);
        System.out.println();
        TreeNode treeNode = new main_1080().sufficientSubset(node1, limit);
        Util.printTreeNode(treeNode);
    }

    public TreeNode sufficientSubset(TreeNode root, int limit) {
        if (dfs(root, 0, limit)) {
            return null;
        }
        return root;
    }

    private Boolean dfs(TreeNode node, int s, int limit) {
        if (node.left == null && node.right == null) {
            return s + node.val < limit;
        }
        boolean lTreeDeleted = true;
        boolean rTreeDeleted = true;
        if (node.left != null) {
            lTreeDeleted = dfs(node.left, s + node.val, limit);
        }
        if (node.right != null) {
            rTreeDeleted = dfs(node.right, s + node.val, limit);
        }
        if (lTreeDeleted) {
            node.left = null;
        }
        if (rTreeDeleted) {
            node.right = null;
        }
        return lTreeDeleted && rTreeDeleted;
    }

}
