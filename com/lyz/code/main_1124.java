package com.lyz.code;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class main_1124 {

    public static void main(String[] args) {
        int[] hours = new int[]{9, 9, 6, 0, 6, 6, 9};
        System.out.println(new main_1124().longestWPI(hours));
    }

    public int longestWPI(int[] hours) {
        int len = hours.length;
        int[] n = new int[len + 1];
        n[0] = 0;
        for (int i = 1; i < n.length; i++) {
            n[i] = n[i - 1] + (hours[i - 1] > 8 ? 1 : -1);
        }

        int res = 0;
        for (int i = n.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if ((n[i] - n[j] > 0)) {
                    res = Math.max(res, i - j);
                    break;
                }
            }
        }

        return res;
    }

}
