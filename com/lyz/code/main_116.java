package com.lyz.code;


import com.lyz.code.dataStructure.Node;
import com.lyz.code.util.Util;

import java.util.ArrayDeque;
import java.util.Queue;

public class main_116 {

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        Node connect = new main_116().connect(node1);
        Util.printNode(connect);
    }

    public Node connect(Node root) {
        if(root == null) {
            return root;
        }
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        int n = 0;
        Node res;
        res = root;
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
            for (int i = 0; i < Math.pow(2, n) - 1; i++) {
                node.next = queue.poll();
                node = node.next;
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            node.next = null;
            n++;
        }
        return res;
    }

}
