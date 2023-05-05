package com.lyz.code;

public class main_2432 {

    public static void main(String[] args) {
        int[][] logs = {{36, 3}, {1, 5}, {12, 8}, {25, 9}, {53, 11}, {29, 12}, {52, 14}};
        int n = 70;
        System.out.println(new main_2432().hardestWorker(n, logs));
    }

    public int hardestWorker(int n, int[][] logs) {
        int max = -1;
        int maxId = -1;
        int start = 0;
        for (int[] log : logs) {
            if (log[1] - start >= max) {
                maxId = Math.min(maxId, log[0]);
                max = log[1] - start;
            }
            start = log[1];
        }
        return maxId;
    }

}
