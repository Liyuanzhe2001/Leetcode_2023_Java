package com.lyz.code;

import java.util.Arrays;
import java.util.HashMap;

public class main_1122 {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 0};
        int[] arr2 = {4, 1, 3};
        System.out.println(Arrays.toString(new main_1122().relativeSortArray(arr1, arr2)));
    }

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] map = new int[1001];

        for (int a : arr1) {
            map[a]++;
        }
        int i = 0;
        for (int k : arr2) {
            int end = i + map[k];
            for (; i < end; i++) {
                arr1[i] = k;
            }
            map[k] = 0;
        }

        for (int j = 0; j < map.length && i != arr1.length; j++) {
            if (map[j] != 0) {
                int end = i + map[j];
                for (; i < end; i++) {
                    arr1[i] = j;
                }
                map[j] = 0;
            }
        }

        return arr1;
    }
}
