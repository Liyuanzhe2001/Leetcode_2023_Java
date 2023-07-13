package com.lyz.code;

import java.util.Arrays;

/**
 * @author lkunk
 * @date 2023年07月13日 20:49
 * @description
 */

public class main_931 {
    public int minFallingPathSum(int[][] matrix) {
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int tmp = matrix[i - 1][j];
                if (j - 1 >= 0) {
                    tmp = Math.min(tmp, matrix[i - 1][j - 1]);
                }
                if (j + 1 < matrix[i].length) {
                    tmp = Math.min(tmp, matrix[i - 1][j + 1]);
                }
                matrix[i][j] = matrix[i][j] + tmp;
            }
        }
        return Arrays.stream(matrix[matrix.length - 1]).min().getAsInt();
    }
}
