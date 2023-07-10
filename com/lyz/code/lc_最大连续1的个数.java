package com.lyz.code;

/**
 * @author lkunk
 * @date 2023年07月10日 12:56
 * @description
 */

public class lc_最大连续1的个数 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int tmp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                tmp++;
            } else {
                res = Math.max(res, tmp);
                tmp = 0;
            }
        }
        return Math.max(res, tmp);
    }
}
