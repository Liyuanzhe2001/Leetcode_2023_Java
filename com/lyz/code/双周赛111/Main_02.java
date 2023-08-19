package com.lyz.code.双周赛111;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lkunk
 * @date 2023年08月19日 22:28
 * @description
 */

public class Main_02 {
    public boolean canMakeSubsequence(String str1, String str2) {
        if (str1.length() < str2.length()) {
            return false;
        }
        char[] chars = str2.toCharArray();
        int i = 0;
        for (char c : str1.toCharArray()) {
            if (c == chars[i] || (c - 'a' + 27) % 26 == chars[i] - 'a') {
                i++;
            }
            if (i == chars.length) {
                return true;
            }
        }
        return false;
    }
}

/*
"abc"
"ad"
"zc"
"ad"
"ab"
"d"
"c"
"b"
"eao"
"ofa"
 */
