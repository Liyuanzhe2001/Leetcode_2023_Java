package com.lyz.code;

import com.lyz.code.dataStructure.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class main_450 {

    public static void main(String[] args) {

    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (key < root.val) {
            root.left = deleteNode(root.left, key);
            return root;
        }
        if (key > root.val) {
            root.right = deleteNode(root.right, key);
            return root;
        }
        TreeNode tmpNode;
        if (root.left == null && root.right == null) {
            return null;
        }
        if (root.left != null) {
            tmpNode = root.left;
            while (tmpNode.right != null) {
                tmpNode = tmpNode.right;
            }
            root.val = tmpNode.val;
            root.left = deleteNode(root.left, root.val);
            return root;
        }
        if (root.right != null) {
            tmpNode = root.right;
            while (tmpNode.left != null) {
                tmpNode = tmpNode.left;
            }
            root.val = tmpNode.val;
            root.right = deleteNode(root.right, root.val);
            return root;
        }
        return root;
    }

}
