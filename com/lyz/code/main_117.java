package com.lyz.code;

import com.lyz.code.dataStructure.Node;

import javax.swing.*;
import java.util.ArrayDeque;
import java.util.Queue;

public class main_117 {

    public static void main(String[] args) {

    }

    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            Node pre = queue.poll();
            if (pre.left != null) {
                queue.add(pre.left);
            }
            if (pre.right != null) {
                queue.add(pre.right);
            }
            for (int i = 0; i < size - 1; i++) {
                Node node = queue.poll();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                pre.next = node;
                pre = node;
            }
            pre.next = null;
        }
        return root;
    }

}
