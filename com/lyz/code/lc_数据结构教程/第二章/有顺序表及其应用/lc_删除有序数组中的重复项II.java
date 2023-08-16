package com.lyz.code.lc_数据结构教程.第二章.有顺序表及其应用;

/**
 * @author lkunk
 * @date 2023年08月16日 23:14
 * @description
 */

public class lc_删除有序数组中的重复项II {
    public int removeDuplicates(int[] nums) {
        int lef = 1;
        int rig = 2;
        while (rig < nums.length) {
            if (nums[lef - 1] != nums[rig]) {
                lef++;
                nums[lef] = nums[rig];
            }
            rig++;
        }
        return lef + 1;
    }
}
