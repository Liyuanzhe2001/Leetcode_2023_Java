package com.lyz.code;

public class main_2437 {

    public static void main(String[] args) {

    }

    public int countTime(String time) {
        int res = 1;
        if (time.charAt(0) == '?' && time.charAt(1) == '?') {
            res = 24;
        } else if (time.charAt(0) == '?') {
            if (time.charAt(1) <= '3') {
                res = 3;
            } else {
                res = 2;
            }
        } else if (time.charAt(1) == '?') {
            if (time.charAt(0) == '2') {
                res = 4;
            } else {
                res = 10;
            }
        }

        if (time.charAt(3) == '?' && time.charAt(4) == '?') {
            res *= 60;
        } else if (time.charAt(3) == '?') {
            res *= 6;
        } else if (time.charAt(4) == '?') {
            res *= 10;
        }
        return res;
    }
}
