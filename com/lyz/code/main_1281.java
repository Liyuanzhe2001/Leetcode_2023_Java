package com.lyz.code;

/**
 * @author lkunk
 * @date 2023年08月09日 22:56
 * @description
 */

public class main_1281 {
    public int subtractProductAndSum(int n) {
        int a = 1, b = 0;
        while (n != 0) {
            int tmp = n % 10;
            n /= 10;
            a *= tmp;
            b += tmp;
        }
        return a - b;
    }
}
