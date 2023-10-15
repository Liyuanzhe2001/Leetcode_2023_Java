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
        long ll = 1L;
        for (int[] ints : grid) {
            for (int anInt : ints) {
                if (anInt % 12345 != 0) {
                    ll *= anInt % 12345;
                }
            }
        }
        int[][] res = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int tmp = grid[i][j] % 12345;
                if (tmp != 0) {
                    res[i][j] = (int) ((ll / tmp) % 12345);
                } else {
                    res[i][j] = (int) (ll % 12345);
                }
            }
        }
        return res;
    }
}
