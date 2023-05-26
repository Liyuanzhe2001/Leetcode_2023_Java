package com.lyz.code;

import java.util.*;

public class main_1091 {

    public static void main(String[] args) {
        int[][] grid = {{0, 0, 0}, {1, 1, 0}, {1, 1, 0}};
        System.out.println(new main_1091().shortestPathBinaryMatrix(grid));
    }

    public int shortestPathBinaryMatrix(int[][] grid) {
        if (grid[0][0] != 0) {
            return -1;
        }
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{0, 0});
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int res = 1;
        visited[0][0] = true;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                int[] poll = queue.poll();
                int x = poll[0];
                int y = poll[1];
                if (x == grid.length - 1 && y == grid[0].length - 1) {
                    return res;
                }
                if (x + 1 < grid.length) {
                    if (!visited[x + 1][y] && grid[x + 1][y] == 0) {
                        queue.add(new int[]{x + 1, y});
                        visited[x + 1][y] = true;
                    }
                    if (y - 1 >= 0 && !visited[x + 1][y - 1] && grid[x + 1][y - 1] == 0) {
                        queue.add(new int[]{x + 1, y - 1});
                        visited[x + 1][y - 1] = true;
                    }
                    if (y + 1 < grid[0].length && !visited[x + 1][y + 1] && grid[x + 1][y + 1] == 0) {
                        queue.add(new int[]{x + 1, y + 1});
                        visited[x + 1][y + 1] = true;
                    }
                }
                if (x - 1 >= 0) {
                    if (!visited[x - 1][y] && grid[x - 1][y] == 0) {
                        queue.add(new int[]{x - 1, y});
                        visited[x - 1][y] = true;
                    }
                    if (y + 1 < grid[0].length && !visited[x - 1][y + 1] && grid[x - 1][y + 1] == 0) {
                        queue.add(new int[]{x - 1, y + 1});
                        visited[x - 1][y + 1] = true;
                    }
                    if (y - 1 >= 0 && !visited[x - 1][y - 1] && grid[x - 1][y - 1] == 0) {
                        queue.add(new int[]{x - 1, y - 1});
                        visited[x - 1][y - 1] = true;
                    }
                }
                if (y - 1 >= 0) {
                    if (!visited[x][y - 1] && grid[x][y - 1] == 0) {
                        queue.add(new int[]{x, y - 1});
                        visited[x][y - 1] = true;
                    }
                }
                if (y + 1 < grid[0].length) {
                    if (!visited[x][y + 1] && grid[x][y + 1] == 0) {
                        queue.add(new int[]{x, y + 1});
                        visited[x][y + 1] = true;
                    }
                }
            }
            res++;
        }
        return -1;
    }

}
