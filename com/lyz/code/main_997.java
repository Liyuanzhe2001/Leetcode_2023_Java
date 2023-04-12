package com.lyz.code;

import java.util.HashMap;
import java.util.HashSet;

public class main_997 {

    public static void main(String[] args) {

    }

    public int findJudge(int n, int[][] trust) {
        boolean[] person = new boolean[n + 1];
        int[] believe = new int[n + 1];
        for (int[] ints : trust) {
            person[ints[0]] = true;
            believe[ints[1]]++;
        }
        for (int i = 1; i < person.length; i++) {
            if (!person[i] && believe[i] == n - 1) {
                return i;
            }
        }
        return -1;
    }

}
