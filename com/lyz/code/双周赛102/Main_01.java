package com.lyz.code.双周赛102;

public class Main_01 {

    public static void main(String[] args) {

    }

    public int[] findColumnWidth(int[][] grid) {
        int[] res = new int[grid[0].length];
        for (int i = 0; i < grid[0].length; i++) {
            int len = 0;
            for (int j = 0; j < grid.length; j++) {
                len = Math.max(len, (grid[j][i] + "").length());
            }
            res[i] = len;
        }
        return res;
    }

}
