package com.lyz.code;

import java.util.Arrays;
import java.util.Comparator;

public class main_2545 {

    public static void main(String[] args) {

    }

    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score, (o1, o2) -> o1[k] - o2[k]);
        return score;
    }

}
