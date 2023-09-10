package com.lyz.code.周赛362;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author lkunk
 * @date 2023年09月10日 10:17
 * @description
 */

public class Main_03 {
    public int minimumMoves(int[][] grid) {
        int res = 0;
        int[][] dis = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] > 1) {
                    int v = grid[i][j];
                    grid[i][j] = 1;
                    int[][] visited = new int[3][3];
                    Queue<int[]> queue = new LinkedList<>();
                    queue.add(new int[]{i, j});
                    visited[i][j] = 1;
                    int tmp = -1;
                    while (!queue.isEmpty() && v > 1) {
                        int len = queue.size();
                        tmp++;
                        for (int p = 0; p < len; p++) {
                            int[] poll = queue.poll();
                            int x = poll[0];
                            int y = poll[1];
                            if (grid[x][y] == 0) {
                                grid[x][y] = 1;
                                res += tmp;
                                v--;
                            }
                            for (int[] d : dis) {
                                if (x + d[0] < 3 && x + d[0] >= 0 && y + d[1] < 3 && y + d[1] >= 0 && visited[x + d[0]][y + d[1]] != 0) {
                                    queue.add(new int[]{x + d[0], y + d[1]});
                                    visited[x + d[0]][y + d[1]] = 1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return res;
    }

}
