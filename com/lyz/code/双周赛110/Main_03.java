package com.lyz.code.双周赛110;

import java.util.*;

/**
 * @author lkunk
 * @date 2023年08月05日 22:27
 * @description
 */

public class Main_03 {

    public int minimumSeconds(List<Integer> nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int n = nums.size();
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums.get(i), t -> new ArrayList<>()).add(i);
        }

        int res = Integer.MAX_VALUE;
        for (List<Integer> value : map.values()) {
            int max = value.get(0) - value.get(value.size() - 1) + n;
            for (int i = 1; i < value.size(); i++) {
                max = Math.max(value.get(i) - value.get(i - 1), max);
            }
            res = Math.min(res, max / 2);
        }
        return res;
    }
}

/*
[1,2,1,2]
[2,1,3,3,2]
[5,5,5,5]
[3,19,8,12]
[8,8,9,10,9]
[3,15,17,16,3]
[1,11,11,11,19,12,8,7,19]
 */
