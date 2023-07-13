package com.lyz.code;

import java.awt.*;

/**
 * @author lkunk
 * @date 2023年07月13日 21:14
 * @description
 */

public class offer_029 {
    class Node {
        public int val;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _next) {
            val = _val;
            next = _next;
        }
    }

    public Node insert(Node head, int insertVal) {
        Node res = head;
        Node node = new Node(insertVal);
        if (head == null) {
            node.next = node;
            return node;
        }
        int max = head.val;
        int min = head.val;
        head = head.next;
        while (head != res) {
            max = Math.max(head.val, max);
            min = Math.min(head.val, min);
            head = head.next;
        }
        if (min == max) {
            node.next = head.next;
            head.next = node;
        } else {
            while ((head.val != max || head.next.val != min)) {
                head = head.next;
            }
            while ((insertVal > min && insertVal < max) && !(head.val <= insertVal && insertVal <= head.next.val)) {
                head = head.next;
            }
            node.next = head.next;
            head.next = node;
        }
        return res;
    }
}
