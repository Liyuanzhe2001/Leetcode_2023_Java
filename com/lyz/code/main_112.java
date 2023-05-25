package com.lyz.code;

import com.lyz.code.dataStructure.TreeNode;

public class main_112 {

    public static void main(String[] args) {

    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return targetSum - root.val == 0;
        }
        boolean res = false;
        if (root.left != null) {
            res = hasPathSum(root.left, targetSum - root.val);
        }
        if (root.right != null) {
            res = res || hasPathSum(root.right, targetSum - root.val);
        }
        return res;
    }

}
