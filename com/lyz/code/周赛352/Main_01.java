package com.lyz.code.周赛352;

/**
 * @author lkunk
 * @date 2023年07月02日 10:15
 * @description
 */

public class Main_01 {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int len = 1;
        while (true) {
            boolean res = false;
            for (int l = 0; l < nums.length - len + 1; l++) {
                boolean flag = true;
                if (nums[l] % 2 != 0) {
                    continue;
                }

                if (nums[l + len - 1] > threshold) {
                    flag = false;
                } else {
                    for (int tmp = l; tmp < l + len - 1; tmp++) {
                        if (nums[tmp] > threshold) {
                            flag = false;
                            break;
                        }
                        if (nums[tmp] % 2 == nums[tmp + 1] % 2) {
                            flag = false;
                            break;
                        }
                    }
                }
                if (flag) {
                    len++;
                    res = true;
                    break;
                }
            }
            if (!res) {
                return len;
            }
        }
    }
}
