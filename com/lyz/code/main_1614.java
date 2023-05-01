package com.lyz.code;

public class main_1614 {
    public static void main(String[] args) {

    }

    public int maxDepth(String s) {
        int n = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                n++;
                max = Math.max(n, max);
            } else if (c == ')') {
                n--;
            }
        }
        return max;
    }

}
