package com.lyz.code;

public class main_1139 {

    public static void main(String[] args) {
//        int[][] grid = {{1, 1, 0, 0}};
//        int[][] grid = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
//        int[][] grid = {{1, 1}, {1, 0}};
//        int[][] grid = {{1, 1, 1}, {1, 1, 0}, {1, 1, 1}, {0, 1, 1}, {1, 1, 1}};
//        int[][] grid = {{0, 1, 0, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 0, 1, 1}, {1, 1, 1, 1, 0}, {0, 1, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 1, 1, 1, 1}, {1, 1, 1, 0, 1}};
        int[][] grid = {{0, 1, 1, 1, 1, 0}, {1, 1, 0, 1, 1, 0}, {1, 1, 0, 1, 0, 1}, {1, 1, 0, 1, 1, 1}, {1, 1, 0, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 0, 1, 1, 1, 1}, {0, 0, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}};
        System.out.println(new main_1139().largest1BorderedSquare(grid));
    }

    public int largest1BorderedSquare(int[][] grid) {
        int maxLen = 0;
        for (int i = 0; i < grid.length; i++) {
            int len = 0;
            if (grid.length - i < maxLen) {
                break;
            }
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    len++;
                    int tmpLen = len;
                    while (tmpLen > maxLen) {
                        if (tmpLen > grid.length - i) {
                            tmpLen--;
                            continue;
                        }
                        if (judge(i, j, tmpLen, grid)) {
                            maxLen = tmpLen;
                        }
                        tmpLen--;
                    }
                } else {
                    len = 0;
                }
            }
        }
        return maxLen * maxLen;
    }

    public boolean judge(int i, int j, int len, int[][] grid) {
        // 检查 i+1 行到 i+len-2 行下标为 j-len+1 和 j 是否为1
        for (int k = i + 1; k <= i + len - 2; k++) {
            if (grid[k][j - len + 1] != 1 || grid[k][j] != 1) {
                return false;
            }
        }

        // 检查 i+len 行 下标 j 到 j-len+1 是否为1
        for (int k = j - len + 1; k <= j; k++) {
            if (grid[i + len - 1][k] != 1) {
                return false;
            }
        }

        return true;
    }

}
