package com.lyz.code;

import java.util.Arrays;

public class main_1605 {
    public static void main(String[] args) {
//        int[] rowSum = {3, 8};
        int[] rowSum = {5,7,10};
//        int[] colSum = {4, 7};
        int[] colSum = {8, 6, 8};
        int[][] ints = new main_1605().restoreMatrix(rowSum, colSum);
        for (int[] anInt : ints) {
            System.out.println(Arrays.toString(anInt));
        }
    }

    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int rLen = rowSum.length;
        int cLen = colSum.length;
        int[][] res = new int[rLen][cLen];
        for (int i = 0; i < rLen; i++) {
            for (int j = 0; j < cLen; j++) {
                int tmp = Math.min(rowSum[i], colSum[j]);
                res[i][j] = tmp;
                rowSum[i] -= tmp;
                colSum[j] -= tmp;
            }
        }
        return res;
    }
}
