package com.lyz.code;

import java.util.HashMap;

public class main_1640 {

    public static void main(String[] args) {
        int[] arr = {15, 88};
        int[][] pieces = {{88}, {50}};
        System.out.println(new main_1640().canFormArray(arr, pieces));
    }

    public boolean canFormArray(int[] arr, int[][] pieces) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        int sum = arr.length;
        for (int[] piece : pieces) {
            if (map.containsKey(piece[0])) {
                int index = map.get(piece[0]);
                for (int i = index; i < index + piece.length; i++) {
                    if (i < 0 || i >= arr.length) {
                        return false;
                    }
                    if (piece[i - index] == arr[i]) {
                        sum--;
                    } else {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        return sum == 0;
    }

}
