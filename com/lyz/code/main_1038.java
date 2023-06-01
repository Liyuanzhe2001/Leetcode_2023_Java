package com.lyz.code;

import com.lyz.code.dataStructure.TreeNode;

public class main_1038 {

    public static void main(String[] args) {

    }

    public TreeNode bstToGst(TreeNode root) {
        dfs(root);
        return root;
    }

    TreeNode pre = new TreeNode(0);

    public void dfs(TreeNode node) {
        if (node == null) {
            return;
        }
        dfs(node.right);
        node.val = node.val + pre.val;
        pre = node;
        dfs(node.left);
    }

}
