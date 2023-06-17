package com.lyz.code;

public class main_2481 {

    public static void main(String[] args) {

    }

    public int numberOfCuts(int n) {
        if (n == 1) {
            return 0;
        }
        if (n % 2 == 0) {
            return n >> 1;
        }
        return n;
    }
}
