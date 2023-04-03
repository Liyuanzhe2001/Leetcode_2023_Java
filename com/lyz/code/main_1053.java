package com.lyz.code;

import java.util.Arrays;

public class main_1053 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new main_1053().prevPermOpt1(new int[]{3,1,1,3})));
    }

    public int[] prevPermOpt1(int[] arr) {
        int[] arrIndex = new int[10];
        boolean[] arrVisit = new boolean[10];
        int tmp = arr[arr.length - 1];
        arrVisit[arr[arr.length - 1]] = true;
        arrIndex[arr[arr.length - 1]] = arr.length - 1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (tmp < arr[i]) {
                for (int j = arr[i] - 1; j >= 0; j--) {
                    if (arrVisit[j]) {
                        int temp = arr[arrIndex[j]];
                        arr[arrIndex[j]] = arr[i];
                        arr[i] = temp;
                        return arr;
                    }
                }
                break;
            } else {
//                if (!arrVisit[arr[i]]) {
                    arrVisit[arr[i]] = true;
                    arrIndex[arr[i]] = i;
//                }
                tmp = arr[i];
            }
        }
        return arr;
    }
}
