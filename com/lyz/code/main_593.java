package com.lyz.code;

import java.util.HashSet;
import java.util.Set;

public class main_593 {

    public static void main(String[] args) {
//        int[] p1 = {0, 0};
//        int[] p2 = {1, 1};
//        int[] p3 = {1, 0};
//        int[] p4 = {0, 1};
//        int[] p1 = {0,0};
//        int[] p2 = {1,1};
//        int[] p3 = {1,0};
//        int[] p4 = {0,12};
        int[] p1 = {1134, -2539};
        int[] p2 = {492, -1255};
        int[] p3 = {-792, -1897};
        int[] p4 = {-150, -3181};
        System.out.println(new main_593().validSquare(p1, p2, p3, p4));
    }

    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        Set<Double> set = new HashSet<>();
        int[][] p = {p1, p2, p3, p4};
        for (int i = 0; i < p.length; i++) {
            for (int j = i + 1; j < p.length; j++) {
                double len = Math.sqrt(Math.pow((p[i][0] - p[j][0]), 2) + Math.pow((p[i][1] - p[j][1]), 2));
                set.add(len);
            }
        }
        if (set.size() != 2) {
            return false;
        }
        double min = Integer.MAX_VALUE;
        double max = Integer.MIN_VALUE;
        for (Double s : set) {
            min = Math.min(s, min);
            max = Math.max(s, max);
        }
        System.out.println(Math.sqrt(2 * min * min));
        System.out.println(max);
        return (int)Math.sqrt(2 * min * min) == (int)max;
    }

}
