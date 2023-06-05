package com.lyz.code;

import com.lyz.code.dataStructure.TreeNode;

import java.util.*;

public class main_662 {

    public static void main(String[] args) {

    }

    public int widthOfBinaryTree(TreeNode root) {
        int res = 1;
        List<Map.Entry<TreeNode, Integer>> list = new ArrayList<>();
        list.add(new AbstractMap.SimpleEntry<>(root, 1));
        while (!list.isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Map.Entry<TreeNode, Integer> map = list.get(0);
                list.remove(0);
                if (map.getKey().left != null) {
                    list.add(new AbstractMap.SimpleEntry<>(map.getKey().left, 2 * map.getValue()));
                }
                if (map.getKey().right != null) {
                    list.add(new AbstractMap.SimpleEntry<>(map.getKey().right, 2 * map.getValue() + 1));
                }
            }
            if (!list.isEmpty()) {
                res = Math.max(list.get(list.size() - 1).getValue() - list.get(0).getValue(), res);
            }
        }
        return res;
    }

}
