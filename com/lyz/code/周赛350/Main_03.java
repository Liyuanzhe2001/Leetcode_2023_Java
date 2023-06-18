package com.lyz.code.周赛350;

import java.util.*;

public class Main_03 {

    public static void main(String[] args) {
        int[] nums = {2, 3, 6};
        System.out.println(new Main_03().specialPerm(nums));
    }

    Map<List<Integer>, Integer> map = new HashMap<>();

    public int specialPerm(int[] nums) {
        long res = 0;
        for (int i = 0; i < nums.length; i++) {
            List<Integer> visited = new ArrayList<>();
            visited.add(nums[i]);
            res += dfs(visited, nums, i);
            res %= 1000000007;
        }
        return (int) res;
    }

    public int dfs(List<Integer> visited, int[] nums, int index) {
        if (visited.size() == nums.length) {
            return 1;
        }
        int res = 0;
        Collections.sort(visited);
        if (!map.containsKey(visited)) {
            for (int i = 0; i < nums.length; i++) {
                if (!visited.contains(nums[i]) && (nums[i] % nums[index] == 0 || nums[index] % nums[i] == 0)) {
                    visited.add(nums[i]);
                    res += dfs(new ArrayList<>(visited), nums, i);
                    visited.remove(visited.size() - 1);
                }
            }
            map.put(visited, res);
        } else {
            res += map.get(visited);
        }
        return res;
    }
}

/*
[2,3,6]
[1,4,3]
[20,100,50,5,10,70,7]
 */


/*
2
2
48
 */

