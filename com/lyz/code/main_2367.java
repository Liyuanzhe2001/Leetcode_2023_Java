package com.lyz.code;

import java.util.HashSet;

public class main_2367 {

    public static void main(String[] args) {
        int[] nums = {0, 1, 4, 6, 7, 10};
        int i = new main_2367().arithmeticTriplets(nums, 3);
        System.out.println(i);
    }

//    public int arithmeticTriplets(int[] nums, int diff) {
//        int cnt = 0;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                for (int k = 0; k < nums.length; k++) {
//                    if (nums[j] - nums[i] == diff && nums[k] - nums[j] == diff) {
//                        cnt++;
//                        break;
//                    }
//                }
//            }
//        }
//        return cnt;
//    }

    public int arithmeticTriplets(int[] nums, int diff) {
        HashSet<Integer> set = new HashSet<>() {{
            for (int num : nums) {
                add(num);
            }
        }};
        int cnt = 0;
        for (Integer i : set) {
            if (set.contains(i - diff) && set.contains(i + diff)) {
                cnt++;
            }
        }
        return cnt;
    }

}
