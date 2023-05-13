package com.lyz.code;

import java.util.ArrayList;
import java.util.List;

public class main_2395 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(new main_2395().findSubarrays(nums));
    }

    public boolean findSubarrays(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (list.contains(nums[i] + nums[i + 1])) {
                return true;
            } else {
                list.add(nums[i] + nums[i + 1]);
            }
        }
        return false;
    }

}
