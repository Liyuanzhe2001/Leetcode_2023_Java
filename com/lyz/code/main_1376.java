package com.lyz.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main_1376 {

    public static void main(String[] args) {

    }

    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.putIfAbsent(manager[i], new ArrayList<>());
            map.get(manager[i]).add(i);
        }
        return dfs(headID, informTime, map);
    }

    public int dfs(int cur, int[] informTime, Map<Integer, List<Integer>> map) {
        int res = 0;
        if (map.containsKey(cur)) {
            for (int i : map.get(cur)) {
                res = Math.max(res, dfs(i, informTime, map));
            }
        }
        return informTime[cur] + res;
    }
}
