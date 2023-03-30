package com.lyz.code;

import java.util.Arrays;
import java.util.Comparator;

public class main_1637 {

    public static void main(String[] args) {
        int[][] points = {
                {3, 1}, {9, 0}, {1, 0}, {1, 4}, {5, 3}, {8, 8}
        };
        System.out.println(new main_1637().maxWidthOfVerticalArea(points));
    }

    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(o -> o[0]));
        int res = Integer.MIN_VALUE;
        for (int i = 1; i < points.length; i++) {
            res = Math.max(points[i][0] - points[i - 1][0], res);
        }
        return res;
    }

}
