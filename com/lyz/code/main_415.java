package com.lyz.code;

/**
 * @author lkunk
 * @date 2023年07月17日 20:47
 * @description
 */

public class main_415 {
    public String addStrings(String num1, String num2) {
        String res = "";
        int add = 0;
        int rig1 = num1.length() - 1;
        int rig2 = num2.length() - 1;
        while (rig1 >= 0 || rig2 >= 0) {
            int n1 = 0;
            int n2 = 0;
            if (rig1 >= 0) {
                n1 = num1.charAt(rig1) - '0';
            }
            if (rig2 >= 0) {
                n2 = num2.charAt(rig2) - '0';
            }
            int tmp = n1 + n2 + add;
            add = tmp / 10;
            res = (tmp % 10) + res;
            rig1--;
            rig2--;
        }
        if (add != 0) {
            res = add + res;
        }
        return res;
    }
}
