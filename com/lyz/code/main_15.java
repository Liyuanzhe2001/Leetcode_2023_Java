//package com.lyz.code;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class main_15 {
//
//    public static void main(String[] args) {
//
//    }
//
//    List<List<Integer>> res = new ArrayList<>();
//
//    public List<List<Integer>> threeSum(int[] nums) {
//        dfs(nums, new ArrayList<>(), 0, 0);
//        return res;
//    }
//
//    public void dfs(int[] nums, List<Integer> list, int index, int sum) {
//        if (list.size() == 3 && sum == 0) {
//            Collections.sort(list);
//            if (!res.contains(list)) {
//                res.add(new ArrayList<>(list));
//            }
//            return;
//        }
//        if (index == nums.length || list.size() > 3) {
//            return;
//        }
//        for (int i = index; i < nums.length; i++) {
//            list.add(nums[i]);
//
//            dfs(nums, new ArrayList<>(list), i + 1, sum + nums[i]);
//            list.remove(list.size() - 1);
//        }
//    }
//
//}
