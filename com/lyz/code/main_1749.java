package com.lyz.code;

import java.util.Arrays;

/**
 * @author lkunk
 * @date 2023年08月08日 22:31
 * @description
 */

public class main_1749 {
    public int maxAbsoluteSum(int[] nums) {
        int maxSum = 0;
        int minSum = 0;
        int res = 0;
        for (int num : nums) {
            maxSum = Math.max(maxSum + num, num);
            minSum = Math.min(minSum + num, num);
            res = Math.max(res, Math.abs(maxSum));
            res = Math.max(res, Math.abs(minSum));
        }
        return res;
    }
}
