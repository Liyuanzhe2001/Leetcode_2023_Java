package com.lyz.code;

public class offer_018 {

    public static void main(String[] args) {

    }

    public boolean isPalindrome(String s) {
        int lef = 0;
        int rig = s.length() - 1;
        boolean flag;
        while (lef < rig) {
            flag = true;
            char l = s.charAt(lef);
            char r = s.charAt(rig);
            if (!((l <= '9' && l >= '0') || (l <= 'z' && l >= 'a') || (l <= 'Z' && l >= 'A'))) {
                lef++;
                flag = false;
            }
            if (!((r <= '9' && r >= '0') || (r <= 'z' && r >= 'a') || (r <= 'Z' && r >= 'A'))) {
                rig--;
                flag = false;
            }
            if (flag) {
                if (!(l + "").equalsIgnoreCase((r + ""))) {
                    return false;
                }
                lef++;
                rig--;
            }
        }
        return true;
    }

}
