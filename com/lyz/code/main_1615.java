package com.lyz.code;

public class main_1615 {
    public static void main(String[] args) {
//        int n = 4;
//        int[][] roads = {{0, 1}, {0, 3}, {1, 2}, {1, 3}};
        int n = 8;
        int[][] roads = {{0, 1}, {1, 2}, {2, 3}, {2, 4}, {5, 6}, {5, 7}};
        System.out.println(new main_1615().maximalNetworkRank(n, roads));
    }

    public int maximalNetworkRank(int n, int[][] roads) {
        if (roads.length == 0) {
            return 0;
        }
        boolean[][] thought = new boolean[n][n];
        int[] path = new int[n];
        for (int[] road : roads) {
            path[road[0]]++;
            path[road[1]]++;
            thought[road[0]][road[1]] = thought[road[1]][road[0]] = true;
        }

        int res = 0;
        for (int i = 0; i < path.length; i++) {
            for (int j = i + 1; j < path.length; j++) {
                res = Math.max(res, path[i] + path[j] - (thought[i][j] ? 1 : 0));
            }
        }
        return res;
    }
}
