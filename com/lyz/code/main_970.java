package com.lyz.code;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class main_970 {

    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        int bound = 10;
        List<Integer> list = new main_970().powerfulIntegers(x, y, bound);
        System.out.println(list);
    }

    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        int[] xs = new int[21];
        int[] ys = new int[21];
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 21; i++) {
            if (xs[i] == 0) {
                xs[i] = (int) Math.pow(x, i);
            }
            if (xs[i] > bound) {
                break;
            }
            for (int j = 0; j < 21; j++) {
                if (ys[j] == 0) {
                    ys[j] = (int) Math.pow(y, j);
                }
                if (xs[i] + ys[j] <= bound) {
                    set.add(xs[i] + ys[j]);
                } else {
                    break;
                }
            }
        }
        return new ArrayList<>(set);
    }

}
