package com.lyz.code;

import java.util.ArrayList;
import java.util.List;

public class main_228 {

    public static void main(String[] args) {
        System.out.println(new main_228().summaryRanges(new int[]{0, 1, 2, 4, 5, 7}));
    }

    public List<String> summaryRanges(int[] nums) {
        if(nums.length == 0) {
            return new ArrayList<>();
        }
        List<String> res = new ArrayList<>();
        int start = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (i == nums.length - 1 || num + 1 != nums[i + 1]) {
                if (start == num) {
                    res.add(String.valueOf(num));
                } else {
                    res.add(start + "->" + num);
                }
                if (i != nums.length - 1) {
                    start = nums[i + 1];
                }
            }
        }
        return res;
    }

}
