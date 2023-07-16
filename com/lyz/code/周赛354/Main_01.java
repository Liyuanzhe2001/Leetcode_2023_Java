package com.lyz.code.周赛354;

/**
 * @author lkunk
 * @date 2023年07月16日 10:17
 * @description
 */

public class Main_01 {
    public int sumOfSquares(int[] nums) {
        int res = 0;
        int len = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (len % (i + 1) == 0) {
                res += nums[i]*nums[i];
            }
        }
        return res;
    }
}
