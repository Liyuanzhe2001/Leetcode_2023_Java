package com.lyz.code.周赛343;

import java.lang.reflect.Parameter;
import java.util.HashMap;

public class Main_02 {

    public static void main(String[] args) {
        // [1,4,5,2,6,3]
        //[[4,3,5],[1,2,6]]
        // 1
        int[] arr = {1, 4, 5, 2, 6, 3};
        int[][] mat = {{4, 3, 5}, {1, 2, 6}};
        System.out.println(new Main_02().firstCompleteIndex(arr, mat));
    }

    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] rows = new int[m];
        int[] columns = new int[n];
        HashMap<Integer, int[]> map = new HashMap<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                map.put(mat[i][j], new int[]{i, j});
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int row = map.get(arr[i])[0];
            int column = map.get(arr[i])[1];
            rows[row]++;
            columns[column]++;
            if (rows[row] == n || columns[column] == m) {
                return i;
            }
        }
        return arr.length - 1;
    }
}
