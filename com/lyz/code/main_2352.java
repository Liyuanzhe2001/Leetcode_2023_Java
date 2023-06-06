package com.lyz.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main_2352 {

    public static void main(String[] args) {

    }

    public int equalPairs(int[][] grid) {
        Map<String, Integer> map = new HashMap<>();
        for (int[] ints : grid) {
            String tmp = "";
            for (int anInt : ints) {
                tmp += "-" + anInt;
            }
            map.put(tmp, map.getOrDefault(tmp, 0) + 1);
        }

        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            String tmp = "";
            for (int j = 0; j < grid[i].length; j++) {
                tmp += "-" + grid[j][i];
            }
            if (map.containsKey(tmp)) {
                res += map.get(tmp);
            }
        }
        return res;
    }

}
