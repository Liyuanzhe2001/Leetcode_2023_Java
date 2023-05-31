package com.lyz.code;

import com.lyz.code.dataStructure.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main_783 {

    public static void main(String[] args) {

    }

    int res = Integer.MAX_VALUE;
    int pre = -1;

    public int minDiffInBST(TreeNode root) {
        dfs(root);
        return res;
    }

    public void dfs(TreeNode node) {
        if (node == null) {
            return;
        }
        dfs(node.left);
        if (pre != -1) {
            res = Math.min(res, node.val - pre);
        }
        pre = node.val;

        dfs(node.right);
    }


}
