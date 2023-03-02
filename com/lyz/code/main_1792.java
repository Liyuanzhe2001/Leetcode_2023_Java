package com.lyz.code;

import java.util.Arrays;
import java.util.Comparator;

public class main_1792 {

    public static void main(String[] args) {
//        int[][] classes = {{1, 2}, {3, 5}, {2, 2}};
        int[][] classes = {{2, 4}, {3, 9}, {4, 5}, {2, 10}};
        int extraStudents = 4;
        System.out.println(new main_1792().maxAverageRatio(classes, extraStudents));
    }

    public double maxAverageRatio(int[][] classes, int extraStudents) {
        Arrays.sort(classes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                double v1 = (1.0 * o1[0]) / o1[1];
                double v2 = (1.0 * o2[0]) / o2[1];
                return v1 - v2 > 0 ? -1 : 1;
            }
        });
        for (int[] aClass : classes) {
            System.out.println(Arrays.toString(aClass));
        }


        double avg = 0;
        for (int i = 0; i < extraStudents; i++) {
            double max = Double.MIN_VALUE;
            int maxIndex = -1;
            for (int j = 0; j < classes.length; j++) {
                double tmp = ((1.0 * classes[j][0] + 1) / (classes[j][1] + 1)) - ((1.0 * classes[j][0]) / (classes[j][1]));
                if (tmp > max) {
                    max = tmp;
                    maxIndex = j;
                }
            }
            classes[maxIndex][0]++;
            classes[maxIndex][1]++;
        }
        for (int[] aClass : classes) {
            avg += 1.0 * aClass[0] / aClass[1] / classes.length;
        }
        return avg;
    }

}
