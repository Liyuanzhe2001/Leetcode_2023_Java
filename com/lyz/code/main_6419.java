package com.lyz.code;

import java.util.Arrays;

public class main_6419 {

    public static void main(String[] args) {
        int n = 15;
        // 764
        // 1460, 2664
        // 764, 2725, 4556, 5305
        // 8829, 5064, 5929, 7660, 6321, 4830, 7055, 3761
        int[] cost = {764, 1460, 2664, 764, 2725, 4556, 5305, 8829, 5064, 5929, 7660, 6321, 4830, 7055, 3761};
        System.out.println(new main_6419().minIncrements(n, cost));
    }

    public int minIncrements(int n, int[] cost) {
        int res = 0;
        for (int i = cost.length - 1; i > 0; i -= 2) {
            res += Math.abs(cost[i] - cost[i - 1]);
            cost[(i - 1) / 2] += Math.max(cost[i], cost[i - 1]);
        }
        return res;
    }

}
