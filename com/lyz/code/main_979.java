package com.lyz.code;

import com.lyz.code.dataStructure.TreeNode;

/**
 * @author lkunk
 * @date 2023年07月14日 22:24
 * @description
 */

public class main_979 {

    int res = 0;

    public int distributeCoins(TreeNode root) {
        dfs(root);
        return res;
    }

    public int[] dfs(TreeNode root) {
        if (root == null) {
            return new int[]{0, 0};
        }
        int[] left = dfs(root.left);
        int[] right = dfs(root.right);
        int coins = left[0] + right[0] + root.val;
        int nodes = left[1] + right[1] + 1;
        res += Math.abs(coins - nodes);
        return new int[]{coins, nodes};
    }
}
