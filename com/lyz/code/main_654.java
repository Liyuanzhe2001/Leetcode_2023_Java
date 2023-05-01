package com.lyz.code;

import com.lyz.code.dataStructure.TreeNode;

public class main_654 {

    public static void main(String[] args) {

    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return build(nums, 0, nums.length - 1);
    }

    public TreeNode build(int[] nums, int lef, int rig) {
        if (lef > rig) {
            return null;
        }
        int maxIndex = lef;
        for (int i = lef + 1; i <= rig; i++) {
            maxIndex = nums[maxIndex] > nums[i] ? maxIndex : i;
        }
        TreeNode node = new TreeNode(nums[maxIndex]);
        node.left = build(nums, lef, maxIndex - 1);
        node.right = build(nums, maxIndex + 1, rig);
        return node;
    }

}
