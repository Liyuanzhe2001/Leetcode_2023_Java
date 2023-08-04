package com.lyz.code;

/**
 * @author lkunk
 * @date 2023年08月04日 23:19
 * @description
 */

public class main_980 {

    public int uniquePathsIII(int[][] grid) {
        int x = 0;
        int y = 0;
        int n = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    x = i;
                    y = j;
                }
                if (grid[i][j] == 0) {
                    n++;
                }
            }
        }
        return dfs(grid, x, y, n);
    }

    public int dfs(int[][] grid, int x, int y, int n) {
        if (x < 0 || x >= grid.length ||
                y < 0 || y >= grid[0].length ||
                grid[x][y] == -1) {
            return 0;
        }
        if (grid[x][y] == 2) {
            return n == 0 ? 1 : 0;
        }
        n--;
        grid[x][y] = -1;
        int res = dfs(grid, x + 1, y, n) + dfs(grid, x - 1, y, n) + dfs(grid, x, y + 1, n) + dfs(grid, x, y - 1, n);
        grid[x][y] = 0;
        return res;
    }
}
