package com.lyz.code;

import java.util.*;

public class main_659 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 4, 5};
        System.out.println(new main_659().isPossible(nums));
    }

    // PriorityQueue<Integer> 优先队列
    // 小顶堆
    public boolean isPossible(int[] nums) {
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, new PriorityQueue<>());
            }
            if (!map.containsKey(num - 1)) {
                PriorityQueue<Integer> queue = new PriorityQueue<>();
                queue.add(1);
                map.get(num).add(1);
            } else {
                map.get(num).add(map.get(num - 1).poll() + 1);
                if (map.get(num - 1).isEmpty()) {
                    map.remove(num - 1);
                }
            }
        }
        for (PriorityQueue<Integer> value : map.values()) {
            for (Integer integer : value) {
                if (integer < 3) {
                    return false;
                }
            }
        }
        return true;
    }

}
