package com.lyz.code;

import com.lyz.code.dataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class main_144 {

    public static void main(String[] args) {

    }

    List<Integer> list = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        dfs(root);
        return list;
    }

    public void dfs(TreeNode node) {
        if (node == null) {
            return;
        }
        list.add(node.val);
        dfs(node.left);
        dfs(node.right);
    }

}
