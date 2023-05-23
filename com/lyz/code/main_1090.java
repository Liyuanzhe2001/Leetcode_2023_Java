package com.lyz.code;

import java.util.Arrays;
import java.util.HashMap;

public class main_1090 {

    public static void main(String[] args) {

    }

    public int largestValsFromLabels(int[] values, int[] labels, int numWanted, int useLimit) {
        int[][] pairs = new int[values.length][2];
        for (int i = 0; i < pairs.length; i++) {
            pairs[i][0] = values[i];
            pairs[i][1] = labels[i];
        }
        Arrays.sort(pairs, (o1, o2) -> o2[0] - o1[0]);
        HashMap<Integer, Integer> cnt = new HashMap<>();
        int res = 0;
        int num = 0;
        for (int i = 0; i < pairs.length && num < numWanted; i++) {
            int value = pairs[i][0];
            int label = pairs[i][1];
            if (cnt.getOrDefault(label, 0) < useLimit) {
                cnt.put(label, cnt.getOrDefault(label, 0) + 1);
                num++;
                res += value;
            }
        }
        return res;
    }

}
