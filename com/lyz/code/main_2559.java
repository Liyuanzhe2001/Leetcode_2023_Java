package com.lyz.code;

import java.util.Arrays;

public class main_2559 {

    public static void main(String[] args) {

    }

    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] preSum = new int[words.length];
        int pre = 0;
        for (int i = 0; i < words.length; i++) {
            char c1 = words[i].charAt(0);
            char c2 = words[i].charAt(words[i].length() - 1);
            if ((c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u') && (c2 == 'a' || c2 == 'e' || c2 == 'i' || c2 == 'o' || c2 == 'u')) {
                pre++;
            }
            preSum[i] = pre;
        }
        System.out.println(Arrays.toString(preSum));
        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            res[i] = preSum[queries[i][1]] - ((queries[i][0] - 1) >= 0 ? preSum[queries[i][0] - 1] : 0);
        }
        return res;
    }

}
