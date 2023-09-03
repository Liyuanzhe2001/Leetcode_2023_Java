package com.lyz.code;

/**
 * @author lkunk
 * @date 2023年09月03日 14:12
 * @description
 */

public class main_8040 {
    public int minimumOperations(String num) {
        int res = num.length();
        for (char c : num.toCharArray()) {
            if (c == '0') {
                res--;
            }
        }
        res = Math.min(res, f(num, "00"));
        res = Math.min(res, f(num, "25"));
        res = Math.min(res, f(num, "50"));
        res = Math.min(res, f(num, "75"));
        return res;
    }

    public int f(String num, String tail) {
        int i = num.lastIndexOf(tail.charAt(1));
        if (i < 0) {
            return num.length();
        }
        i = num.substring(0, i).lastIndexOf(tail.charAt(0));
        if (i < 0) {
            return num.length();
        }
        return num.length() - i - 2;
    }

}
