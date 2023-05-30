package com.lyz.code;

import com.lyz.code.dataStructure.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class main_1609 {

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(10);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(7);
        TreeNode node6 = new TreeNode(9);
        TreeNode node7 = new TreeNode(12);
        TreeNode node8 = new TreeNode(8);
        TreeNode node9 = new TreeNode(6);
        TreeNode node10 = new TreeNode(2);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node3.left = node5;
        node3.right = node6;
        node4.left = node7;
        node4.right = node8;
        node5.left = node9;
        node6.right = node10;
        System.out.println(new main_1609().isEvenOddTree(node1));
    }

    public boolean isEvenOddTree(TreeNode root) {
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root);
        int n = 0;
        while (!deque.isEmpty()) {
            int size = deque.size();
            for (TreeNode treeNode : deque) {
                System.out.print(treeNode.val+" ");
            }
            TreeNode pre = deque.pop();
            if ((n % 2 == 0 && pre.val % 2 == 0) || (n % 2 == 1 && pre.val % 2 == 1)) {
                return false;
            }
            if (pre.left != null) {
                deque.add(pre.left);
            }
            if (pre.right != null) {
                deque.add(pre.right);
            }
            for (int i = 1; i < size; i++) {
                TreeNode node = deque.pop();
                if ((n % 2 == 0 && pre.val >= node.val && node.val % 2 == 0) || (n % 2 == 1 && pre.val <= node.val && node.val % 2 == 1)) {
                    System.out.println(pre.val + " " + node.val);
                    return false;
                }
                if (node.left != null) {
                    deque.add(node.left);
                }
                if (node.right != null) {
                    deque.add(node.right);
                }
                pre = node;
            }
            n++;
        }
        return true;
    }

}
