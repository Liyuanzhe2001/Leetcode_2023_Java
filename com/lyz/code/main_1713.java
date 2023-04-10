package com.lyz.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class main_1713 {

    public static void main(String[] args) {
//        int[] target = new int[]{5, 1, 3}, arr = {9, 4, 2, 3, 4};
        int[] target = new int[]{6, 4, 8, 1, 3, 2}, arr = {4, 7, 6, 2, 3, 8, 6, 1};
        System.out.println(new main_1713().minOperations(target, arr));
    }

    public int minOperations(int[] target, int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < target.length; i++) {
            map.put(target[i], i);
        }

        List<Integer> list = new ArrayList<>();
        for (int k : arr) {
            if (map.containsKey(k)) {
                list.add(map.get(k));
            }
        }

        int[] dp = new int[list.size()];
        dp[0] = 1;
        int res = 1;
        for (int i = 1; i < list.size(); i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (list.get(i) > list.get(j)) {
                    max = Math.max(max, dp[j]);
                }
            }
            dp[i] = max + 1;
            res = Math.max(res, dp[i]);
        }

        return target.length - res;

    }

}
