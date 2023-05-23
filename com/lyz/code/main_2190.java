package com.lyz.code;

import java.util.*;

public class main_2190 {

    public static void main(String[] args) {

    }

    public int mostFrequent(int[] nums, int key) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == key) {
                map.put(nums[i + 1], map.getOrDefault(nums[i + 1], 0) + 1);
                i++;
            }
        }
        System.out.println(map);
        int maxK = -1;
        int maxV = -1;
        for (Integer mKey : map.keySet()) {
            Integer value = map.get(mKey);
            if (value > maxV) {
                maxK = mKey;
                maxV = value;
            }
        }
        return maxK;
    }

}
