package com.lyz.code.周赛345;

public class Main_03 {

    public static void main(String[] args) {

    }

    int[][] value;

    public int maxMoves(int[][] grid) {
        int res = 0;
        value = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            res = Math.max(dfs(grid, 0, i, 0) - 1, res);
        }
        return res;
    }

    public int dfs(int[][] grid, int pre, int x, int y) {
        if (x >= grid.length || x < 0 || y >= grid[0].length || y < 0 || pre >= grid[x][y]) {
            return 0;
        }
        if (value[x][y] != 0) {
            return value[x][y];
        }
        int res = 0;
        res = Math.max(dfs(grid, grid[x][y], x - 1, y + 1), res);
        res = Math.max(dfs(grid, grid[x][y], x, y + 1), res);
        res = Math.max(dfs(grid, grid[x][y], x + 1, y + 1), res);
        value[x][y] = res;
        return 1 + res;
    }

}
