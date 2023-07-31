package com.lyz.code.lc_队列_栈;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author lkunk
 * @date 2023年07月31日 23:27
 * @description
 */

public class lc_完全平方数 {
    public int numSquares(int n) {
        int res = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);
        while (!queue.isEmpty()) {
            int size = queue.size();
            res++;
            for (int i = 0; i < size; i++) {
                Integer poll = queue.poll();
                for (int j = 1; j <= Math.sqrt(poll); j++) {
                    if (poll - j * j == 0) {
                        return res;
                    }
                    queue.add(poll - j * j);
                }
            }
        }
        return -1;
    }
}
