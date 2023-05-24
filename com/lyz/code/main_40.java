package com.lyz.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class main_40 {

    public static void main(String[] args) {

    }

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(candidates, new ArrayList<>(), 0, target);
        return res;
    }

    public void dfs(int[] candidates, List<Integer> list, int index, int target) {
        if (target == 0) {
            if (!res.contains(list)) {
                res.add(new ArrayList<>(list));
            }
            return;
        }

        if (target < 0 || index == candidates.length) {
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }
            list.add(candidates[i]);
            dfs(candidates, list, i + 1, target - candidates[i]);
            list.remove(list.size() - 1);
        }
    }

}
