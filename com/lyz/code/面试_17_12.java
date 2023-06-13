package com.lyz.code;

import com.lyz.code.dataStructure.TreeNode;

public class 面试_17_12 {

    TreeNode rNode = new TreeNode();
    TreeNode res = rNode;

    public TreeNode convertBiNode(TreeNode root) {
        dfs(root);
        return res.right;
    }

    public void dfs(TreeNode node){
        if(node == null) {
            return;
        }
        dfs(node.left);
        rNode.right = new TreeNode(node.val);
        rNode = rNode.right;
        dfs(node.right);
    }

}
