package com.lyz.code;

import java.util.Arrays;

public class main_179 {

    public static void main(String[] args) {
        System.out.println(new main_179().largestNumber(new int[]{3, 30, 34, 5, 9}));
    }

    public String largestNumber(int[] nums) {
        String[] strs = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strs, (a, b) -> (b + a).compareTo(a + b));
        String res = String.join("", strs);
        return res.charAt(0) == '0' ? "0" : res;
    }

}
