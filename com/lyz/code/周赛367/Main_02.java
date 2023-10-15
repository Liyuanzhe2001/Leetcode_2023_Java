package com.lyz.code.周赛367;

/**
 * @author lkunk
 * @date 2023年10月15日 10:23
 * @description
 */

public class Main_02 {
    public String shortestBeautifulSubstring(String s, int k) {
        int rig = s.indexOf('1');
        if (rig < 0) {
            return "";
        }
        if (k == 1) {
            return "1";
        }
        String res = "";
        int n = 0;
        String tmp = "";
        char[] chars = s.toCharArray();
        for (; rig < chars.length; rig++) {
            if (chars[rig] == '1') {
                n++;
            }
            tmp += chars[rig];
            if (n == k) {
                if ("".equals(res) || res.length() > tmp.length() || (res.length() == tmp.length() && res.compareTo(tmp) > 0)) {
                    res = tmp;
                }
                n--;
                tmp = tmp.substring(tmp.indexOf('1', 1));
            }
        }
        return res;
    }
}
/*
"1100100101011001001"
7

"100100101011001"
"1100100101011"

"001110101101101111"
10

"10101101101111"

 */
