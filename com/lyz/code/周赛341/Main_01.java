package com.lyz.code.周赛341;

public class Main_01 {

    public static void main(String[] args) {

    }

    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxNums = -1;
        int maxIndex = -1;
        for (int i = 0; i < mat.length; i++) {
            int[] ints = mat[i];
            int cnt = 0;
            for (int anInt : ints) {
                if (anInt == 1) {
                    cnt++;
                }
            }
            if (cnt > maxNums) {
                maxNums = cnt;
                maxIndex = i;
            }
        }
        return new int[]{maxIndex, maxNums};
    }

}
