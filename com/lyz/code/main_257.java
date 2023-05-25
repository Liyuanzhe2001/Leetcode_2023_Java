package com.lyz.code;

import com.lyz.code.dataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class main_257 {

    public static void main(String[] args) {

    }

    List<String> res = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        dfs("", root);
        return res;
    }

    public void dfs(String s, TreeNode node) {
        if (node.left == null && node.right == null) {
            res.add(s + node.val);
        }
        if (node.left != null) {
            dfs(s + node.val + "->", node.left);
        }
        if (node.right != null) {
            dfs(s + node.val + "->", node.right);
        }
    }

}
