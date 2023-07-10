package com.lyz.code;

import java.util.Arrays;

/**
 * @author lkunk
 * @date 2023年07月10日 9:58
 * @description
 */

public class lc_数组拆分I {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for (int i = 0; i < nums.length / 2; i++) {
            res += nums[2 * i];
        }
        return res;
    }
}
