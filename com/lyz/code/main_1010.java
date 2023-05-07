package com.lyz.code;

import java.util.HashMap;

public class main_1010 {

    public static void main(String[] args) {

    }

    public int numPairsDivisibleBy60(int[] time) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int cnt = 0;
        for (int i = time.length - 1; i >= 0; i--) {
            for (Integer key : map.keySet()) {
                if ((map.get(key) + time[i]) % 60 == 0) {
                    cnt += map.get(key);
                }
            }
            map.put(time[i], map.getOrDefault(time[i], 0) + 1);
        }
        return cnt;
    }

}
