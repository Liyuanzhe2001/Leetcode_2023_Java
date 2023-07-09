package com.lyz.code.双周赛108;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author lkunk
 * @date 2023年07月08日 22:24
 * @description
 */

public class Main_03 {

    public static void main(String[] args) {
        String s = "101101101111001";
        System.out.println(new Main_03().minimumBeautifulSubstrings(s));
    }

    List<Integer> list = new ArrayList<>() {{
        add(1);
        add(5);
        add(25);
        add(125);
        add(625);
        add(3125);
        add(15625);
        add(78125);
    }};

    Set<String> set = new HashSet<>() {{
        add("1");
        add("101");
        add("11001");
        add("1111101");
        add("1001110001");
        add("110000110101");
        add("11110100001001");
        add("10011000100101101");
    }};

    int res = Integer.MAX_VALUE;

    public int minimumBeautifulSubstrings(String s) {
        dfs(s, 0);
        if (res == Integer.MAX_VALUE) {
            return -1;
        }
        return res;
    }


    public void dfs(String s, int sum) {
        if (s.equals("")) {
            res = Math.min(sum, res);
            return;
        }
        String tmpS = s.charAt(0) + "";
        int i = 1;
        for (i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '0') {
                tmpS += '0';
            } else {
                if (set.contains(tmpS)) {
                    dfs(s.substring(i), sum + 1);
                }
                tmpS += '1';
            }
        }
        if (set.contains(tmpS)) {
            res = Math.min(res, sum + 1);
        }
    }

}
