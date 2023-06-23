package com.lyz.code;

public class main_2496 {
    public int maximumValue(String[] strs) {
        int res = 0;
        int tmp;
        for (String str : strs) {
            try {
                tmp = Integer.parseInt(str);
                res = Math.max(res, tmp);
            } catch (Exception e) {
                res = Math.max(res, str.length());
            }
        }
        return res;
    }
}
