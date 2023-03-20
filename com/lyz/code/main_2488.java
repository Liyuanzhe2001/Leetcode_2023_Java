//package com.lyz.code;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class main_2488 {
//
//    public static void main(String[] args) {
//        int[] nums = {3, 2, 1, 4, 5};
//        int k = 4;
//        System.out.println(new main_2488().countSubarrays(nums, k));
//    }
//
//    public int countSubarrays(int[] nums, int k) {
//        int n = nums.length;
//        int kIndex = -1;
//        for (int i = 0; i < n; i++) {
//            if (nums[i] == k) {
//                kIndex = i;
//                break;
//            }
//        }
//        int ans = 0;
//        Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
//        counts.put(0, 1);
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            sum += sign(nums[i] - k);
//            if (i < kIndex) {
//                counts.put(sum, counts.getOrDefault(sum, 0) + 1);
//            } else {
//                int prev0 = counts.getOrDefault(sum, 0);
//                int prev1 = counts.getOrDefault(sum - 1, 0);
//                ans += prev0 + prev1;
//            }
//        }
//        return ans;
//    }
//
//    public int sign(int num) {
//        if (num == 0) {
//            return 0;
//        }
//        return num > 0 ? 1 : -1;
//    }
//}
