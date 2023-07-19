package com.lyz.code;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author lkunk
 * @date 2023年07月19日 21:32
 * @description
 */

public class main_874 {
    public int robotSim(int[] commands, int[][] obstacles) {
        Set<Integer> set = new HashSet<>();
        for (int[] obstacle : obstacles) {
            set.add(obstacle[0] * 12345 + obstacle[1]);
        }
        int res = 0;
        int[] now = {0, 0};
        int index = 0;
        int[][] toward = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        for (int command : commands) {
            if (command == -1) {
                index = (index + 1) % 4;
            } else if (command == -2) {
                index = (index + 3) % 4;
            } else {
                for (int i = 0; i < command; i++) {
                    now[0] += toward[index][0];
                    now[1] += toward[index][1];
                    if (set.contains(now[0] * 12345 + now[1])) {
                        now[0] -= toward[index][0];
                        now[1] -= toward[index][1];
                        break;
                    }
                }
                res = Math.max(res, now[0] * now[0] + now[1] * now[1]);
            }
        }
        return res;
    }
}
