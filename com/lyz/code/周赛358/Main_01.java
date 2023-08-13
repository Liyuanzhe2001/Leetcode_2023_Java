package com.lyz.code.周赛358;

/**
 * @author lkunk
 * @date 2023年08月13日 10:31
 * @description
 */

public class Main_01 {
    public int maxSum(int[] nums) {
        int[] max = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            max[i] = getMax(nums[i]);
        }
        int res = -1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (max[i] == max[j]) {
                    res = Math.max(res, nums[i] + nums[j]);
                }
            }
        }
        return res;
    }

    public int getMax(int num) {
        int max = 0;
        while (num != 0) {
            max = Math.max(max, num % 10);
            num /= 10;
        }
        return max;
    }
}
