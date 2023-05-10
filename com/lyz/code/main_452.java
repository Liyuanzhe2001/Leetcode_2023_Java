package com.lyz.code;

import java.util.Arrays;
import java.util.Comparator;

public class main_452 {

    public static void main(String[] args) {
        int[][] points = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        System.out.println(new main_452().findMinArrowShots(points));
    }

    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(o -> o[0]));
        int res = 1;
        int end = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] < end) {
                end = Math.min(end,points[i][1]);
            }else {
                end = points[i][1];
                res++;
            }
        }
        return res;
    }
}
