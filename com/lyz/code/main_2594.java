package com.lyz.code;

import java.util.Arrays;

/**
 * @author lkunk
 * @date 2023年09月07日 9:06
 * @description
 */

public class main_2594 {
    public long repairCars(int[] ranks, int cars) {
        Arrays.sort(ranks);
        long lef = 1;
        long rig = (long) ranks[ranks.length - 1] * cars * cars;
        while (lef < rig) {
            long mid = (lef + rig - 1) << 1;
            long tmpSum = 0;
            for (int rank : ranks) {
                tmpSum += (int) Math.sqrt(mid / rank);
            }
            if (tmpSum < cars) {
                lef = mid;
            } else {
                rig = mid;
            }
        }
        return lef;
    }
}
