package com.lyz.code;

import java.util.Arrays;

/**
 * @author lkunk
 * @date 2023年07月20日 21:44
 * @description
 */

public class main_918 {
    public int maxSubarraySumCircular(int[] nums) {
        // 记录 [0:i]的最大和
        int[] leftRangeMax = new int[nums.length];
        leftRangeMax[0] = nums[0];
        int leftSum = nums[0];

        // 记录数组中间部分子数组最大和
        int pre = nums[0];
        int res = nums[0];

        for (int i = 1; i < nums.length; i++) {
            pre = Math.max(pre + nums[i], nums[i]);
            res = Math.max(res, pre);
            leftSum += nums[i];
            leftRangeMax[i] = Math.max(leftRangeMax[i - 1], leftSum);
        }

        // [0:i] 加上 [j:nums.length - 1] 的最大和，即为循环数组取头部尾部最大子数组
        int rightSum = 0;
        for (int i = nums.length - 1; i > 0; i--) {
            rightSum += nums[i];
            res = Math.max(res, rightSum + leftRangeMax[i - 1]);
        }
        return res;
    }
}
