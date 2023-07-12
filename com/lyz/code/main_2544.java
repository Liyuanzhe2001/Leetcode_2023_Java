package com.lyz.code;

/**
 * @author lkunk
 * @date 2023年07月12日 22:18
 * @description
 */

public class main_2544 {
    public int alternateDigitSum(int n) {
        int sum = 0;
        while (n >= 0) {
            sum = (n % 10) - sum;
            n = n / 10;
        }
        return sum;
    }
}
