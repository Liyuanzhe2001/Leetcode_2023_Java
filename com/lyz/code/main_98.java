package com.lyz.code;

import com.lyz.code.dataStructure.TreeNode;

public class main_98 {

    public static void main(String[] args) {

    }

    long preValue = Long.MIN_VALUE;

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (!isValidBST(root.left)) {
            return false;
        }
        if (root.val <= preValue) {
            return false;
        }
        preValue = root.val;
        return isValidBST(root.right);
    }

}
