package com.lyz.code;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

public class main_240 {

    public static void main(String[] args) {
        int[][] matrix = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int target = 5;
        boolean b = new main_240().searchMatrix(matrix, target);
        System.out.println(b);
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0, j = n - 1; i < m && j >= 0; ) {
            int nums = matrix[i][j];
            if (nums == target) {
                return true;
            } else if (nums > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }

    public boolean search(int i, int j, int[][] matrix, int target) {
        int value = matrix[i][j];
        matrix[i][j] = 0;
        if (value == target) {
            return true;
        }
        if (value == 0) {
            return false;
        }
        // 如果当前值小于目标值，优先往右走，如果右边为边界，向下走
        if (value < target) {
            if (i == matrix[0].length) {
                // 下移
                return search(i, j + 1, matrix, target);
            } else {
                // 右移
                return search(i + 1, j, matrix, target);
            }
        } else {
            if (i == 0) {
                // 上移
                return search(i, j - 1, matrix, target);
            } else {
                // 左移
                return search(i - 1, j + 1, matrix, target);
            }
        }
    }


}
