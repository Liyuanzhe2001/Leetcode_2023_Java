package com.lyz.code;

import java.util.ArrayList;
import java.util.List;

public class main_1377 {

    public static void main(String[] args) {

    }

    public double frogPosition(int n, int[][] edges, int t, int target) {
        List<Integer>[] lists = new ArrayList[n + 1];
        for (int i = 0; i < lists.length; i++) {
            lists[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            lists[edge[0]].add(edge[1]);
            lists[edge[1]].add(edge[0]);
        }
        return dfs(lists, new boolean[n + 1], 1, t, target);

    }

    public double dfs(List<Integer>[] lists, boolean[] visited, int n, int t, int target) {
        double nextSize = n == 1 ? lists[n].size() : lists[n].size() - 1;
        if (t == 0 || nextSize == 0) {
            if (target == n) {
                return 1.0;
            } else {
                return 0.0;
            }
        }
        visited[n] = true;
        double ans = 0;
        for (Integer ll : lists[n]) {
            if (!visited[ll]) {
                ans += dfs(lists, visited, ll, t - 1, target);
            }
        }
        return ans / nextSize;
    }

}
