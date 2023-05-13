package com.lyz.code.双周赛104;

public class Main_03 {

    public static void main(String[] args) {

    }

    public long maximumOr(int[] nums, int k) {
        if (nums.length == 1) {
            return (long) nums[0] << k;
        }
        long[] pre = new long[nums.length];
        pre[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            pre[i] = pre[i - 1] | nums[i];
        }
        long[] after = new long[nums.length];
        after[nums.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            after[i] = after[i + 1] | nums[i];
        }
        long max = Math.max(((long) nums[0] << k) | after[1], pre[nums.length - 2] | ((long) nums[nums.length - 1]) << k);

        for (int i = 1; i < nums.length - 1; i++) {
            max = Math.max(pre[i - 1] | (long) nums[i] << k | after[i + 1], max);
        }
        return max;
    }
}
