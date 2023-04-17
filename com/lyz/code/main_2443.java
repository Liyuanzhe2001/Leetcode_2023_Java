package com.lyz.code;

import com.sun.security.auth.UnixNumericGroupPrincipal;

public class main_2443 {

    public static void main(String[] args) {
        System.out.println(new main_2443().sumOfNumberAndReverse(2));
    }

    public boolean sumOfNumberAndReverse(int num) {
        for (int i = 0; i <= num; i++) {
            if (cal(i) == num) {
                return true;
            }
        }
        return false;
    }

    public int cal(int num) {
        int num1 = num;
        int num2 = 0;
        int i = (int) Math.pow(10, (num + "").length() - 1);
        while (num != 0) {
            num2 += i * (num % 10);
            num /= 10;
            i /= 10;
        }
        return num1 + num2;
    }

}
