package com.lyz.code.双周赛103;

import java.util.HashMap;
import java.util.HashSet;

public class Main_02 {

    public static void main(String[] args) {

    }

    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] res = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = 0; j <= i; j++) {
                set.add(A[j]);
            }
            for (int j = 0; j <= i; j++) {
                if (set.contains(B[j])) {
                    res[i]++;
                }
            }
        }
        return res;
    }

}
