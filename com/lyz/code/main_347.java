package com.lyz.code;

import java.util.*;

public class main_347 {

    public static void main(String[] args) {

    }

    class AAA {
        int num;
        int cnt;

        public AAA(int num, int cnt) {
            this.num = num;
            this.cnt = cnt;
        }

        @Override
        public String toString() {
            return "AAA{" +
                    "num=" + num +
                    ", cnt=" + cnt +
                    '}';
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        Queue<AAA> queue = new PriorityQueue<>((o1, o2) -> o2.cnt - o1.cnt);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Integer key : map.keySet()) {
            queue.add(new AAA(key, map.get(key)));
        }
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = queue.poll().num;
        }
        return res;
    }

}
