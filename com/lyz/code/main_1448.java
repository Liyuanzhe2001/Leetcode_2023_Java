package com.lyz.code;

import com.lyz.code.dataStructure.TreeNode;

/**
 * @author lkunk
 * @date 2023年08月25日 14:46
 * @description
 */

public class main_1448 {
    int res = 0;

    public int goodNodes(TreeNode root) {
        dfs(root.val, root);
        return res;
    }

    public void dfs(int preMaxVal, TreeNode node) {
        if (node == null) {
            return;
        }
        if (preMaxVal <= node.val) {
            res++;
        }
        preMaxVal = Math.max(preMaxVal, node.val);
        dfs(preMaxVal, node.left);
        dfs(preMaxVal, node.right);
    }
}
