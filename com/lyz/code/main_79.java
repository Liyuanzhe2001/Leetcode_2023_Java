//package com.lyz.code;
//
//import java.util.Arrays;
//
//public class main_79 {
//
//    public static void main(String[] args) {
//        char[][] board = {{'a', 'b'}, {'c', 'd'}};
//        String word = "cdba";
//        System.out.println(new main_79().exist(board, word));
//    }
//
//    public boolean exist(char[][] board, String word) {
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board[i].length; j++) {
//                if (dfs(board, new boolean[board.length][board[0].length], i, j, word, 0)) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//
//    public boolean dfs(char[][] board, boolean[][] visited, int x, int y, String word, int index) {
//        if (index == word.length()) {
//            return true;
//        }
//        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length || visited[x][y]) {
//            return false;
//        }
//        if (board[x][y] == word.charAt(index)) {
//            visited[x][y] = true;
//            boolean[][] tmp;
//            tmp = visited;
//            boolean flag;
//            flag = dfs(board, tmp, x + 1, y, word, index + 1);
//            flag = flag || dfs(board, visited, x - 1, y, word, index + 1);
//            flag = flag || dfs(board, visited, x, y + 1, word, index + 1);
//            flag = flag || dfs(board, visited, x, y - 1, word, index + 1);
//            return flag;
//        } else {
//            return false;
//        }
//    }
//
//}
