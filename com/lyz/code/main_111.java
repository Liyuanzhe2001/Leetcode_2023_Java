package com.lyz.code;

import com.lyz.code.dataStructure.TreeNode;

public class main_111 {

    public static void main(String[] args) {
        // [2,null,3,null,4,null,5,null,6]
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
        TreeNode node5 = new TreeNode(6);
        node1.right=node2;

    }

    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        return dfs(root);
    }

    public int dfs(TreeNode root) {
        if (root.left == null && root.right == null) {
            return 1;
        }
        int res = Integer.MAX_VALUE;
        if (root.left != null) {
            res = dfs(root.left);
        }
        if (root.right != null) {
            res = Math.min(dfs(root.right), res);
        }
        return 1 + res;
    }

}
