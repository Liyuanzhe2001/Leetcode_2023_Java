package com.lyz.code.双周赛98;

public class 面试_0502 {
    public static void main(String[] args) {
        System.out.println(new 面试_0502().printBin(0.1));
    }

    public String printBin(double num) {
        int i = 1;
        String res = "0.";
        while (i <= 32 && num != 0) {
            double current = 1.0 / Math.pow(2, i);
            if (num >= current) {
                num -= current;
                res += "1";
            } else {
                res += "0";
            }
            i++;
        }

        return num == 0 ? res : "ERROR";
    }
}
