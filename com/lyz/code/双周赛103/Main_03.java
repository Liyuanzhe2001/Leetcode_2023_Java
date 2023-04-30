package com.lyz.code.双周赛103;

public class Main_03 {
    public static void main(String[] args) {

    }

    public int findMaxFish(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] != 0) {
                    max = Math.max(max, dfs(grid, i, j));
                }
            }
        }
        return max;
    }

    public int dfs(int[][] grid, int x, int y) {
        if (x < 0 || x > grid.length - 1 || y < 0 || y > grid[0].length - 1 || grid[x][y] == 0) {
            return 0;
        }
        int res = grid[x][y];
        grid[x][y] = 0;
        res += dfs(grid, x + 1, y);
        res += dfs(grid, x - 1, y);
        res += dfs(grid, x, y + 1);
        res += dfs(grid, x, y - 1);
        return res;
    }

}
