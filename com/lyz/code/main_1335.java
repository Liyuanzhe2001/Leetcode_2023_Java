package com.lyz.code;

import java.util.Arrays;

public class main_1335 {

    public static void main(String[] args) {
        int[] jobDifficulty = {11, 111, 22, 222, 33, 333, 44, 444};
        int d = 6;
        System.out.println(new main_1335().minDifficulty(jobDifficulty, d));
    }

    public int minDifficulty(int[] jobDifficulty, int d) {
        int len = jobDifficulty.length;
        if (jobDifficulty.length < d) {
            return -1;
        }
        int[][] dp = new int[len + 1][d + 1];
        for (int i = 0; i <= len; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE / 2);
        }
        dp[0][0] = 0;
        for (int i = 1; i <= len; i++) {
            int job = 0;
            for (int p = i - 1; p >= 0; p--) {
                // 11, 111, 22, 222, 33, 333, 44, 444
                job = Math.max(job, jobDifficulty[p]);
                for (int j = Math.min(p + 1, d); j > 0; j--) {
                    dp[i][j] = Math.min(dp[i][j], dp[p][j - 1] + job);
                }
            }
        }
        return dp[len][d];
    }

}
