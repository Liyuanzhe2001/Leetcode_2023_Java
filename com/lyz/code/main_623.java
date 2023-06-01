package com.lyz.code;

import com.lyz.code.dataStructure.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class main_623 {

    public static void main(String[] args) {

    }

//    public TreeNode addOneRow(TreeNode root, int val, int depth) {
//        if(depth == 1) {
//            TreeNode treeNode = new TreeNode(val);
//            treeNode.left = root;
//            return treeNode;
//        }
//        Queue<TreeNode> queue = new ArrayDeque<>();
//        queue.add(root);
//        int d = 2;
//        while (!queue.isEmpty() && depth != d) {
//            int size = queue.size();
//            for (int i = 0; i < size; i++) {
//                TreeNode node = queue.poll();
//                if (node.left != null) {
//                    queue.add(node.left);
//                }
//                if (node.right != null) {
//                    queue.add(node.right);
//                }
//            }
//            d++;
//        }
//        System.out.println(queue);
//        int size = queue.size();
//        for (int i = 0; i < size; i++) {
//            TreeNode node = queue.poll();
//            TreeNode addNode = new TreeNode(val);
//            addNode.left = node.left;
//            node.left = addNode;
//            addNode = new TreeNode(val);
//            addNode.right = node.right;
//            node.right = addNode;
//        }
//        return root;
//    }

    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) {
            TreeNode node = new TreeNode(val);
            node.left = root;
            return node;
        } else if (depth == 2) {
            TreeNode addNode = new TreeNode(val);
            addNode.left = root.left;
            root.left = addNode;
            addNode = new TreeNode(val);
            addNode.right = root.right;
            root.right = addNode;
        } else {
            if (root.left != null) {
                addOneRow(root.left, val, depth - 1);
            }
            if (root.right != null) {
                addOneRow(root.right, val, depth - 1);
            }
        }
        return root;
    }

}
