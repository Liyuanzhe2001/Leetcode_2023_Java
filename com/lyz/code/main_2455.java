package com.lyz.code;

public class main_2455 {

    public static void main(String[] args) {

    }

    public int averageValue(int[] nums) {
        int sum = 0;
        int len = 0;
        for (int num : nums) {
            if (num % 3 == 0 && num % 2 == 0) {
                sum += num;
                len++;
            }
        }
        return len == 0 ? 0 : sum / len;
    }

}
