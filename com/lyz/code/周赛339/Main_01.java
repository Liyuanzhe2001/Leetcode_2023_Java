package com.lyz.code.周赛339;

public class Main_01 {

    public static void main(String[] args) {
        System.out.println(new Main_01().findTheLongestBalancedSubstring("111"));
    }

    public int findTheLongestBalancedSubstring(String s) {
        int n = 0;
        int m = 0;
        int max = 0;
        boolean flag = true;
        for (char c : s.toCharArray()) {
            if (c == '0') {
                if (flag) {
                    n++;
                } else {
                    max = Math.max(max, 2 * Math.min(n, m));
                    flag = true;
                    m = 0;
                    n = 1;
                }
            } else {
                m++;
                flag = false;
            }
        }
        max = Math.max(max, 2 * Math.min(n, m));
        return max;
    }

}
