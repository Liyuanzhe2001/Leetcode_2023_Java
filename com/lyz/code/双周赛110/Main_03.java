package com.lyz.code.双周赛110;

import java.util.*;

/**
 * @author lkunk
 * @date 2023年08月05日 22:27
 * @description
 */

public class Main_03 {

    public int minimumSeconds(List<Integer> nums) {
        Map<Integer, Queue<Integer>> index = new HashMap<>();
        int n = nums.size();
        for (int i = 0; i < nums.size(); i++) {
            Integer num = nums.get(i);
            Queue<Integer> tmpQ = index.getOrDefault(num, new LinkedList<>());
            tmpQ.add(i);
            index.put(num, tmpQ);
        }

        int res = Integer.MAX_VALUE;
        for (Integer maxNum : index.keySet()) {
            int s = -1;
            Queue<Integer> queue = index.get(maxNum);
            boolean[] visited = new boolean[n];
            for (Integer i : queue) {
                visited[i] = true;
            }
            while (!queue.isEmpty()) {
                s++;
                if(s > res) {
                    break;
                }
                int len = queue.size();
                for (int i = 0; i < len; i++) {
                    Integer poll = queue.poll();
                    int pre = (poll - 1 + n) % n;
                    int nex = (poll + 1) % n;
                    if (!visited[pre]) {
                        visited[pre] = true;
                        queue.add(pre);
                    }
                    if (!visited[nex]) {
                        visited[nex] = true;
                        queue.add(nex);
                    }
                }
            }
            res = Math.min(res, s);
        }
        return res;
    }
}

/*
[1,2,1,2]
[2,1,3,3,2]
[5,5,5,5]
[3,19,8,12]
[8,8,9,10,9]
[3,15,17,16,3]
[1,11,11,11,19,12,8,7,19]
 */
