//package com.lyz.code.周赛344;
//
//public class Main_04 {
//
//    public static void main(String[] args) {
//        int n = 15;
//        int[] cost = {764, 1460, 2664, 764, 2725, 4556, 5305, 8829, 5064, 5929, 7660, 6321, 4830, 7055, 3761};
//        System.out.println(new Main_04().minIncrements(n, cost));
//    }
//
//    public int minIncrements(int n, int[] cost) {
//        int c = 0;
//        int len = 1;
//        for (int i = 1; i < cost.length; i += len) {
//            int max = 0;
//            len *= 2;
//            int sum = 0;
//            for (int j = i; j < i + len; j++) {
//                max = Math.max(cost[j], max);
//                sum += cost[j];
//            }
//            c = c + (len * max - sum);
//            System.out.println(c);
//        }
//        return c;
//    }
//
//    public int cal(int now, int[] cost) {
//        int next1 = 0;
//        int next2 = 0;
//        if (2 * now < cost.length) {
//            next1 = cal(2 * now, cost);
//        }
//        if (2 * now + 1 < cost.length) {
//            next2 = cal(2 * now, cost);
//        }
//        int max = Math.max(next1, next2);
//        max = Math.max(cost[now], max);
//        return 3 * max - next1 - next2 - cost[now];
//    }
//
//}
