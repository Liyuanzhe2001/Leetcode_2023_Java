//package com.lyz.code;
//
//import java.util.Arrays;
//
//public class main_1723 {
//
//    public static void main(String[] args) {
//        int[] jobs = {12, 13, 14, 17, 25};
//        int k = 3;
//        System.out.println(new main_1723().minimumTimeRequired(jobs, k));
//    }
//
//    public int minimumTimeRequired(int[] jobs, int k) {
//        int sum = 0;
//        for (int job : jobs) {
//            sum += job;
//        }
//        int minTime = (int) Math.ceil((1.0 * sum) / k);
//
//        Arrays.sort(jobs);
//
//        if (jobs.length <= k) {
//            return jobs[jobs.length - 1];
//        }
//
//        while (true) {
//            int index = jobs.length - 1;
//            int tmp = jobs[index];
//            int n = 0;
//            for (int i = 0; i < index; i++) {
//                if (tmp == minTime) {
//                    index--;
//                    tmp = jobs[index];
//                    n++;
//                    i--;
//                    continue;
//                }
//                tmp += jobs[i];
//            }
//            if (n + 1 <= k) {
//                return minTime;
//            } else {
//                minTime++;
//            }
//        }
//    }
//
//}
