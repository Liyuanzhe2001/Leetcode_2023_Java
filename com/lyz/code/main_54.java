package com.lyz.code;

import java.util.ArrayList;
import java.util.List;

public class main_54 {

    public static void main(String[] args) {

    }

    int[][] directions = {
            {0, 1}, {1, 0}, {0, -1}, {-1, 0}
    };

    List<Integer> res = new ArrayList<>();

    public List<Integer> spiralOrder(int[][] matrix) {
        dfs(0, matrix, new boolean[matrix.length][matrix[0].length], 0, 0, 0);
        return res;
    }

    public void dfs(int cnt, int[][] matrix, boolean[][] visited, int n, int x, int y) {
        if (cnt == matrix.length * matrix[0].length) {
            return;
        }
        res.add(matrix[x][y]);
        visited[x][y] = true;
        if (x + directions[n % 4][0] < 0 || x + directions[n % 4][0] == matrix.length || y + directions[n % 4][1] < 0 || y + directions[n % 4][1] == matrix[0].length || visited[x + directions[n % 4][0]][y + directions[n % 4][1]]) {
            n++;
        }
        dfs(cnt + 1, matrix, visited, n, x + directions[n % 4][0], y + directions[n % 4][1]);
    }

}
