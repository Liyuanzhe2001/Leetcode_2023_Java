package com.lyz.code;

import com.lyz.code.dataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class main_1100 {

    public static void main(String[] args) {

    }

    List<TreeNode> res = new ArrayList<>();

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<Integer> list = new ArrayList<>() {{
            for (int i : to_delete) {
                add(i);
            }
        }};
        if (!list.contains(root.val)) {
            res.add(root);
        }
        dfs(root, false, list);
        return res;
    }

    public TreeNode dfs(TreeNode node, boolean isAdd, List<Integer> list) {
        if (node == null) {
            return null;
        }
        node.left = dfs(node.left, list.contains(node.val), list);
        node.right = dfs(node.right, list.contains(node.val), list);
        if (list.contains(node.val)) {
            return null;
        } else {
            if (isAdd) {
                res.add(node);
            }
        }
        return node;
    }


}
