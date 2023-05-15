package com.lyz.code.双周赛101;

import java.util.Arrays;

public class Main_02 {

    public static void main(String[] args) {
        String s = "zox", chars = "zoxr";
        int[] vals = {2, -5, -4, -5};
        System.out.println(new Main_02().maximumCostSubstring(s, chars, vals));
    }

    public int maximumCostSubstring(String s, String chars, int[] vals) {
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (chars.contains(s.charAt(i) + "")) {
                arr[i] = vals[chars.indexOf(s.charAt(i))];
            } else {
                arr[i] = s.charAt(i) - 'a' + 1;
            }
        }
        int[] dp = new int[s.length()];
        dp[0] = Math.max(arr[0], 0);
        int res = dp[0];
        for (int i = 1; i < arr.length; i++) {
            dp[i] = Math.max(arr[i], dp[i - 1] + arr[i]);
            res = Math.max(res, dp[i]);
        }
        return res;
    }

}
