package com.lyz.code;

import java.util.Arrays;

public class 面试_17_16 {

    public static void main(String[] args) {
        System.out.println(new 面试_17_16().massage(new int[]{2, 7, 9, 3, 1}));
    }

    public int massage(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        int max = 0;
        for (int i = 2; i < nums.length; i++) {
            // 2 7 9 3 1
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[dp.length - 1];
    }

}
