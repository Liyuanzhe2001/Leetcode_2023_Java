package com.lyz.code;

import com.lyz.code.dataStructure.TreeNode;

public class main_951 {

    public static void main(String[] args) {

    }

    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null || root1.val != root2.val) {
            return false;
        }
        return (flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right)) ||
                flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left);
    }

}
