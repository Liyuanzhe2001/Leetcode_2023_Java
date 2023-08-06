package com.lyz.code.周赛357;

import java.util.Arrays;
import java.util.List;

/**
 * @author lkunk
 * @date 2023年08月06日 10:36
 * @description
 */

public class Main_02 {
    public boolean canSplitArray(List<Integer> nums, int m) {
        int n = nums.size();
        boolean[][] dp = new boolean[n + 1][m + 1];
        dp[0][0] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1) {
                    dp[i][j] = dp[i - 1][j];
                } else if (j == 1) {
                    dp[i][j] = dp[i][j - 1];
                } else {
                    dp[i][j] = dp[i - 1][j] && dp[i][j - 1] && nums.get(i - 1) + nums.get(j - 1) >= m;
                }
                if (dp[i][j] && j - i + 1 >= n) {
                    return true;
                }
            }
        }
        return false;
    }


}


/*
[8, 11, 7, 1, 3, 10, 1, 14, 3, 11, 9, 10, 10, 10, 5, 13, 5, 13, 1, 18, 1, 15, 2, 18]
21
 */
