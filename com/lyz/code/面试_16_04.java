package com.lyz.code;

public class 面试_16_04 {

    public static void main(String[] args) {
        String[] strings = {
                "   X O  O ",
                " X X    O ",
                "X  X    O ",
                "X    OX O ",
                "X   XO  O ",
                "X  X O  O ",
                "O  X O  O ",
                "     O  OX",
                "     O  O ",
                "   X XXXO "
        };
        System.out.println(new 面试_16_04().tictactoe(strings));
    }

    public String tictactoe(String[] board) {
        char c = searchDiagonal(board);
        if (c != 0) {
            return c + "";
        }
        for (int i = 0; i < board.length; i++) {
            c = board[i].charAt(0);
            if (c != ' ') {
                if (searchLine(c, board, i, 1)) {
                    return c + "";
                }
            }
            c = board[0].charAt(i);
            if (c != ' ') {
                if (searchColumn(c, board, 1, i)) {
                    return c + "";
                }
            }
        }
        if (searchNull(board)) {
            return "Pending";
        } else {
            return "Draw";
        }
    }

    // 检查有无空格
    boolean searchNull(String[] board) {
        for (String s : board) {
            if (s.indexOf(' ') >= 0) {
                return true;
            }
        }
        return false;
    }

    // 行检查
    boolean searchLine(char c, String[] board, int x, int y) {
        if (y > board.length - 1) {
            return true;
        }
        if (c != board[x].charAt(y)) {
            return false;
        }
        return searchLine(c, board, x, y + 1);
    }

    // 列检查
    boolean searchColumn(char c, String[] board, int x, int y) {
        if (x > board.length - 1) {
            return true;
        }
        if (c != board[x].charAt(y)) {
            return false;
        }
        return searchColumn(c, board, x + 1, y);
    }

    // 对角线检查
    char searchDiagonal(String[] board) {
        char c1 = board[0].charAt(0);
        char c2 = board[0].charAt(board.length - 1);
        boolean flag1 = c1 != ' ';
        boolean flag2 = c2 != ' ';
        for (int i = 1; i < board.length; i++) {
            if (flag1) {
                if (board[i].charAt(i) != c1) {
                    flag1 = false;
                }
            }
            if (flag2) {
                if (board[i].charAt(board.length - i - 1) != c2) {
                    flag2 = false;
                }
            }
            if (!flag1 && !flag2) {
                return 0;
            }
        }
        if (flag1) {
            return c1;
        } else {
            return c2;
        }
    }

}
