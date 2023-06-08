package com.lyz.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main_138 {

    public static void main(String[] args) {

    }

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<>();
        Node pre = new Node(head.val);
        map.put(head, pre);
        Node root;
        root = pre;
        for (Node tmp = head.next; tmp != null; tmp = tmp.next) {
            Node node = new Node(tmp.val);
            pre.next = node;
            pre = node;
            map.put(tmp, node);
        }

        while (head != null) {
            Node node = map.get(head);
            System.out.println(node.val);
            if (head.random != null) {
                node.random = map.get(head.random);
            } else {
                node.random = null;
            }
            head = head.next;
        }
        return root;
    }

}
