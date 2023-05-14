package com.lyz.code.周赛345;

import java.util.Arrays;

public class Main_01 {

    public static void main(String[] args) {
        int n = 4, k = 1;
        System.out.println(Arrays.toString(new Main_01().circularGameLosers(n, k)));
    }

    public int[] circularGameLosers(int n, int k) {
        boolean[] visited = new boolean[n];
        int index = 0;
        int len = 0;
        int tmp = k;
        while (true) {
            if (visited[index % n]) {
                break;
            } else {
                len++;
                visited[index % n] = true;
                index += k;
                k += tmp;
            }
        }
        int[] res = new int[n - len];
        int r = 0;
        for (int i = 1; i < visited.length; i++) {
            if (!visited[i]) {
                res[r++] = i + 1;
            }
        }
        return res;
    }

    // 0 1 2 3

}
