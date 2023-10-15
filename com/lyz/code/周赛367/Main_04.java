package com.lyz.code.周赛367;

import java.math.BigInteger;

/**
 * @author lkunk
 * @date 2023年10月15日 10:23
 * @description
 */

public class Main_04 {
    public int[][] constructProductMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] res = new int[n][m];

        int value = 1;
        for (int k = 0; k < n; k++) {
            for (int l = 0; l < m; l++) {
                if (k != 0 || l != 0) {
                    value = (value * grid[k][l]) % 12345;
                }
            }
        }
        grid[0][0] = value == 0 ? 12345 : value;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i != 0 && j != 0) {
                    res[i][j] = (grid[0][0] * res[0][0] / grid[i][j]) % 12345;
                }
            }
        }
        res[0][0] = res[0][0] % 12345;
        return res;
    }
}
