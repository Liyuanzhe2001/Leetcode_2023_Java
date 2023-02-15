package com.lyz.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main_offer_17 {

    public static void main(String[] args) {
        int[] ints = new main_offer_17().printNumbers(3);
        System.out.println(Arrays.toString(ints));

    }

    public int[] printNumbers(int n) {
        int len = (int) Math.pow(10, n);
        int[] res = new int[len - 1];
        for (int i = 1; i < len; i++) {
            res[i - 1] = i;
        }
        return res;
    }

}
