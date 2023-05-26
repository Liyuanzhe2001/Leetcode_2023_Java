package com.lyz.code;

import com.lyz.code.dataStructure.TreeNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class main_437 {

    public static void main(String[] args) {

    }

    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }
        return dfs(root, targetSum) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
    }

    public int dfs(TreeNode node, long target) {
        if (node == null) {
            return 0;
        }
        int res = target - node.val == 0 ? 1 : 0;
        return res + dfs(node.left, target - node.val) + dfs(node.right, target - node.val);
    }

}
