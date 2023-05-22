package com.lyz.code;

import java.util.ArrayList;
import java.util.List;

public class main_39 {

    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        System.out.println(new main_39().combinationSum(candidates, target));
    }

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        dfs(new ArrayList<>(), candidates, 0, target);
        return res;
    }

    public void dfs(List<Integer> list, int[] candidates, int index, int target) {
        if (target == 0) {
            res.add(new ArrayList<>(list));
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            list.add(candidates[i]);
            dfs(list, candidates, i, target - candidates[i]);
            list.remove(list.size() - 1);
        }
    }

}
