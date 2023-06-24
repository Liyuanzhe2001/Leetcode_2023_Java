package com.lyz.code;

public class main_441 {
    public int arrangeCoins(int n) {
        int res = 0;
        int i = 1;
        while ((n = n - i++) >= 0) {
            res++;
        }
        return res;
    }
}
