package com.lyz.code.周赛350;

import java.util.Arrays;

public class Main_02 {

    public int findValueOfPartition(int[] nums) {
        Arrays.sort(nums);
        int res = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length; i++) {
            res = Math.min(nums[i] - nums[i - 1], res);
        }
        return res;
    }

}
