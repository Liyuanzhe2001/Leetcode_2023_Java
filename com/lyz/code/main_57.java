package com.lyz.code;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lkunk
 * @date 2023年08月28日 21:27
 * @description
 */

public class main_57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int left = newInterval[0];
        int rig = newInterval[1];
        boolean placed = false;
        List<int[]> list = new ArrayList<>();

        for (int[] interval : intervals) {
            if (interval[0] > rig) {
                if (!placed) {
                    list.add(new int[]{left, rig});
                    placed = true;
                }
                list.add(interval);
            } else if (interval[1] < left) {
                list.add(interval);
            } else {
                left = Math.min(left, interval[0]);
                rig = Math.max(rig, interval[1]);
            }
        }

        if (!placed) {
            list.add(new int[]{left, rig});
        }

        int[][] res = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
