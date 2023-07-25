package com.lyz.code;

import com.lyz.code.dataStructure.ListNode;

/**
 * @author lkunk
 * @date 2023年07月25日 21:07
 * @description
 */

public class main_2326 {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] res = new int[m][n];
        boolean[][] visited = new boolean[m][n];
        int[][] distance = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int index = 0;
        int x = 0;
        int y = 0;
        for (int i = 0; i < m * n; i++) {
            visited[x][y] = true;
            if (head == null) {
                res[x][y] = -1;
            } else {
                res[x][y] = head.val;
                head = head.next;
            }
            if (x + distance[index % 4][0] < 0 || x + distance[index % 4][0] >= m ||
                    y + distance[index % 4][1] < 0 || y + distance[index % 4][1] >= n ||
                    visited[x + distance[index % 4][0]][y + distance[index % 4][1]]) {
                index++;
            }
            x += distance[index % 4][0];
            y += distance[index % 4][1];
        }
        return res;
    }
}
