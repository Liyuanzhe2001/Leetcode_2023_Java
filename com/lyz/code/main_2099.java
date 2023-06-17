package com.lyz.code;

import java.util.*;

public class main_2099 {

    class Pair {
        int index;
        int num;

        public Pair(int index, int num) {
            this.index = index;
            this.num = num;
        }
    }

    public int[] maxSubsequence(int[] nums, int k) {
        Queue<Pair> queue = new PriorityQueue<>(((o1, o2) -> (o2.num - o1.num))) {{
            for (int i = 0; i < nums.length; i++) {
                add(new Pair(i, nums[i]));
            }
        }};
        List<Pair> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            list.add(queue.poll());
        }
        list.sort(Comparator.comparingInt(o -> o.index));
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = list.get(i).num;
        }
        return res;
    }

}
