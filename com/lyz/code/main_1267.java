package com.lyz.code;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lkunk
 * @date 2023年08月24日 23:35
 * @description
 */

public class main_1267 {
    public int countServers(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Map<Integer, Integer> row = new HashMap<>();
        Map<Integer, Integer> col = new HashMap<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    row.put(i, row.getOrDefault(i, 0) + 1);
                    col.put(j, col.getOrDefault(j, 0) + 1);
                }
            }
        }
        int res = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 && (row.get(i) >= 2 || col.get(j) >= 2)) {
                    res++;
                }
            }
        }
        return res;
    }
}
