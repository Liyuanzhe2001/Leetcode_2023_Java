package com.lyz.code;

public class main_2391 {

    public static void main(String[] args) {

    }

    public int garbageCollection(String[] garbage, int[] travel) {
        int res = garbage[0].length();
        boolean[] visit = new boolean[3];
        for (int i = garbage.length - 1; i > 0; i--) {
            res += garbage[i].length();
            if (garbage[i].contains("M")) {
                visit[0] = true;
            }
            if (garbage[i].contains("P")) {
                visit[1] = true;
            }
            if (garbage[i].contains("G")) {
                visit[2] = true;
            }
            if (visit[0]) {
                res += travel[i - 1];
            }
            if (visit[1]) {
                res += travel[i - 1];
            }
            if (visit[2]) {
                res += travel[i - 1];
            }
        }
        return res;
    }

}
