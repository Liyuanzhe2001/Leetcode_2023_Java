package com.lyz.code.双周赛103;

import java.util.Arrays;

public class Main_01 {
    public static void main(String[] args) {

    }

    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int res;
        res = k * nums[nums.length - 1];
        for (int i = 0; i < k; i++) {
            res += i;
        }
        return res;
    }

}
