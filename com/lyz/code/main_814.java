package com.lyz.code;

import com.lyz.code.dataStructure.TreeNode;

public class main_814 {

    public static void main(String[] args) {

    }

    public TreeNode pruneTree(TreeNode root) {
        if (root.left != null) {
            root.left = pruneTree(root.left);
        }
        if (root.right != null) {
            root.right = pruneTree(root.right);
        }
        if (root.left == null && root.right == null && root.val == 0) {
            return null;
        }
        return root;
    }

}
