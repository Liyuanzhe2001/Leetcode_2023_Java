package com.lyz.code.util;

import com.lyz.code.dataStructure.ListNode;
import com.lyz.code.dataStructure.Node;
import com.lyz.code.dataStructure.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Util {

    public static void printListNode(ListNode listNode) {
        while (listNode != null) {
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
        System.out.println();
    }

    public static void printNode(Node node) {
        if (node == null) {
            System.out.println("[]");
            return;
        }
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(node);
        System.out.print("[");
        while (!queue.isEmpty()) {
            Node pop = queue.poll();
            System.out.print(pop.val + " ");
            if (pop.left != null) {
                queue.add(pop.left);
            }
            if (pop.right != null) {
                queue.add(pop.right);
            }
        }
        System.out.println("]");
    }

    public static void printTreeNode(TreeNode node) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            TreeNode poll = queue.poll();
            System.out.print(poll.val + " ");
            if (poll.left != null) {
                queue.add(poll.left);
            }
            if (poll.right != null) {
                queue.add(poll.right);
            }
        }
    }


}
