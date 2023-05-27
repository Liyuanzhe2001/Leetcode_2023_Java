package com.lyz.code.双周赛105;

import java.util.Arrays;

public class Main_03 {

    public static void main(String[] args) {
        int[] nums = {0, -1};
        System.out.println(new Main_03().maxStrength(nums));
    }

    public long maxStrength(int[] nums) {
        int n = nums.length;
        long res = Long.MIN_VALUE;
        for (int i = 1; i < (1 << n); i++) {
            long t = 1;
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    t *= nums[j];
                }
            }
            res = Math.max(res, t);
        }
        return res;
    }


}
