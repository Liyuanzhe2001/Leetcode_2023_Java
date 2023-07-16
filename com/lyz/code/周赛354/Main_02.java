package com.lyz.code.周赛354;

import java.util.Arrays;

/**
 * @author lkunk
 * @date 2023年07月16日 10:17
 * @description
 */

public class Main_02 {
    public int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);
        int[] dp = new int[nums[nums.length - 1] + k + 1];
        for (int num : nums) {
            dp[Math.max(num - k, 0)]++;
            dp[num + k]--;
        }
        System.out.println(Arrays.toString(dp));

        int max = 0;
        for (int i = 0, cnt = 0; i <= nums[nums.length - 1] + k; i++) {
            cnt += dp[i];
            max = Math.max(cnt, max);
        }

        return max;
    }
}
