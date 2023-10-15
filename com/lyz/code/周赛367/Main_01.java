package com.lyz.code.周赛367;

/**
 * @author lkunk
 * @date 2023年10月15日 10:23
 * @description
 */

public class Main_01 {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + indexDifference; j < nums.length; j++) {
                if (Math.abs(nums[j] - nums[i]) >= valueDifference) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
