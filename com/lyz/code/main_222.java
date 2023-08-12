package com.lyz.code;

import com.lyz.code.dataStructure.TreeNode;

/**
 * @author lkunk
 * @date 2023年08月12日 23:41
 * @description
 */

public class main_222 {
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return countNodes(root.left) + countNodes(root.right) + 1;
    }

}
