package com.lyz.code;

/**
 * @author lkunk
 * @date 2023年09月01日 9:17
 * @description
 */

public class main_2240 {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        long n = total / cost1;
        long res = 1 + n;
        for (long i = 0; i <= n; i++) {
            res += (total - i * cost1) / cost2;
        }
        return res;
    }
}
