package com.lyz.code;

import java.util.ArrayList;
import java.util.List;

public class main_78 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> subsets = new main_78().subsets(nums);
        System.out.println(subsets);
    }

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        dfs(nums, 0, new ArrayList<>());
        return res;
    }

    public void dfs(int[] nums, int now, List<Integer> list) {
        res.add(new ArrayList<>(list));
        if (now == nums.length) {
            return;
        }
        for (int i = now; i < nums.length; i++) {
            list.add(nums[i]);
            dfs(nums, i + 1, list);
            list.remove(list.size() - 1);
        }
    }


}
