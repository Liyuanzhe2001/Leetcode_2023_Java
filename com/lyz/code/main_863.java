package com.lyz.code;

import com.lyz.code.dataStructure.TreeNode;

import java.awt.image.ImageProducer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main_863 {

    public static void main(String[] args) {

    }

    Map<TreeNode, TreeNode> father = new HashMap<>();
    List<Integer> res = new ArrayList<>();
    TreeNode n;

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        findNode(root, target.val);
        if (n == null) {
            return res;
        }
        dfs(new ArrayList<>(), n, k);
        return res;
    }

    public void findNode(TreeNode node, int target) {
        if (node.val == target) {
            n = node;
            return;
        }
        if (node.left != null) {
            father.put(node.left, node);
            findNode(node.left, target);
        }
        if (node.right != null) {
            father.put(node.right, node);
            findNode(node.right, target);
        }
    }

    public void dfs(List<TreeNode> visited, TreeNode node, int k) {
        if (visited.contains(node)) {
            return;
        }
        if (k == 0) {
            res.add(node.val);
        }
        visited.add(node);
        k -= 1;
        if (node.left != null) {
            dfs(visited, node.left, k);
        }
        if (node.right != null) {
            dfs(visited, node.right, k);
        }
        if (father.containsKey(node)) {
            dfs(visited, father.get(node), k);
        }
    }

}
