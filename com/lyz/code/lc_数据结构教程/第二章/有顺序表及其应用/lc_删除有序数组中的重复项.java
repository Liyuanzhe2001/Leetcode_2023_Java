package com.lyz.code.lc_数据结构教程.第二章.有顺序表及其应用;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lkunk
 * @date 2023年08月16日 23:08
 * @description
 */

public class lc_删除有序数组中的重复项 {
    public int removeDuplicates(int[] nums) {
        int lef = 0;
        int rig = 0;
        while (rig < nums.length) {
            if (nums[lef] != nums[rig]) {
                nums[lef] = nums[rig];
                lef++;
            }
            rig++;
        }
        return lef;
    }
}
