package com.lyz.code;

import com.lyz.code.dataStructure.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class main_655 {

    public static void main(String[] args) {

    }

    int height = 0;
    List<List<String>> list = new ArrayList<>();

    public List<List<String>> printTree(TreeNode root) {
        getHeight(root, 1);
        for (int i = 0; i < height; i++) {
            List<String> tmp = new ArrayList<>();
            for (int j = 0; j < Math.pow(2, height) - 1; j++) {
                tmp.add("");
            }
            list.add(tmp);
        }
        list.get(0).remove((int) (Math.pow(2, height) - 1) / 2);
        list.get(0).add((int) (Math.pow(2, height) - 1) / 2, root.val+"");
        dfs(0, (int) (Math.pow(2, height) - 1) / 2, root);
        return list;
    }

    public void getHeight(TreeNode node, int d) {
        if (node == null) {
            height = Math.max(height, d - 1);
            return;
        }
        getHeight(node.left, d + 1);
        getHeight(node.right, d + 1);
    }

    public void dfs(int r, int c, TreeNode node) {
        if (node == null) {
            return;
        }
        if (node.left != null) {
            int index = (int) (c + Math.pow(2, height - r - 2));
            list.get(r + 1).remove(index);
            list.get(r + 1).add(index, node.left.val + "");
            dfs(r + 1, index, node.left);
        }
        if (node.right != null) {
            int index = (int) (c - Math.pow(2, height - r - 2));
            list.get(r + 1).remove(index);
            list.get(r + 1).add(index, node.right.val + "");
            dfs(r + 1, index, node.right);
        }
    }

}
