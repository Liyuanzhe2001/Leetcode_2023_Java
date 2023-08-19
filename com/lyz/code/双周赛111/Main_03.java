package com.lyz.code.双周赛111;

import java.util.List;

/**
 * @author lkunk
 * @date 2023年08月19日 22:28
 * @description
 */

public class Main_03 {

    int res;

    public int minimumOperations(List<Integer> nums) {
        res = nums.size();
        dfs(nums, 0, 0, 1);
        return res;
    }

    public void dfs(List<Integer> nums, int index, int sum, int pre) {
        if (sum >= res) {
            return;
        }
        if (index >= nums.size()) {
            res = sum;
            return;
        }
        int val = nums.get(index);
        index++;
        if (pre == 1) {
            dfs(nums, index, sum + val == 1 ? 0 : 1, 1);
            dfs(nums, index, sum + val == 2 ? 0 : 1, 2);
            dfs(nums, index, sum + val == 3 ? 0 : 1, 3);
        } else if (pre == 2) {
            dfs(nums, index, sum + val == 2 ? 0 : 1, 2);
            dfs(nums, index, sum + val == 3 ? 0 : 1, 3);
        } else {
            dfs(nums, index, sum + val == 3 ? 0 : 1, 3);
        }
    }

}
