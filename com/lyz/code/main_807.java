package com.lyz.code;

public class main_807 {

    public static void main(String[] args) {

    }

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
        int[] north = new int[n];
        int[] west = new int[n];

        for (int i = 0; i < n; i++) {
            int maxWest = Integer.MIN_VALUE;
            int maxNorth = Integer.MIN_VALUE;
            for (int j = 0; j < n; j++) {
                maxWest = Math.max(maxWest, grid[i][j]);
                maxNorth = Math.max(maxNorth, grid[j][i]);
            }
            north[i] = maxNorth;
            west[i] = maxWest;
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res += Math.min(north[i], west[j]) - grid[i][j];
            }
        }
        return res;
    }

}
