package com.lyz.code;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class main_2465 {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        Set<Double> set = new HashSet<>();
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            set.add((1.0 * nums[left++] + nums[right--]) / 2);
        }
        return set.size();
    }
}
