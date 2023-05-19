package com.lyz.code;

public class main_494 {

    public static void main(String[] args) {

    }

    public int findTargetSumWays(int[] nums, int target) {
        return dfs(nums, 0, target);
    }

    public int dfs(int[] nums, int now, int target) {
        if (now == nums.length) {
            return target == 0 ? 1 : 0;
        }
        return dfs(nums, now + 1, target - nums[now]) + dfs(nums, now + 1, target + nums[now]);
    }

}
