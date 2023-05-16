package com.lyz.code;

import com.lyz.code.dataStructure.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class main_337 {

    public static void main(String[] args) {

    }

    Map<TreeNode, Integer> map = new HashMap<>();

    public int rob(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (map.containsKey(root)) {
            return map.get(root);
        }
        int money = root.val;
        if (root.left != null) {
            money += rob(root.left.left) + rob(root.left.right);
        }
        if (root.right != null) {
            money += rob(root.right.right) + rob(root.right.left);
        }
        int res = Math.max(money, rob(root.left) + rob(root.right));
        map.put(root, res);
        return res;
    }


}
