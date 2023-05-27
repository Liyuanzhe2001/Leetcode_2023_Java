package com.lyz.code.双周赛105;

import java.util.*;

public class Main_02 {

    public static void main(String[] args) {
        String s = "leetscode";
        String[] dictionary = {"leet", "code", "leetcode"};
        System.out.println(new Main_02().minExtraChar(s, dictionary));
    }

    public int minExtraChar(String s, String[] dictionary) {
        Set<String> set = Set.of(dictionary);
        int[] dp = new int[s.length() + 1];
        for (int i = 0; i < s.length(); i++) {
            dp[i + 1] = Integer.MAX_VALUE;
            for (int j = 0; j <= i; j++) {
                dp[i + 1] = Math.min(dp[i + 1], dp[j] + (set.contains(s.substring(j, i + 1)) ? 0 : i - j + 1));
            }
        }
        return dp[s.length()];
    }

}
