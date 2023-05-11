package com.lyz.code;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class main_973 {

    public static void main(String[] args) {
        int[][] points = {{-5, 4}, {-6, -5}, {4, 6}};
        int k = 2;
        int[][] ints = new main_973().kClosest(points, k);
        System.out.println(Arrays.deepToString(ints));
    }

    public int[][] kClosest(int[][] points, int k) {
        Queue<int[]> queue = new PriorityQueue<>((o1, o2) -> Math.sqrt(Math.abs(Math.pow(o1[0], 2) + Math.pow(o1[1], 2))) > Math.sqrt(Math.abs(Math.pow(o2[0], 2) + Math.pow(o2[1], 2))) ? 1 : -1);
        queue.addAll(Arrays.asList(points));
        System.out.println(Arrays.deepToString(points));
        int[][] res = new int[k][2];
        for (int i = 0; i < res.length; i++) {
            res[i] = queue.poll();
        }
        return res;
    }

}
