package com.lyz.code;

import java.util.Arrays;

public class main_2341 {

    public static void main(String[] args) {
        int[] nums = {1, 1};
        int[] ints = new main_2341().numberOfPairs(nums);
        System.out.println(Arrays.toString(ints));
    }

    public int[] numberOfPairs(int[] nums) {
        int[] n = new int[101];
        int cnt = 0;
        for (int num : nums) {
            n[num]++;
            if (n[num] % 2 == 0) {
                cnt++;
            }
        }
        return new int[]{cnt, nums.length - 2 * cnt};
    }

}
