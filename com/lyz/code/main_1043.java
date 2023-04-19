package com.lyz.code;

import java.util.Arrays;

public class main_1043 {

    public static void main(String[] args) {
        int[] arr = {1, 15, 7, 9, 2, 5, 10};
        int k = 3;
        new main_1043().maxSumAfterPartitioning(arr, k);
    }

    public int maxSumAfterPartitioning(int[] arr, int k) {
        int[] dp = new int[arr.length];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            max = Math.max(arr[i], max);
            dp[i] = max * (i + 1);
        }

        for (int i = k; i < arr.length; i++) {
            max = Integer.MIN_VALUE;
            for (int j = 0; j < k; j++) {
                max = Math.max(max, arr[i - j]);
                dp[i] = Math.max(dp[i], max * (j + 1) + dp[i - j - 1]);
            }
        }
        return dp[dp.length - 1];
    }

}
