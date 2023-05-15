package com.lyz.code.双周赛101;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main_03 {

    public static void main(String[] args) {
        int[] arr = {2, 5, 5, 7};
        int k = 3;
        System.out.println(new Main_03().makeSubKSumEqual(arr, k));
    }

    public long makeSubKSumEqual(int[] arr, int k) {
        long res = 0;
        boolean[] visited = new boolean[arr.length];
        for (int i = 0; i < k; i++) {
            if (visited[i]) {
                continue;
            }
            List<Integer> list = new ArrayList<>();
            int index = (i + k) % arr.length;
            list.add(arr[i]);
            visited[i] = true;
            while (!visited[index]) {
                visited[index] = true;
                list.add(arr[index]);
                index = (index + k) % arr.length;
            }
            list.sort((Comparator.comparingInt(o -> o)));
            Integer mid = list.get(list.size() / 2);
            for (Integer v : list) {
                res += Math.abs(mid - v);
            }
        }
        return res;
    }

}
