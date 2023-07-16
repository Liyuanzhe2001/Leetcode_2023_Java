package com.lyz.code;

/**
 * @author lkunk
 * @date 2023年07月16日 23:40
 * @description
 */

public class main_1854 {
    public int maximumPopulation(int[][] logs) {
        int[] dp = new int[110];
        for (int[] log : logs) {
            dp[log[0] - 1950]++;
            dp[log[1] - 1950]--;
        }
        int s = 0, res = 0, cnt = 0;
        for (int i = 0; i <= 100; i++) {
            s += dp[i];
            if (s > cnt) {
                cnt = s;
                res = i;
            }
        }
        return res + 1950;
    }
}
