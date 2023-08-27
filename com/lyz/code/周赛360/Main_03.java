package com.lyz.code.周赛360;

import java.sql.ClientInfoStatus;
import java.util.*;

/**
 * @author lkunk
 * @date 2023年08月27日 9:54
 * @description
 */

public class Main_03 {
    public int minOperations(List<Integer> nums, int target) {
        int[] count = new int[32];
        int res = 0;
        for (int num : nums) {
            for (int i = 0; i <= 30; i++) {
                count[i] += num >> i & 1;
            }
        }
        for (int i = 0; i <= 30; i++) {
            if ((target >> i & 1) > 0) {
                count[i]--;
                for (int j = i; count[j] < 0; j++) {
                    if (j == 31) {
                        return -1;
                    }
                    count[j] += 2;
                    count[j + 1]--;
                    res++;
                }
            }
            count[i + 1] += count[i] / 2;
        }
        return res;
    }

}
