package com.lyz.code.周赛342;

public class main_02 {
    public static void main(String[] args) {

    }

    public int sumOfMultiples(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                cnt += i;
            }
        }
        return cnt;
    }

}
