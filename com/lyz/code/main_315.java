//package com.lyz.code;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class main_315 {
//
//    public static void main(String[] args) {
//        int[] nums = {2, 0, 1};
//        new main_315().countSmaller(nums);
//    }
//
//    public List<Integer> countSmaller(int[] nums) {
//        int[] dp = new int[nums.length];
//        List<Integer> list = new ArrayList<>();
//        list.add(0);
//
//        for (int i = nums.length - 2; i >= 0; i--) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] > nums[j]) {
//                    dp[i]++;
//                } else {
//                    dp[i] += dp[j];
//                    break;
//                }
//            }
//            list.add(0, dp[i]);
//        }
//        return list;
//    }
//
//}
