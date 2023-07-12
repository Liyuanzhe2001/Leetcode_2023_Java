package com.lyz.code;

import java.util.*;

public class main_432 {

    class Node {
        Node prev;
        Node next;
        Set<String> strs = new HashSet<>();
        int cnt;
    }


    class AllOne {
        Node minNode, maxNode;
        Map<String, Node> map = new HashMap<>();

        public AllOne() {
            minNode = new Node();
            maxNode = new Node();
            minNode.next = maxNode;
            maxNode.prev = minNode;
        }

        public void inc(String key) {
            if (map.containsKey(key)) {
                Node node = map.get(key);
                node.strs.remove(key);
                int cnt = node.cnt + 1;
                if (node.next.cnt == cnt) {
                    node.next.strs.add(key);
                    map.put(key, node.next);
                } else {
                    Node addNode = new Node();
                    addNode.strs.add(key);
                    addNode.cnt = cnt;
                    addNode.prev = node;
                    addNode.next = node.next;
                    node.next.prev = addNode;
                    node.next = addNode;
                    map.put(key, addNode);
                }
                if (node.strs.isEmpty()) {
                    node.prev.next = node.next;
                    node.next.prev = node.prev;
                }
            } else {
                if (minNode.next.cnt == 1) {
                    minNode.next.strs.add(key);
                    map.put(key, minNode.next);
                } else {
                    Node addNode = new Node();
                    addNode.strs.add(key);
                    addNode.cnt = 1;
                    addNode.prev = minNode;
                    addNode.next = minNode.next;
                    minNode.next.prev = addNode;
                    minNode.next = addNode;
                    map.put(key, addNode);
                }
            }
        }

        public void dec(String key) {
            Node node = map.get(key);
            node.strs.remove(key);
            int cnt = node.cnt - 1;
            if (cnt == 0) {
                map.remove(key);
            } else {
                if (node.prev.cnt == cnt) {
                    node.prev.strs.add(key);
                    map.put(key, node.prev);
                } else {
                    Node addNode = new Node();
                    addNode.strs.add(key);
                    addNode.cnt = cnt;
                    addNode.prev = node.prev;
                    addNode.next = node;
                    node.prev.next = addNode;
                    node.prev = addNode;
                    map.put(key, addNode);
                }
            }
            if (node.strs.isEmpty()) {
                node.prev.next = node.next;
                node.next.prev = node.prev;
            }
        }

        public String getMaxKey() {
            for (String str : maxNode.prev.strs) {
                return str;
            }
            return "";
        }

        public String getMinKey() {
            for (String str : minNode.next.strs) {
                return str;
            }
            return "";
        }
    }
}
