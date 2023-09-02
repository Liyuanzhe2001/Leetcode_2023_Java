package com.lyz.code;

/**
 * @author lkunk
 * @date 2023年09月02日 16:30
 * @description
 */

public class main_2511 {
    public int captureForts(int[] forts) {
        int pre = -1;
        int res = 0;
        for (int i = 0; i < forts.length; i++) {
            if (forts[i] != 0) {
                if (pre != -1 && forts[i] == -forts[pre]) {
                    res = Math.max(res, i - pre - 1);
                }
                pre = i;
            }
        }
        return res;
    }
}
