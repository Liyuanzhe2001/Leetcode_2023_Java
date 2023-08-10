package com.lyz.code;

import java.util.Arrays;

/**
 * @author lkunk
 * @date 2023年08月10日 23:04
 * @description
 */

public class main_1289 {
    public int minFallingPathSum(int[][] grid) {
        int n = grid.length;
        int[][] dp = new int[n][n];
        System.arraycopy(grid[0], 0, dp[0], 0, n);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int min = Integer.MAX_VALUE;
                for (int k = 0; k < n; k++) {
                    if (k != j) {
                        min = Math.min(min, dp[i - 1][k]);
                    }
                }
                dp[i][j] = grid[i][j] + min;
            }
        }
        return Arrays.stream(dp[n - 1]).min().getAsInt();
    }
}
