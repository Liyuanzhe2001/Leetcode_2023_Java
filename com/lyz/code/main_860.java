package com.lyz.code;

/**
 * @author lkunk
 * @date 2023年07月22日 18:13
 * @description
 */

public class main_860 {
    public boolean lemonadeChange(int[] bills) {
        int[] map = new int[11];
        for (int bill : bills) {
            if (bill == 5) {
                map[5]++;
            } else if (bill == 10) {
                if (map[5] == 0) {
                    return false;
                }
                map[10]++;
                map[5]--;
            } else {
                boolean flag = true;
                if (map[10] != 0) {
                    if (map[5] == 0) {
                        flag = false;
                    } else {
                        map[10]--;
                        map[5]--;
                    }
                } else {
                    if (map[5] < 3) {
                        flag = false;
                    } else {
                        map[5] -= 3;
                    }
                }
                if (!flag) {
                    return false;
                }
            }
        }
        return true;
    }
}
