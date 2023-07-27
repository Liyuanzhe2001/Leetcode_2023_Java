package com.lyz.code;

import java.util.Arrays;

/**
 * @author lkunk
 * @date 2023年07月27日 23:34
 * @description
 */

public class main_2500 {
    public int deleteGreatestValue(int[][] grid) {
        for (int[] ints : grid) {
            Arrays.sort(ints);
        }
        System.out.println(grid);
        int res = 0;
        for (int i = 0; i < grid[0].length; i++) {
            int max = 0;
            for (int j = 0; j < grid.length; j++) {
                max = Math.max(grid[j][i], max);
            }
            System.out.println(max);
            res += max;
        }
        return res;
    }
}
