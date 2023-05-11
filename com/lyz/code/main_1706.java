package com.lyz.code;

import java.util.Arrays;

public class main_1706 {

    public static void main(String[] args) {
        int[][] grid = {{1, 1, 1, -1, -1}, {1, 1, 1, -1, -1}, {-1, -1, -1, 1, 1}, {1, 1, 1, 1, -1}, {-1, -1, -1, -1, -1}};
        System.out.println(Arrays.toString(new main_1706().findBall(grid)));
    }

    int[][] grid;

    public int[] findBall(int[][] grid) {
        this.grid = grid;
        int[] res = new int[grid[0].length];
        for (int i = 0; i < res.length; i++) {
            res[i] = dfs(0, i);
        }
        return res;
    }

    public int dfs(int x, int y) {
        if (x == grid.length) {
            return y;
        }
        if (y < 0 || y >= grid[0].length || (y == 0 && grid[x][y] == -1) || (y == grid[0].length - 1 && grid[x][y] == 1)) {
            return -1;
        } else if (grid[x][y] == 1) {
            if (grid[x][y + 1] == -1) {
                return -1;
            }
            return dfs(x + 1, y + 1);
        } else {
            if (grid[x][y - 1] == 1) {
                return -1;
            }
            return dfs(x + 1, y - 1);
        }
    }

}
