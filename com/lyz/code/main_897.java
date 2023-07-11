package com.lyz.code;

import com.lyz.code.dataStructure.TreeNode;

import java.util.List;

/**
 * @author lkunk
 * @date 2023年07月11日 21:44
 * @description
 */

public class main_897 {
    TreeNode res = new TreeNode();
    TreeNode pre = res;

    public TreeNode increasingBST(TreeNode root) {
        dfs(root);
        return res.right;
    }

    public void dfs(TreeNode node) {
        if (node == null) {
            return;
        }
        dfs(node.left);
        pre.right = new TreeNode(node.val);
        pre = pre.right;
        dfs(node.right);
    }
}
