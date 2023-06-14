package com.lyz.code;

public class main_1375 {

    public int numTimesAllBlue(int[] flips) {
        int pre = 0;
        boolean[] visited = new boolean[flips.length + 1];
        visited[0] = true;
        int res = 0;
        for (int i = 0; i < flips.length; i++) {
            visited[flips[i]] = true;
            while (pre + 1 < visited.length && visited[pre + 1]) {
                pre++;
            }
            if (pre == i + 1) {
                res++;
            }
        }
        return res;
    }

}
