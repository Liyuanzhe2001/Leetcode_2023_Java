package com.lyz.code.周赛339;

import java.util.*;

public class Main_02 {

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 1, 2, 3, 1};
        System.out.println(new Main_02().findMatrix(nums));
    }

    public List<List<Integer>> findMatrix(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            max = Math.max(map.get(num), max);
        }
        List res = new ArrayList<List<Integer>>();
        for (int i = 0; i < max; i++) {
            List tmp = new ArrayList<Integer>();
            Set<Integer> set = new HashSet<>(map.keySet());
            for (Integer key : set) {
                tmp.add(key);
                Integer value = map.get(key);
                if (value == 1) {
                    map.remove(key);
                } else {
                    map.put(key, value - 1);
                }
            }
            res.add(tmp);
        }
        return res;
    }

}
