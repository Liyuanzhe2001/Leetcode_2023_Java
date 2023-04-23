//package com.lyz.code.周赛342;
//
//import java.util.Arrays;
//
//public class main_4 {
//
//    public static void main(String[] args) {
//        int[] nums = {6, 10, 15};
//        System.out.println(new main_4().minOperations(nums));
//    }
//
//    public int minOperations(int[] nums) {
//        int n = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 1) {
//                return nums.length;
//            }
//            for (int j = i + 1; j < nums.length; j++) {
//                int tmp = getGcd(nums[i], nums[j]);
//                n++;
//                nums[i] = tmp;
//            }
//        }
//         for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 1) {
//                return n + nums.length;
//            }
//            for (int j = i + 1; j < nums.length; j++) {
//                int tmp = getGcd(nums[i], nums[j]);
//                nums[i] = tmp;
//            }
//        }
//        return -1;
//    }
//
//    private static int getGcd(int num1, int num2) {
//        while (num1 % num2 != 0) {
//            int mod = num1 % num2;
//            num1 = num2;
//            num2 = mod;
//        }
//        return num2;
//    }
//
//}
