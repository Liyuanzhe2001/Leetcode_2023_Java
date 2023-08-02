package com.lyz.code;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lkunk
 * @date 2023年08月02日 23:03
 * @description
 */

public class main_822 {
    public int flipgame(int[] fronts, int[] backs) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < fronts.length; i++) {
            if (fronts[i] == backs[i]) {
                set.add(fronts[i]);
            }
        }
        int res = 2001;
        for (int front : fronts) {
            if (front < res && !set.contains(front)) {
                res = front;
            }
        }
        for (int back : backs) {
            if (back < res && !set.contains(back)) {
                res = back;
            }
        }
        return res % 2001;
    }
}
