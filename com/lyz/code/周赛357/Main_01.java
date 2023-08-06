package com.lyz.code.周赛357;

/**
 * @author lkunk
 * @date 2023年08月06日 10:30
 * @description
 */

public class Main_01 {
    public String finalString(String s) {
        StringBuffer res = new StringBuffer();
        for (char c : s.toCharArray()) {
            if (c != 'i') {
                res.append(c);
            } else {
                res.reverse();
            }
        }
        return res.toString();
    }
}
