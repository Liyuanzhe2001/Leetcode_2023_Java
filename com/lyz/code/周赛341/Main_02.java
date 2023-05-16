package com.lyz.code.周赛341;

public class Main_02 {

    public static void main(String[] args) {

    }

    public int maxDivScore(int[] nums, int[] divisors) {
        int max = -1;
        int maxValue = -1;
        for (int divisor : divisors) {
            int cnt = 0;
            for (int num : nums) {
                if (num % divisor == 0) {
                    cnt++;
                }
            }
            if (cnt == max) {
                maxValue = Math.min(maxValue, divisor);
            } else if (cnt > max) {
                max = cnt;
                maxValue = divisor;
            }
        }
        return maxValue;
    }

}
