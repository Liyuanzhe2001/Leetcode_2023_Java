package com.lyz.code.双周赛109;

import java.util.Arrays;

/**
 * @author lkunk
 * @date 2023年07月22日 22:26
 * @description
 */

public class Main_01 {
    public boolean isGood(int[] nums) {
        int n = Arrays.stream(nums).max().getAsInt();
        int[] nn = new int[n + 1];
        for (int num : nums) {
            nn[num]++;
        }
        for (int i = 1; i < nn.length - 1; i++) {
            if (nn[i] != 1) {
                return false;
            }
        }
        if (nn[n] != 2) {
            return false;
        }
        return true;
    }
}
