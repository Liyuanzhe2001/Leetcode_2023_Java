package com.lyz.code;

import com.lyz.code.dataStructure.TreeNode;

public class main_1302 {

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(8);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node4.left = node7;
        node3.right = node6;
        node6.right = node8;
        System.out.println(new main_1302().deepestLeavesSum(node1));
    }

    int maxIndex = 0;
    int[] sum = new int[10001];

    public int deepestLeavesSum(TreeNode root) {
        cal(root, 0);
        return sum[maxIndex];
    }

    public void cal(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        maxIndex = Math.max(maxIndex, depth);
        sum[depth] += root.val;
        cal(root.left, depth + 1);
        cal(root.right, depth + 1);
    }

}
