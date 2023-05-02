package com.lyz.code;

public class main_2427 {

    public static void main(String[] args) {

    }

    public int commonFactors(int a, int b) {
        int min = Math.min(a, b);
        int cnt = 1;
        for (int i = 2; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                cnt++;
            }
        }
        return cnt;
    }

}
