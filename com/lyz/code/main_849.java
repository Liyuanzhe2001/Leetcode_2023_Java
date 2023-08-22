package com.lyz.code;

/**
 * @author lkunk
 * @date 2023年08月22日 23:16
 * @description
 */

public class main_849 {
    public int maxDistToClosest(int[] seats) {
        int lef = -1;
        int len = seats.length;
        int res = 0;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 1) {
                res = lef == -1 ? i : Math.max(res, (i - lef) >> 1);
                lef = i;
            }
        }
        res = Math.max(res, len - lef - 1);
        return res;
    }
}
