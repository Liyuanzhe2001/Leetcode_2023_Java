package com.lyz.code;

public class main_2404 {

    public static void main(String[] args) {

    }

    public int mostFrequentEven(int[] nums) {
        int[] n = new int[100001];
        int v = -1;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num % 2 != 0) {
                continue;
            }
            n[num]++;
            if (n[num] > max) {
                v = num;
                max = n[num];
            } else if (n[num] == max && v > num) {
                v = num;
            }
        }
        return v;
    }

}
