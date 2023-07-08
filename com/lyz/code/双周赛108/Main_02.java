package com.lyz.code.双周赛108;

import java.util.*;

/**
 * @author lkunk
 * @date 2023年07月08日 22:24
 * @description
 */

public class Main_02 {

    public List<Integer> relocateMarbles(int[] nums, int[] moveFrom, int[] moveTo) {
        Set<Integer> set = new TreeSet<>(Comparator.comparingInt(o -> o));
        for (int num : nums) {
            set.add(num);
        }
        for (int i = 0; i < moveFrom.length; i++) {
            int from = moveFrom[i];
            int to = moveTo[i];
            set.remove(from);
            set.add(to);
        }
        return new ArrayList<>(set);
    }

}
