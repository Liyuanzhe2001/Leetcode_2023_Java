package com.lyz.code.周赛344;

import java.util.HashSet;

public class Main_01 {

    public static void main(String[] args) {

    }

    public int[] distinctDifferenceArray(int[] nums) {
        int[] res = new int[nums.length];
        HashSet<Integer> tmp = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            tmp.add(nums[i]);
            HashSet<Integer> set = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {
                set.add(nums[j]);
            }
            res[i] = tmp.size() - set.size();
        }
        return res;
    }

}
