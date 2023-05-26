package com.lyz.code;

import com.lyz.code.dataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class main_113 {

    public static void main(String[] args) {

    }

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root == null) {
            return res;
        }
        dfs(root, new ArrayList<>(), targetSum);
        return res;
    }

    public void dfs(TreeNode node, List<Integer> list, int target) {
        if (node.left == null && node.right == null) {
            if (target - node.val == 0) {
                list.add(node.val);
                res.add(list);
            }
            return;
        }
        list.add(node.val);
        target -= node.val;
        if (node.left != null) {
            dfs(node.left, new ArrayList<>(list), target);
        }
        if (node.right != null) {
            dfs(node.right, new ArrayList<>(list), target);
        }
    }

}
