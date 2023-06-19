//package com.lyz.code;
//
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Map;
//import java.util.Set;
//
//public class main_432 {
//
//    class Node {
//        Node prev;
//        Node next;
//        String str;
//        int val;
//    }
//
//
//    class AllOne {
//        Map<String, Node> map;
//        Node minNode, maxNode;
//
//        public AllOne() {
//            map = new HashMap<>();
//            minNode = new Node();
//            maxNode = new Node();
//        }
//
//        public void inc(String key) {
//            if (map.containsKey(key)) {
//                Node node = map.get(key);
//                Node tmp;
//                tmp = node.next;
//                while (tmp.val < node.val) {
//                    tmp = tmp.next;
//                }
//                node.next.prev = node.prev;
//                node.prev.next = node.next;
//                node.prev = tmp.prev;
//                node.next = tmp.next;
//                tmp.prev.next = node;
//                tmp.prev = node;
//            } else {
//                Node node = new Node();
//                node.str = key;
//                node.val = 1;
//                node.prev = null;
//                node.next = minNode;
//                minNode = node;
//            }
//        }
//
//        public void dec(String key) {
//
//        }
//
//        public String getMaxKey() {
//
//        }
//
//        public String getMinKey() {
//
//        }
//    }
//}
