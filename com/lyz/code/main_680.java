package com.lyz.code;

public class main_680 {

    public static void main(String[] args) {
        String s = "abc";
        System.out.println(new main_680().validPalindrome(s));
    }

    public boolean validPalindrome(String s) {
        return cal(0, s.length() - 1, s, true);
    }

    public boolean cal(int left, int right, String s, boolean flag) {
        if (left > right) {
            return true;
        }
        char lc = s.charAt(left);
        char rc = s.charAt(right);
        if (lc == rc) {
            return cal(left + 1, right - 1, s, flag);
        } else {
            if (flag) {
                return cal(left + 1, right, s, false) || cal(left, right - 1, s, false);
            } else {
                return false;
            }
        }
    }

}
