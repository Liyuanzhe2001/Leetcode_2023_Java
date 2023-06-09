package com.lyz.code;

import java.util.ArrayDeque;
import java.util.Queue;

public class main_430 {

    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    }

    public Node flatten(Node head) {
        if (head == null) {
            return null;
        }
        Node root;
        root = head;
        while (head != null) {
            if (head.child == null) {
                head = head.next;
            } else {
                Node tmp = head.next;
                Node chileNode = flatten(head.child);
                head.next = chileNode;
                chileNode.prev = head;
                head.child = null;
                while (head.next != null) {
                    head = head.next;
                }
                head.next = tmp;
                if (tmp != null) {
                    tmp.prev = head;
                }
            }
        }
        return root;
    }

}
