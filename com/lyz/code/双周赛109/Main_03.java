package com.lyz.code.双周赛109;

import java.util.Arrays;

/**
 * @author lkunk
 * @date 2023年07月22日 22:26
 * @description
 */

public class Main_03 {
    public long maxScore(int[] nums, int x) {
        long[] dp = new long[nums.length];
        dp[0] = nums[0];
        long max = dp[0];
        // 偶数下标
        int maxEvenIndex = nums[0] % 2 == 0 ? 0 : -1;
        // 奇数下标
        int maxOddIndex = maxEvenIndex == 0 ? -1 : 0;
        for (int i = 1; i < nums.length; i++) {
            long tmp = Long.MIN_VALUE;
            if (maxEvenIndex != -1) {
                tmp = Math.max(tmp, nums[i] % 2 == 1 ? dp[maxEvenIndex] + nums[i] - x : dp[maxEvenIndex] + nums[i]);
            }
            if (maxOddIndex != -1) {
                tmp = Math.max(tmp, nums[i] % 2 == 0 ? dp[maxOddIndex] + nums[i] - x : dp[maxOddIndex] + nums[i]);
            }
            dp[i] = tmp;
            max = Math.max(dp[i], max);
            if (nums[i] % 2 == 0 && (maxEvenIndex == -1 || dp[i] > dp[maxEvenIndex])) {
                maxEvenIndex = i;
            }
            if (nums[i] % 2 == 1 && (maxOddIndex == -1 || dp[i] > dp[maxOddIndex])) {
                maxOddIndex = i;
            }
        }
        return max;
    }
}
