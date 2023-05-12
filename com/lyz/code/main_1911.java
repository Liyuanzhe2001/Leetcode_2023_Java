package com.lyz.code;

public class main_1911 {

    public static void main(String[] args) {

    }

    public long maxAlternatingSum(int[] nums) {
        long bef = 0;
        long res = 0;
        for (int num : nums) {
            if (num > bef) {
                res += num - bef;
            }
            bef = num;
        }
        return res;
    }

}
