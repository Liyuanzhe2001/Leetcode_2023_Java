package com.lyz.code.周赛362;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author lkunk
 * @date 2023年09月10日 10:17
 * @description
 */

public class Main_01 {
    public int numberOfPoints(List<List<Integer>> nums) {
        Set<Integer> set = new HashSet<>();
        for (List<Integer> num : nums) {
            for (int i = num.get(0); i <= num.get(1); i++) {
                set.add(i);
            }
        }
        return set.size();
    }
}
