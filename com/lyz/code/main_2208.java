package com.lyz.code;

import java.util.Comparator;
import java.util.PriorityQueue;

public class main_2208 {

    public static void main(String[] args) {
//        int[] nums = {5, 19, 8, 1};
        int[] nums = {3,8,20};
        System.out.println(new main_2208().halveArray(nums));
    }

    public int halveArray(int[] nums) {
        PriorityQueue<Double> queue = new PriorityQueue<>((o1, o2) -> o2 - o1 > 0 ? 1 : -1);
        double sum = 0;
        for (int num : nums) {
            sum += num;
            queue.add((double) num);
        }

        double tmp = sum;
        int n = 0;

        while (tmp > sum / 2) {
            n++;
            Double poll = queue.poll();
            tmp -= (poll/2);
            queue.add(poll/2);
        }
        return n;
    }

}
