package com.lyz.code;

import java.util.Arrays;

public class main_135 {

    public static void main(String[] args) {

    }

    public int candy(int[] ratings) {
        int[] left = new int[ratings.length];
        int cnt = ratings.length;
        for (int i = 1; i < left.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                left[i] = left[i - 1] + 1;
            }
        }
        int[] rig = new int[ratings.length];
        for (int i = rig.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                rig[i] = rig[i + 1] + 1;
            }
        }
        for (int i = 0; i < left.length; i++) {
            cnt += Math.max(left[i], rig[i]);
        }
        return cnt;
    }

}
