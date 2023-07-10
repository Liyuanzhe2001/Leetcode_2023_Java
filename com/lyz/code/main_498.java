package com.lyz.code;

/**
 * @author lkunk
 * @date 2023年07月10日 8:16
 * @description
 */

public class main_498 {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] res = new int[n * m];
        int index = 0;
        for (int i = 0; i < n + m - 1; i++) {
            if (i % 2 == 1) {
                int x = i < n ? 0 : i - n + 1;
                int y = i < n ? i : n - 1;
                while (x < m && y >= 0) {
                    res[index++] = mat[x][y];
                    x++;
                    y--;
                }
            } else {
                int x = i < m ? i : m - 1;
                int y = i < m ? 0 : i - m + 1;
                while (x >= 0 && y < n) {
                    res[index++] = mat[x][y];
                    x--;
                    y++;
                }
            }
        }
        return res;
    }
}
