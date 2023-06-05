package com.lyz.code;

import com.lyz.code.dataStructure.TreeNode;

public class main_701 {

    public static void main(String[] args) {

    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        insertNode(root, val);
        return root;
    }

    public void insertNode(TreeNode node, int val) {
        if (node.val < val) {
            if (node.right == null) {
                node.right = new TreeNode(val);
                return;
            }
            insertNode(node.right, val);
        } else {
            if (node.left == null) {
                node.left = new TreeNode(val);
                return;
            }
            insertNode(node.left, val);
        }
    }

}
