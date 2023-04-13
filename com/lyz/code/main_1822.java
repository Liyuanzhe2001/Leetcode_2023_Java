package com.lyz.code;

public class main_1822 {

    public static void main(String[] args) {

    }

    public int arraySign(int[] nums) {
        boolean flag = true;
        for (int num : nums) {
            if (num == 0) {
                return 0;
            }
            if (num < 0) {
                flag = !flag;
            }
        }
        return flag ? 1 : -1;
    }

}
