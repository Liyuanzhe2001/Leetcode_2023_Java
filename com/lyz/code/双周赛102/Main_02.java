package com.lyz.code.双周赛102;

public class Main_02 {

    public static void main(String[] args) {

    }

    public long[] findPrefixScore(int[] nums) {
        long[] ans = new long[nums.length];
        int max = nums[0];
        ans[0] = nums[0] * 2L;
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(nums[i], max);
            ans[i] = max + nums[i] + ans[i - 1];
        }
        return ans;
    }

}
