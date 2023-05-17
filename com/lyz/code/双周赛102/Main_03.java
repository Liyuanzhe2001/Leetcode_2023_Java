package com.lyz.code.双周赛102;

import com.lyz.code.dataStructure.TreeNode;
import com.lyz.code.util.Util;
import com.sun.source.tree.Tree;

import java.util.*;

public class Main_03 {

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(9);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(10);
        TreeNode node6 = new TreeNode(7);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.right = node6;
        TreeNode treeNode = new Main_03().replaceValueInTree(node1);
//        Util.printNode(treeNode);
    }

    public TreeNode replaceValueInTree(TreeNode root) {
        Deque<TreeNode> deque = new ArrayDeque<>();
        root.val = 0;
        deque.push(root);
        while (!deque.isEmpty()) {
            int sum = 0;
            List<Integer> list = new ArrayList<>();
            for (TreeNode treeNode : deque) {
                int twoNodeSum = 0;
                if (treeNode.left != null) {
                    sum += treeNode.left.val;
                    twoNodeSum += treeNode.left.val;
                }
                if (treeNode.right != null) {
                    sum += treeNode.right.val;
                    twoNodeSum += treeNode.right.val;
                }
                list.add(twoNodeSum);
            }
            int index = 0;
            List<TreeNode> tmp = new ArrayList<>();
            while (!deque.isEmpty()) {
                TreeNode pop = deque.pop();
                if (pop.left != null) {
                    pop.left.val = sum - list.get(index);
                    tmp.add(pop.left);
                }
                if (pop.right != null) {
                    pop.right.val = sum - list.get(index);
                    tmp.add(pop.right);
                }
                index++;
            }
            deque.addAll(tmp);
        }
        return root;
    }

}
