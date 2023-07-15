package com.lyz.code;

/**
 * @author lkunk
 * @date 2023年07月15日 23:09
 * @description
 */

public class offer_028 {

    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    }

    public Node flatten(Node head) {
        Node res = head;
        while (head != null) {
            if (head.child != null) {
                Node node = flatten(head.child);
                head.child = null;
                Node next = head.next;
                head.next = node;
                node.prev = head;
                while (head.next != null) {
                    head = head.next;
                }
                head.next = next;
                if (next != null) {
                    next.prev = head;
                }
            }
            head = head.next;
        }
        return res;
    }

}
