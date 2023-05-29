package com.lyz.code.周赛347;

import java.util.HashSet;
import java.util.Set;

public class Main_02 {

    public static void main(String[] args) {

    }

    public int[][] differenceOfDistinctValues(int[][] grid) {
        int[][] answer = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                answer[i][j] = Math.abs(calTopLeft(grid, i, j) - calBottomRight(grid, i, j));
            }
        }
        return answer;
    }

    public int calTopLeft(int[][] grid, int x, int y) {
        Set<Integer> set = new HashSet<>();
        for (int i = x - 1, j = y - 1; i >= 0 && j >= 0; i--, j--) {
            set.add(grid[i][j]);
        }
        return set.size();
    }

    public int calBottomRight(int[][] grid, int x, int y) {
        Set<Integer> set = new HashSet<>();
        for (int i = x + 1, j = y + 1; i < grid.length && j < grid[0].length; i++, j++) {
            set.add(grid[i][j]);
        }
        return set.size();
    }


}
