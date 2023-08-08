package com.lyz.code.lc_队列_栈;

import java.util.AbstractMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * @author lkunk
 * @date 2023年08月08日 22:51
 * @description
 */

public class lc_01矩阵 {
    public int[][] updateMatrix(int[][] mat) {
        int[][] distance = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[mat.length][mat[0].length];
        int[][] res = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 0) {
                    queue.add(new int[]{i, j});
                    visited[i][j] = true;
                }
            }
        }
        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            for (int i = 0; i < 4; i++) {
                int x = poll[0] + distance[i][0];
                int y = poll[1] + distance[i][1];
                if (x >= 0 && x < mat.length && y >= 0 && y < mat[0].length && !visited[x][y]) {
                    res[x][y] = res[poll[0]][poll[1]] + 1;
                    queue.add(new int[]{x, y});
                    visited[x][y] = true;
                }
            }
        }
        return res;
    }

}
