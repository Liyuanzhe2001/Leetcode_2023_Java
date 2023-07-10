package com.lyz.code;

/**
 * @author lkunk
 * @date 2023年07月10日 13:00
 * @description
 */

public class lc_长度最小的子数组 {

    public int minSubArrayLen(int target, int[] nums) {
        int slow = 0;
        int fast = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        while (fast < nums.length) {
            sum += nums[fast++];
            if (sum >= target) {
                while (sum >= target) {
                    sum -= nums[slow++];
                }
                min = Math.min(fast - slow + 1, min);
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
