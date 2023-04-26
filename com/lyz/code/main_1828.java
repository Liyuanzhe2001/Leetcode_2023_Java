package com.lyz.code;

public class main_1828 {

    public static void main(String[] args) {

    }

    public int[] countPoints(int[][] points, int[][] queries) {
        int[] res = new int[queries.length];
        for (int[] point : points) {
            for (int i = 0; i < queries.length; i++) {
                if (Math.pow(point[0] - queries[i][0], 2) + Math.pow(point[1] - queries[i][1], 2) <= Math.pow(queries[i][1], 2)) {
                    res[i]++;
                }
            }
        }
        return res;
    }

}
