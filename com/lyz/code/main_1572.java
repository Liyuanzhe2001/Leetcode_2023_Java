package com.lyz.code;

/**
 * @author lkunk
 * @date 2023年08月11日 22:25
 * @description
 */

public class main_1572 {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += mat[i][i] + mat[i][n - i - 1];
            if (i == n - i - 1) {
                res -= mat[i][i];
            }
        }
        return res;
    }
}
