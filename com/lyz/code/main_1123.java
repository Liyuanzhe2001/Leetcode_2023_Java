package com.lyz.code;

import com.lyz.code.dataStructure.TreeNode;

public class main_1123 {

    public static void main(String[] args) {

    }

    public TreeNode lcaDeepestLeaves(TreeNode root) {
        int lefD = getDepth(root.left);
        int rigD = getDepth(root.right);
        if (lefD == rigD) {
            return root;
        } else if (lefD < rigD) {
            return lcaDeepestLeaves(root.right);
        } else {
            return lcaDeepestLeaves(root.left);
        }
    }

    public int getDepth(TreeNode node) {
        if(node == null) {
            return 0;
        }
        return 1 + Math.max(getDepth(node.left), getDepth(node.right));
    }

}
