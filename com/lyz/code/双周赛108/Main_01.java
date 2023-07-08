package com.lyz.code.双周赛108;

/**
 * @author lkunk
 * @date 2023年07月08日 22:24
 * @description
 */

public class Main_01 {

    public int alternatingSubarray(int[] nums) {
        int maxLen = -1;
        for (int i = 0; i < nums.length; i++) {
            int c = -1;
            int n = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j - 1] - nums[j] == c) {
                    c = -c;
                    n++;
                } else {
                    maxLen = Math.max(n, maxLen);
                    break;
                }
                if (j == nums.length - 1) {
                    maxLen = Math.max(n, maxLen);
                }
            }
            System.out.println();
        }
        return maxLen == 1?-1:maxLen;
    }

}
