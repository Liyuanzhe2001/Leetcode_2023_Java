package com.lyz.code;

import java.util.*;

public class offor_082 {

    public static void main(String[] args) {
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        List<List<Integer>> lists = new offor_082().combinationSum2(candidates, target);
        System.out.println(lists);
    }


    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(new ArrayList<>(), 0, candidates, target);
        return res;
    }

    public void dfs(List<Integer> list, int now, int[] candidates, int target) {
        if (target == 0) {
            if (!res.contains(list)) {
                res.add(new ArrayList<>(list));
            }
            return;
        }
        if (target < 0 || now >= candidates.length) {
            return;
        }
        for (int i = now; i < candidates.length && candidates[i] <= target; i++) {
            list.add(candidates[i]);
            dfs(list, now, candidates, target - candidates[now]);
            list.remove(list.size() - 1);
        }
    }

}
