package com.lyz.code;

import java.util.Arrays;

/**
 * @author lkunk
 * @date 2023年07月09日 16:57
 * @description
 */

public class main_1991 {

    public int findMiddleIndex(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            if (2 * total + nums[i] == sum) {
                return i;
            }
            total += nums[i];
        }
        return -1;
    }

}
