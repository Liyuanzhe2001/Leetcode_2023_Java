package com.lyz.code;

import java.util.Arrays;

public class main_1262 {

    public int maxSumDivThree(int[] nums) {
        int[] dp = {0, Integer.MIN_VALUE, Integer.MIN_VALUE};
        for (int num : nums) {
            int[] tmp;
            tmp = Arrays.copyOf(dp, 3);
            for (int i = 0; i < 3; i++) {
                // 加num 或 不加num
                tmp[(i + num % 3) % 3] = Math.max(tmp[(i + num % 3) % 3], dp[i] + num);
            }
            dp = tmp;
        }
        return dp[0];
    }

}
