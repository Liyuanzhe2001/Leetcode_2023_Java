package com.lyz.code.双周赛109;

import java.util.Arrays;

/**
 * @author lkunk
 * @date 2023年07月22日 22:26
 * @description
 */

public class Main_04 {

    public int numberOfWays(int n, int x) {
        int[] dp = new int[n + 1];
        int mod = (int) (1e9 + 7);
        for (int i = 1; i <= n; i++) {
            if ((int) Math.pow(i, x) <= n) {
                dp[(int) Math.pow(i, x)]++;
            }
            for (int j = i ; i + Math.pow(j, x) <= n; j++) {
                dp[(int) (i + Math.pow(j, x))] += dp[i] % mod;
            }
            System.out.println(Arrays.toString(dp));
        }
        return dp[n];
    }
}
