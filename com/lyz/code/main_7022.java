package com.lyz.code;

import java.util.*;

/**
 * @author lkunk
 * @date 2023年08月13日 13:08
 * @description
 */

public class main_7022 {
    public int minAbsoluteDifference(List<Integer> nums, int x) {
        TreeSet<Integer> set = new TreeSet<>();
        int res = Integer.MAX_VALUE;
        for (int i = x; i < nums.size(); i++) {
            int cur = nums.get(i);
            set.add(nums.get(i - x));
            Integer f = set.floor(cur);
            if (f != null) {
                res = Math.min(res, cur - f);
            }
            Integer c = set.ceiling(cur);
            if (c != null) {
                res = Math.min(res, c - cur);
            }
        }
        return res;
    }
}
