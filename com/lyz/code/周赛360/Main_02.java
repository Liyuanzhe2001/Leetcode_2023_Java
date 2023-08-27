package com.lyz.code.周赛360;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lkunk
 * @date 2023年08月27日 9:54
 * @description
 */

public class Main_02 {
    public long minimumPossibleSum(int n, int target) {
        long num = 1;
        long res = 0;
        Set<Long> set = new HashSet<>();
        while (n != 0) {
            if (!set.contains(target - num)) {
                set.add(num);
                res += num;
                n--;
            }
            num++;
        }
        return res;
    }
}
