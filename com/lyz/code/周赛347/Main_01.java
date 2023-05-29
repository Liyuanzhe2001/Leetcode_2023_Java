package com.lyz.code.周赛347;

public class Main_01 {

    public static void main(String[] args) {

    }

    public String removeTrailingZeros(String num) {
        while (num.charAt(num.length() - 1) == '0') {
            num = num.substring(0, num.length());
        }
        return num;
    }

}
