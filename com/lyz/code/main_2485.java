package com.lyz.code;

public class main_2485 {
    public int pivotInteger(int n) {
        int sum = n;
        int i = 1;
        for (; i < n; i++) {
            sum += i;
        }
        int tmp = i;
        while (sum >= 0 && tmp != sum) {
            sum -= i;
            i--;
            tmp += i;
        }
        return sum >= 0 ? i : -1;
    }
}
