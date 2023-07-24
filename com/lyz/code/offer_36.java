package com.lyz.code;

import com.lyz.code.dataStructure.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lkunk
 * @date 2023年07月24日 17:16
 * @description
 */

public class offer_36 {

    class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }

    public Node treeToDoublyList(Node root) {
        if (root == null) {
            return null;
        }
        dfs(root);
        Node head = list.get(0);
        Node res = head;
        for (int i = 0; i < list.size(); i++) {
            head.right = list.get((i + 1) % list.size());
            head.right.left = head;
            head = head.right;
        }
        return res;
    }

    List<Node> list = new ArrayList<>();

    public void dfs(Node root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        list.add(root);
        dfs(root.right);
    }
}
