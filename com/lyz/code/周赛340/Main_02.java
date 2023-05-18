package com.lyz.code.周赛340;

import java.util.*;

public class Main_02 {

    public static void main(String[] args) {
        int[] nums = {0, 5, 3, 1, 2, 8, 6, 6, 6};
        System.out.println(Arrays.toString(new Main_02().distance(nums)));
    }

    public long[] distance(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> tmpList = map.getOrDefault(nums[i], new ArrayList<>());
            tmpList.add(i);
            map.put(nums[i], tmpList);
        }
        Map<Integer, Deque<Long>> resMap = new HashMap<>();
        for (Integer key : map.keySet()) {
            List<Integer> list = map.get(key);
            Deque<Long> deque = new ArrayDeque<>();
            long[] pre = new long[list.size()];
            pre[0] = list.get(0);
            for (int i = 1; i < pre.length; i++) {
                pre[i] = pre[i - 1] + list.get(i);
            }
            long[] last = new long[list.size()];
            last[list.size() - 1] = list.get(list.size() - 1);
            for (int i = last.length - 2; i >= 0; i--) {
                last[i] = last[i + 1] + list.get(i);
            }
            for (int i = 0; i < list.size(); ++i) {
                if (i == 0) {
                    deque.add(last[i] - (long) list.get(i) * list.size());
                } else if (i == list.size() - 1) {
                    deque.add((long) list.get(i) * (list.size() - 1) - pre[i - 1]);
                } else {
                    deque.add((long) i * list.get(i) - pre[i - 1] + last[i + 1] - (long) (list.size() - i - 1) * list.get(i));
                }
            }
            if (deque.size() == 1) {
                resMap.put(key, new ArrayDeque<>() {{
                    add(0L);
                }});
            } else {
                resMap.put(key, deque);
            }
        }
        long[] res = new long[nums.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = resMap.get(nums[i]).pop();
        }
        return res;
    }

}
