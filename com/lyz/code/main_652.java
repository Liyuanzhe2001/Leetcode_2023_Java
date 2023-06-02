package com.lyz.code;

import com.lyz.code.dataStructure.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main_652 {

    public static void main(String[] args) {

    }

    List<TreeNode> res = new ArrayList<>();
    Map<String, Integer> map = new HashMap<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        dfs(root, "");
        return res;
    }

    public String dfs(TreeNode node, String str) {
        if (node == null) {
            return str;
        }
        String s = node.val + "(" + dfs(node.left, node.val + "") + ":" + dfs(node.right, node.val + "") + ")";
        if (map.containsKey(s)) {
            if (map.get(s) == 1) {
                res.add(node);
                map.put(s, map.get(s) + 1);
            }
        } else {
            map.put(s, 1);
        }
        return s;
    }
}
