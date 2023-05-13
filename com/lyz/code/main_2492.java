package com.lyz.code;

import java.util.ArrayList;
import java.util.List;

public class main_2492 {

    public static void main(String[] args) {

    }

    public int minScore(int n, int[][] roads) {
        List<int[]>[] graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] road : roads) {
            graph[road[0]].add(new int[]{road[1], road[2]});
            graph[road[1]].add(new int[]{road[0], road[2]});
        }
        return dfs(graph, 1, new boolean[n+1]);
    }

    private int dfs(List<int[]>[] graph, int now, boolean[] visited) {
        int min = Integer.MAX_VALUE;
        visited[now] = true;
        for (int[] to : graph[now]) {
            min = Math.min(min, to[1]);
            if (!visited[to[0]]) {
                min = Math.min(min, dfs(graph, to[0], visited));
            }
        }
        return min;
    }

}
