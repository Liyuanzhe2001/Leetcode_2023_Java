package com.lyz.code.周赛356;

/**
 * @author lkunk
 * @date 2023年07月30日 10:23
 * @description
 */

public class Main_01 {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int res = 0;
        for (int hour : hours) {
            if (hour >= target) {
                res++;
            }
        }
        return res;
    }
}
