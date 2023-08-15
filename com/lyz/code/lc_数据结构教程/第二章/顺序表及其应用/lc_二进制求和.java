package com.lyz.code.lc_数据结构教程.第二章.顺序表及其应用;

/**
 * @author lkunk
 * @date 2023年08月15日 23:38
 * @description
 */

public class lc_二进制求和 {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int add = 0;
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int sum = add;
            sum += i >= 0 ? a.charAt(i) - '0' : 0;
            sum += j >= 0 ? b.charAt(j) - '0' : 0;
            add = sum / 2;
            res.append(sum % 2);
        }
        if (add == 1) {
            res.append(1);
        }
        return res.reverse().toString();
    }
}
