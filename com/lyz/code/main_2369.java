package com.lyz.code;

public class main_2369 {

    public static void main(String[] args) {

    }

    public boolean isStrictlyPalindromic(int n) {
        for (int i = 2; i <= n - 2; i++) {
            if (!judge(n, i)) {
                return false;
            }
        }
        return true;
    }

    public boolean judge(int n, int b) {
        String s = Integer.toString(n, b);
        int lef = 0;
        int rig = s.length() - 1;
        while (lef < rig) {
            if (s.charAt(lef) != s.charAt(rig)) {
                return false;
            }
            lef++;
            rig--;
        }
        return true;
    }

}
