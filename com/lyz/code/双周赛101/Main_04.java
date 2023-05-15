package com.lyz.code.双周赛101;

import java.util.*;

public class Main_04 {

    public static void main(String[] args) {
        int n = 8;
        int[][] edge = {{1, 3}, {3, 5}, {5, 7}, {7, 1}, {0, 2}, {2, 4}, {4, 0}, {6, 0}, {6, 1}};
        System.out.println(new Main_04().findShortestCycle(n, edge));
    }

    /*
7
[[0,1],[1,2],[2,0],[3,4],[4,5],[5,6],[6,3]]
4
[[0,1],[0,2]]
5
[[0,2],[2,4],[4,0]]
6
[[1,3],[3,5],[5,1]]
8
[[1,3],[3,5],[5,7],[7,1],[0,2],[2,4],[4,0],[6,0],[6,1]]
     */


    int[] set;
    int[] count;

    public int find(int x) {
        if (set[x] == x) {
            return x;
        }
        set[x] = find(set[x]);
        return set[x];
    }


    public int findShortestCycle(int n, int[][] edges) {
        set = new int[n];
        count = new int[n];
        for (int i = 0; i < n; i++) {
            set[i] = i;
            count[i] = 1;
        }
        int a, b;
        for (int[] edge : edges) {
            if (edge[0] > edge[1]) {
                int tmp = edge[0];
                edge[0] = edge[1];
                edge[1] = tmp;
            }
            a = find(edge[0]);
            b = find(edge[1]);
            if (a != b) {
                set[b] = a;
                count[a] += count[b];
            }
        }
        System.out.println(Arrays.toString(count));
        int min = Integer.MAX_VALUE;
        for (int i : count) {
            if (i != 1) {
                min = Math.min(i, min);
            }
        }
        if (min == Integer.MAX_VALUE) {
            return -1;
        }
        return min;
    }

    // 5
    //[[0,2],[2,4],[4,0]]

}
