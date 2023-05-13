package com.lyz.code;

import java.util.HashMap;
import java.util.HashSet;

public class main_2441 {

    public static void main(String[] args) {

    }

    public int findMaxK(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max = -1;
        for (int num : nums) {
            if (set.contains(-num)) {
                max = Math.max(Math.abs(num), max);
            } else {
                set.add(num);
            }
        }
        return max;
    }

}
