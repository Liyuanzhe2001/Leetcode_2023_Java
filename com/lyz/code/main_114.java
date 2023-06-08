package com.lyz.code;

import com.lyz.code.dataStructure.TreeNode;

public class main_114 {

    public static void main(String[] args) {

    }

    TreeNode pre;

    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        if (pre != null) {
            pre.right = root;
        }
        pre = root;
        flatten(left);
        flatten(right);
    }

}
