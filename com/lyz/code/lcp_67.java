package com.lyz.code;

import com.lyz.code.dataStructure.TreeNode;

/**
 * @author lkunk
 * @date 2023年07月29日 23:31
 * @description
 */

public class lcp_67 {
    public TreeNode expandBinaryTree(TreeNode root) {
        if (root.left != null) {
            TreeNode tmpNode = expandBinaryTree(root.left);
            root.left = new TreeNode(-1);
            root.left.left = tmpNode;
        }
        if (root.right != null) {
            TreeNode tmpNode = expandBinaryTree(root.right);
            root.right = new TreeNode(-1);
            root.right.right = tmpNode;
        }
        return root;
    }
}
