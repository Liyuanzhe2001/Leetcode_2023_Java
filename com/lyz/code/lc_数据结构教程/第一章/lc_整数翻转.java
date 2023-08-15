package com.lyz.code.lc_数据结构教程.第一章;

/**
 * @author lkunk
 * @date 2023年08月14日 23:39
 * @description
 */

public class lc_整数翻转 {
    public int reverse(int x) {
        String res = "";
        boolean flag = x < 0;
        long tmp = Math.abs((long) x);
        if (tmp / 10 == 0) {
            return x;
        }
        while (tmp != 0) {
            res = res + tmp % 10;
            tmp /= 10;
        }
        int MAX_VAL = (1 << 31) - 1, MIN_VAL = -(1 << 31);
        long i = flag ? -Long.parseLong(res) : Long.parseLong(res);
        return i >= MAX_VAL || i < MIN_VAL ? 0 : (int) i;
    }
}
