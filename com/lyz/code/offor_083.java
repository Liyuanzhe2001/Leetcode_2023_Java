package com.lyz.code;

import java.util.ArrayList;
import java.util.List;

public class offor_083 {

    public static void main(String[] args) {

    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> rel = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        List<Integer> list = new ArrayList<>();
        cal(rel, nums, list, visited);
        return rel;
    }

    public void cal(List<List<Integer>> rel, int[] nums, List<Integer> list, boolean[] visited) {
        if (list.size() == nums.length) {
            rel.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) {
                continue;
            }
            list.add(nums[i]);
            visited[i] = true;
            cal(rel, nums, list, visited);
            list.remove(list.size() - 1);
            visited[i] = false;
        }
    }

}
