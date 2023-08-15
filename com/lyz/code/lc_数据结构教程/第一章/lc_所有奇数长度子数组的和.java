package com.lyz.code.lc_数据结构教程.第一章;

import java.util.Arrays;

/**
 * @author lkunk
 * @date 2023年08月14日 23:56
 * @description
 */

public class lc_所有奇数长度子数组的和 {
//    int res = 0;
//
//    public int sumOddLengthSubarrays(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            dfs(arr, 0, i, 0);
//        }
//        return res;
//    }
//
//    public void dfs(int[] arr, int sum, int index, int n) {
//        if (n % 2 == 1) {
//            res += sum;
//        }
//        if (index == arr.length) {
//            return;
//        }
//        sum += arr[index];
//        dfs(arr, sum, index + 1, n + 1);
//    }

    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int res = 0;
        int[] preSum = new int[n + 1];
        for (int i = 0; i < arr.length; i++) {
            preSum[i + 1] = preSum[i] + arr[i];
            res += arr[i];
        }
        System.out.println(Arrays.toString(preSum));
        for (int i = 0; i < n; i++) {
            for (int j = i + 2; j < n; j++) {
                if ((j - i) % 2 == 0) {
                    res += preSum[j + 1] - preSum[i];
                }
            }
        }
        return res;
    }

}
