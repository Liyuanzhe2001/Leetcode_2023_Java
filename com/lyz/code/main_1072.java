package com.lyz.code;

import java.util.Arrays;
import java.util.HashMap;

public class main_1072 {

    public static void main(String[] args) {
        int[][] matrix = {{0, 0, 0}, {0, 0, 1}, {1, 1, 0}};
        System.out.println(new main_1072().maxEqualRowsAfterFlips(matrix));
    }

    public int maxEqualRowsAfterFlips(int[][] matrix) {
        int ans = 0;
        int n = matrix[0].length;
        var cnt = new HashMap<String, Integer>();
        for (int[] row : matrix) {
            int[] r = new int[n];
            for (int i = 0; i < n; i++) {
                r[i] = row[i] ^ row[0];
            }
            int c = cnt.merge(Arrays.toString(r), 1, Integer::sum);
            ans = Math.max(ans, c);
        }
        return ans;
    }
}
