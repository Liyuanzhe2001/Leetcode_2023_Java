package com.lyz.code;

/**
 * @author lkunk
 * @date 2023年07月10日 8:54
 * @description
 */

public class lc_翻转字符串里的单词 {
    public String reverseWords(String s) {
        String[] split = s.split(" ");
        String res = "";
        for (String ss : split) {
            if (!ss.isEmpty()) {
                res = ss + " " + res;
            }
        }
        return res.substring(0, res.length());
    }
}
