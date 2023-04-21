package com.lyz.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class main_130 {

    public static void main(String[] args) {
        char[][] board = {
                {'X', 'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'O', 'X'},
                {'X', 'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X', 'X'}
        };
        new main_130().solve(board);
    }

    boolean flag = false;

    public void solve(char[][] board) {
        for (int i = 1; i < board.length - 1; i++) {
            for (int j = 1; j < board[i].length - 1; j++) {
//                System.out.println(i + " " + j + " " + (board[i][j] == 'O'));
                if (board[i][j] == 'O') {
                    flag = false;
                    List<int[]> fillList = new ArrayList<>();
                    dfs(board, i, j, fillList, new boolean[board.length][board[0].length]);
                    if (!flag) {
                        for (int[] ints : fillList) {
                            board[ints[0]][ints[1]] = 'X';
                        }
                    }
                    System.out.println(i + " " + j + " " + flag);
                    for (char[] chars : board) {
                        System.out.println(Arrays.toString(chars));
                    }
                    System.out.println("++==================================++");
                }
            }
        }
    }

    public void dfs(char[][] board, int x, int y, List<int[]> res, boolean[][] visited) {
        if (board[x][y] == 'X' || visited[x][y]) {
            return;
        }
        if (x == board.length - 1 || y == board[0].length - 1 || x == 0 || y == 0) {
            flag = true;
            return;
        }
        res.add(new int[]{x, y});
        visited[x][y] = true;
        dfs(board, x + 1, y, res, visited);
        dfs(board, x - 1, y, res, visited);
        dfs(board, x, y + 1, res, visited);
        dfs(board, x, y - 1, res, visited);
    }

}

/**
 * ["X","O","X","O","X","O"]
 * ["O","X","X","X","X","X"]
 * ["X","X","X","X","X","O"]
 * ["O","X","O","X","O","X"]
 */
