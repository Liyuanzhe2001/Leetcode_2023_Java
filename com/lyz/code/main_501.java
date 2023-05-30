package com.lyz.code;

import com.lyz.code.dataStructure.TreeNode;

import java.util.*;

public class main_501 {

    public static void main(String[] args) {

    }

    public int[] findMode(TreeNode root) {
        if (root == null) {
            return new int[]{};
        }
        Map<Integer, Integer> map = new HashMap<>();
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root);
        int max = 0;
        while (!deque.isEmpty()) {
            TreeNode node = deque.pop();
            if (node.left != null) {
                deque.add(node.left);
            }
            if (node.right != null) {
                deque.add(node.right);
            }
            map.put(node.val, map.getOrDefault(node.val, 0) + 1);
            max = Math.max(map.get(node.val), max);
        }
        List<Integer> list = new ArrayList<>();
        for (Integer key : map.keySet()) {
            if (map.get(key) == max) {
                list.add(key);
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

}

