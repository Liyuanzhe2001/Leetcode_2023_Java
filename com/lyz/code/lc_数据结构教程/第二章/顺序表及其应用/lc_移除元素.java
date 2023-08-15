package com.lyz.code.lc_数据结构教程.第二章.顺序表及其应用;

/**
 * @author lkunk
 * @date 2023年08月15日 23:51
 * @description
 */

public class lc_移除元素 {
    public int removeElement(int[] nums, int val) {
        int lef = 0;
        int rig = 0;
        for (; rig < nums.length; rig++) {
            if (nums[rig] != val) {
                nums[lef] = nums[rig];
                lef++;
            }
        }
        return lef;
    }
}
