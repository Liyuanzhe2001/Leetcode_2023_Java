/*
package com.lyz.code;

import java.util.Arrays;

*/
/**
 * @author lkunk
 * @date 2023年08月17日 23:30
 * @description
 *//*


public class main_1444 {
//    // 会超时的递归代码
//    public static final int MOD = (int) 1e9 + 7;
//
//    public int ways(String[] pizza, int k) {
//        MatrixSum ms = new MatrixSum(pizza);
//        return dfs(k - 1, 0, 0, ms, pizza.length, pizza[0].length());
//    }
//
//    private int dfs(int c, int i, int j, MatrixSum ms, int m, int n) {
//        // 递归边界：无法再切了
//        if (c == 0) {
//            return ms.query(i, j, m, n) > 0 ? 1 : 0;
//        }
//        int res = 0;
//        // 垂直切
//        for (int j2 = j + 1; j2 < n; j2++) {
//            // 有苹果
//            if (ms.query(i, j, m, j2) > 0) {
//                res = (res + dfs(c - 1, i, j2, ms, m, n)) % MOD;
//            }
//        }
//        // 水平切
//        for (int i2 = i + 1; i2 < m; i2++) {
//            // 有苹果
//            if (ms.query(i, j, i2, n) > 0) {
//                res = (res + dfs(c - 1, i2, j, ms, m, n)) % MOD;
//            }
//        }
//        return res;
//    }

    public static final int MOD = (int) 1e9 + 7;

    public int ways(String[] pizza, int k) {
        MatrixSum ms = new MatrixSum(pizza);
        int m = pizza.length, n = pizza[0].length();
        var memo = new int[k][m][n];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < m; j++) {
                // -1 表示没有计算过
                Arrays.fill(memo[i][j], -1);
            }
        }
        return dfs(k - 1, 0, 0, memo, ms, m, n);
    }

    private int dfs(int c, int i, int j, int[][][] memo, MatrixSum ms, int m, int n) {
        // 递归边界：无法再切了
        if (c == 0) {
            return ms.query(i, j, m, n) > 0 ? 1 : 0;
        }
        // 之前计算过
        if (memo[c][i][j] != -1) {
            return memo[c][i][j];
        }
        int res = 0;
        // 垂直切
        for (int j2 = j + 1; j2 < n; j2++) {
            // 有苹果
            if (ms.query(i, j, m, j2) > 0) {
                res = (res + dfs(c - 1, i, j2, memo, ms, m, n)) % MOD;
            }
        }
        // 水平切
        for (int i2 = i + 1; i2 < m; i2++) {
            // 有苹果
            if (ms.query(i, j, i2, n) > 0) {
                res = (res + dfs(c - 1, i2, j, memo, ms, m, n)) % MOD;
            }
        }
        // 记忆化
        return memo[c][i][j] = res;
    }
}

// 二维前缀和模板（'A' 的 ASCII 码最低位为 1，'.' 的 ASCII 码最低位为 0）
class MatrixSum {
    private final int[][] sum;

    public MatrixSum(String[] matrix) {
        int m = matrix.length, n = matrix[0].length();
        sum = new int[m + 1][n + 1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum[i + 1][j + 1] = sum[i + 1][j] + sum[i][j + 1] - sum[i][j] + (matrix[i].charAt(j) & 1);
            }
        }
    }

    // 返回左上角在 (r1,c1) 右下角在 (r2-1,c2-1) 的子矩阵元素和（类似前缀和的左闭右开）
    public int query(int r1, int c1, int r2, int c2) {
        return sum[r2][c2] - sum[r2][c1] - sum[r1][c2] + sum[r1][c1];
    }

}

// 二维前缀和模板（'A' 的 ASCII 码最低位为 1，'.' 的 ASCII 码最低位为 0）
//class MatrixSum {
//    private final int[][] sum;
//
//    public MatrixSum(String[] matrix) {
//        int m = matrix.length, n = matrix[0].length();
//        sum = new int[m + 1][n + 1];
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                sum[i + 1][j + 1] = sum[i + 1][j] + sum[i][j + 1] - sum[i][j] + (matrix[i].charAt(j) & 1);
//            }
//        }
//    }
//
//    // 返回左上角在 (r1,c1) 右下角在 (r2-1,c2-1) 的子矩阵元素和（类似前缀和的左闭右开）
//    public int query(int r1, int c1, int r2, int c2) {
//        return sum[r2][c2] - sum[r2][c1] - sum[r1][c2] + sum[r1][c1];
//    }
//}
*/
