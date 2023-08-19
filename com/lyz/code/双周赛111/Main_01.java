package com.lyz.code.双周赛111;

import java.util.List;

/**
 * @author lkunk
 * @date 2023年08月19日 22:28
 * @description
 */

public class Main_01 {
    public int countPairs(List<Integer> nums, int target) {
        int res = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) < target) {
                    res++;
                }
            }
        }
        return res;
    }
}
