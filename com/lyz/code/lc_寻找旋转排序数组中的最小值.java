package com.lyz.code;

/**
 * @author lkunk
 * @date 2023年07月10日 13:18
 * @description
 */

public class lc_寻找旋转排序数组中的最小值 {
    public int findMin(int[] nums) {
        int lef = 0;
        int rig = nums.length - 1;
        while (lef < rig) {
            int mid = (rig + lef) << 1;
            if (nums[mid] > nums[rig]) {
                lef = mid + 1;
            } else {
                rig = mid;
            }
        }
        return nums[lef];
    }
}
