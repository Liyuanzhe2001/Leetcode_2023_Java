package com.lyz.code;

import java.util.*;

/**
 * @author lkunk
 * @date 2023年07月09日 17:08
 * @description
 */

public class lc_合并区间 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (Comparator.comparingInt(o -> o[0])));
        List<int[]> list = new ArrayList<>();
        list.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            int[] ints = list.get(list.size() - 1);
            if (ints[1] >= intervals[i][0]) {
                ints[1] = Math.max(intervals[i][1], ints[1]);
                list.remove(list.size() - 1);
                list.add(ints);
            } else {
                list.add(intervals[i]);
            }
        }
        int[][] res = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
