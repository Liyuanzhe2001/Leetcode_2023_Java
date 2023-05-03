package com.lyz.code;

public class offer_64 {

    public static void main(String[] args) {

    }

    public int sumNums(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumNums(n - 1);
    }

}
